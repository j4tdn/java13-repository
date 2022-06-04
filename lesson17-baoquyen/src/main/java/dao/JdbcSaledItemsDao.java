package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.SaledItems;
import utils.SqlUtils;

public class JdbcSaledItemsDao implements SalesdItemsDao {
	
	PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	private Connection conn;
	
	public JdbcSaledItemsDao() {
		conn = DBConnection.getConnecttion();
	}
	
	public List<SaledItems> findItemBySalesDate(LocalDate date) {
		List<SaledItems> items = new ArrayList<SaledItems>();
		String sql = "SELECT mh.MaMH,\n"
				+ "mh.TenMH,\n"
				+ "cast(dh.ThoiGianDatHang AS TIME)  as ThoiGianDatHang\n"
				+ "FROM mathang mh\n"
				+ "JOIN chitietdonhang ctmh ON mh.MaMH = ctmh.MaMH\n"
				+ "JOIN donhang dh ON dh.MaDH = ctmh.MaDH\n"
				+ "WHERE cast(dh.ThoiGianDatHang AS DATE)=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1,date.toString());
			rs = pst.executeQuery();
			while(rs.next()) {
				SaledItems item = new SaledItems(rs.getInt("MaMH"),rs.getString("TenMH"), LocalTime.parse(rs.getString("ThoiGianDatHang")));
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
