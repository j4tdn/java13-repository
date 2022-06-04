package dao.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemByDate;

public class JdbcItemByDate implements ItemByDateDao{
	
	private PreparedStatement pst;
	private ResultSet rs;
	private final Connection conn;
	
	public JdbcItemByDate() {
		conn = DbConnection.getConnection();
	}
	
	private String sql = "SELECT mh.MaMH,\n"
						+ "      mh.TenMH,\n"
						+ "      dh.ThoiGianDatHang\n"
						+ "FROM MatHang mh"
						+ "JOIN DonHang dh ON dh.MaMH = mh.MaMH"
						+ "JOIN ChiTietDonHang ctdh ON ctdh.MaDH = dh.MaDH"
						+ "WHERE CAST(ctdh.ThoiGianDatHang AS DATE) = ?;";
	
	@Override
	public List<ItemByDate> getItemsByDate(LocalDate date) {
		List<ItemByDate> result = new ArrayList<>();
		Date dateSql = Date.valueOf(date);
		try {
			pst = conn.prepareStatement(sql);
			pst.setDate(1, dateSql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				ItemByDate itemByDate = new ItemByDate(rs.getInt("MaMH"),
													   rs.getString("TenMH"),
													   date.ofInstant(new java.util.Date().toInstant(), ZoneId.systemDefault()));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
