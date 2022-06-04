package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.Item;
import persistence.ItemGroup;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao {

	PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	private Connection conn;
	
	public JdbcItemDao() {
		conn = DBConnection.getConnecttion();
	}
	
	@Override
	public List<Item> findItemsByItemGroupName(String name) {
		List<Item> items = new ArrayList<Item>();
		String sql = "SELECT mh.*, lh.TenLH FROM MatHang mh\n"
				+ "JOIN LoaiHang lh\n"
				+ "ON mh.MaLH = lh.MaLH\n"
				+ "WHERE lh.TenLH = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemGroup iGroup = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
				Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"),rs.getString("MauSac"),iGroup);
				items.add(item);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return items;
	}
}
