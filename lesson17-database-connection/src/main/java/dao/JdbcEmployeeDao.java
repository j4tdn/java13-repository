package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnection;
import persistence.Employee;
import persistence.Title;
import utils.SqlUtils;

public class JdbcEmployeeDao implements EmployeeDao{

	private PreparedStatement pst;
	private ResultSet rs;
	private Connection con;
	
	public JdbcEmployeeDao() {
		con = DBConnection.getConnecttion();
	}
	private static final String EMPTY_STRING = "";
	private static final String Q_SIGN_UP = ""
			+ "INSERT INTO NhanVien(TenNV, Email, SDT, DiaChi, MatKhau, MaCV)\n"
			+ "VALUES(?, ?, ?, ?, ?, ?)";
	private static final String Q_SIGN_IN = ""
			+ "SELECT nv.*, cv.TenCV FROM NhanVien nv\n"
			+ "JOIN ChucVu cv \n"
			+ "ON nv.MaCV = cv.MaCV\n"
			+ "WHERE Email = ? AND MatKhau = ?";
	
	@Override
	public boolean signup(String email, String password) {
		
	
		try {
			pst = con.prepareStatement(Q_SIGN_UP);
			pst.setString(1,EMPTY_STRING);
			pst.setString(2, email);
			pst.setString(3, EMPTY_STRING);
			pst.setString(4, EMPTY_STRING);
			pst.setString(5, SqlUtils.md5Hex(password));
			pst.setInt(6, 1);
			return pst.executeUpdate() > 0;
		}catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}	
		return false;
	}
	
	@Override
	public Employee signin(String email, String password) {
		Employee employee = null;
		try {
			pst= con.prepareStatement(Q_SIGN_IN);
			pst.setString(1, email);
			pst.setString(2, SqlUtils.md5Hex(password));
			rs = pst.executeQuery();
			if(rs.next()) {
		    employee = new Employee(rs.getInt("MaNV"),
						rs.getString("TenNV"),
						email,
						rs.getString("SDT"),
						rs.getString("DiaChi"),
						password,
						new Title(rs.getInt("MaCV"), rs.getString("TenCV"))
						);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		
		
		return employee;
	}
}
