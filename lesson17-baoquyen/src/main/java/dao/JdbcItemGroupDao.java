package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.ItemGroupDto;
import utils.SqlUtils;
public class JdbcItemGroupDao implements ItemGroupDao{
	PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	private Connection conn;

	public JdbcItemGroupDao() {
		conn = DBConnection.getConnecttion();
	}
	
	public List<ItemGroupDto> getItems() {
		List<ItemGroupDto> result = new ArrayList<ItemGroupDto>();
		String sql = "SELECT mh.MaLH,\n" + "lh.TenLH,\n"
				+ "SUM(ctmh.SoLuong) AS TongSoLuong \n" + "FROM chitietmathang ctmh\n"
				+ "JOIN mathang mh ON ctmh.MaMH = mh.MaMH\n" + "JOIN loaihang lh ON mh.MaLH = lh.MaLH\n"
				+ "GROUP BY lh.MaLH";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroupDto itemGroupDto = new ItemGroupDto(rs.getInt("MaLH"), rs.getString("TenLH"),
						 rs.getInt("TongSoLuong"));
				result.add(itemGroupDto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
}
