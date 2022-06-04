package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.Item;
import utils.SqlUtils;
public class JdbcItemDao implements ItemDao{
	PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	private Connection conn;
	
	public JdbcItemDao() {
		conn = DBConnection.getConnecttion();
	}
	
	@Override
	public List<Item> getBestSaleItem() {
		List<Item> result = new ArrayList<Item>();
		String sql = "SELECT mh.MaMH,\n" 
				+ "mh.TenMH,\n"
				+ "ctdh.SoLuong AS TongSoLuong \n" 
				+ "FROM chitietdonhang ctdh\n"
				+ "JOIN mathang mh ON ctdh.MaMH = mh.MaMH\n"
				+ "ORDER BY SoLuong DESC, mh.MaMH DESC\n"
				+ "LIMIT 3";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"),
						 rs.getInt("TongSoLuong"));
				result.add(item);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
}
