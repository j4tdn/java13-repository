package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import utils.SqlUtils;

public class JdbcItemDetailDao implements ItemDetailDao {

	private Connection conn;
	private PreparedStatement pst;
	
	public JdbcItemDetailDao() {
		conn = DBConnection.getConnecttion();
	}
	
	@Override
	public boolean doTranfer() {
		String sql = "UPDATE ChiTietMatHang\n"
				+ "SET SoLuong = ? \n"
				+ "WHERE MaMH = ?\n"
				+ "AND MAKC = ?";
		int r1 = 0, r2 = 0;
		try {
			conn.setAutoCommit(false);
			pst = conn.prepareStatement(sql);
			pst.setInt(1, 40);
			pst.setInt(2, 1);
			pst.setString(3, "L");
			r1 = pst.executeUpdate();
			
			pst.setInt(1, 80);
			pst.setInt(2, 1);
			pst.setString(3, "M");
			r2 = pst.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} finally {
			SqlUtils.close(pst);
		}
		System.out.println("r1: " + r1 + " -r2: " + r2);
		return r1 > 0 & r2 > 0;
	}
}
