package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao{
	private Statement st; 
	private ResultSet rs;
	private final Connection conn;
	
	private static final String Q_COUNT_ITEM_OF_ITEM_GROUP = ""
			+ "SELECT LH.MaLH, LH.TenLH,\n"
			+ "GROUP_CONCAT(CONCAT(TenMH, '-', CTMH.MaKC, '-', CTMH.SoLuong) SEPARATOR ', ') AS DanhSachMatHang,\n"
			+ "SUM(CTMH.SoLuong) AS SoLuong\n"
			+ "FROM LoaiHang AS LH\n"
			+ "INNER JOIN MatHang AS MH\n"
			+ "ON MH.MaLH = LH.MaLH\n"
			+ "INNER JOIN ChiTietMatHang AS CTMH\n"
			+ "ON MH.MaMH = CTMH.MaMH\n"
			+ "GROUP BY LH.MaLH";
	
	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}

	@Override
	public List<ItemGroupDto> count() {
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(Q_COUNT_ITEM_OF_ITEM_GROUP);
			while (rs.next()) {
				ItemGroupDto itemGroupDto = new ItemGroupDto(
												rs.getInt("MaLH"), 
												rs.getString("TenLH"), 
												rs.getString("DanhSachMatHang"),
												rs.getInt("SoLuong"));
				result.add(itemGroupDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return result;
	}
}
