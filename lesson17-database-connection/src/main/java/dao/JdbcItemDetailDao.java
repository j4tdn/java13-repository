package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DbConnection;

public class JdbcItemDetailDao implements ItemDetailDao{
	
	private Connection conn;
	private PreparedStatement pst;
	
	public JdbcItemDetailDao() {
		conn = DbConnection.getConnection();
	}
	
	@Override
	public boolean doTransfer() {
		int r1 = 0;
		int r2 = 0;
		String sql = "UPDATE ChiTietMatHang\n"
				   + "SET SoLuong = ?\n"
				   + "WHERE MaMH = ?\n"
				   + "AND MaKC = ?";
		try {
			conn.setAutoCommit(false);
			// 1, L, 80->88
			pst = conn.prepareStatement(sql);
			pst.setInt(1, 444);
			pst.setInt(2, 1);
			pst.setString(3, "L");
			r1 = pst.executeUpdate();
			
			// 1, M, 40->88
			sql += "hellohala";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, 88);
			pst.setInt(2, Integer.parseInt("x1y2"));
			pst.setString(3, "M");
			r2 = pst.executeUpdate();
			
			conn.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception exe) {
				exe.printStackTrace();
			}
		}
		System.out.println("r1," + r1 +" - r2," + r2);
		return r1 > 0 & r2 > 0;
	}
}
