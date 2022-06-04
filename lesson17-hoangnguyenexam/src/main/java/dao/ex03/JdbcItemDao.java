package dao.ex03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao{
	
	private PreparedStatement pst;
	private ResultSet rs;
	private final Connection conn;
	
	public JdbcItemDao() {
		conn = DbConnection.getConnection();
	} 
	
	private static String sql = "SELECT mh.MaMH,\n"
								+ "     mh.TenMH,\n"		
								+ "     ctmh.SoLuong\n"
								+ "FROM MatHang mh\n"
								+ "JOIN LoaiHang lh ON lh.MaLH = mh.MaLH\n"
								+ "JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH\n"
								+ "JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH\n"
								+ "JOIN ChiTietTinhTrangDonHang ctttdh ON ctdh.MaDH = ctttdh.MaDH\n"
								+ "WHERE YEAR(ctttdh.ThoiGian) = ?\n"
								+ "ORDER BY ctdh.SoLuong DESC\n"
								+ "LIMIT 3;";

	@Override
	public List<String> getItemByYear(int year) {
		List<String> result = new ArrayList<>();
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, year);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				result.add(rs.getString("TenMH"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(sql);
	}

}
