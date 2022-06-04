package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemGroup;
import util.SqlUtils;

public class JdbcItemDao implements ItemDao {
	private Statement st;
	private ResultSet rs;
	private final Connection conn;
	
	public JdbcItemDao() {
		conn = DbConnection.getConnection();
	}
	@Override
	public List<String> getTopThreeItem() {
		List<String> result = new ArrayList<>();
		
		String sql  = "SELECT mh.MaMH, mh.TenMH, SUM(ct.SoLuong) as SoLuong FROM MatHang mh\n"
				+"Join ChiTietDonHang ct\n"
				+"On mh.MaMH = ct.MaMH\n"			
				+"GRoup by mh.MaMH\n"
				+"Order by SoLuong DESC, MaMH ASC\n"
				+"Limit 3";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String item = rs.getString("TenMH");
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
}
