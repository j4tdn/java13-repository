package dao.ex02;

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
	
	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}
	
	private static String sql =
			"SELECT mh.MaLH,\n"
			+ "     lh.TenLH,\n"		
			+ "     SUM(ctmh.SoLuong) SoLuong\n"
			+ "FROM MatHang mh\n"
			+ "JOIN LoaiHang lh ON lh.MaLH = mh.MaLH\n"
			+ "JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH\n"
			+ "GROUP BY mh.MaLH;";

	@Override
	public List<ItemGroupDto> getItemByItemGroup() {
		List<ItemGroupDto> result = new ArrayList<>();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				ItemGroupDto itemGroupDto = new ItemGroupDto(rs.getInt("MaLH"),
															 rs.getString("TenLH"),
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
