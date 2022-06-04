package dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import connection.DBConnection;
import persistence.CategoryDto;
import persistence.ItemDto;
import utils.SqlUtils;

public class CategoryDao {
	
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement preStatement;
	private static ResultSet rs;
	
	static {
		conn = DBConnection.getConnection();
	}
	
	public List<CategoryDto> getInventory(){
		List<CategoryDto> result = new ArrayList<>();
		CategoryDto categoryDto = null;
		String sql = "SELECT h.MaLH, h.TenLH, SUM(SoLuong) SoLuong FROM loaihang h\r\n"
				+ "JOIN mathang m\r\n"
				+ "ON h.MaLH = m.MaLH\r\n"
				+ "JOIN chitietmathang c\r\n"
				+ "ON m.MaMH = c.MaMH\r\n"
				+ "GROUP BY h.MaLH";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				categoryDto = new CategoryDto(rs.getInt("MaLH"), rs.getString("TenLH"), rs.getInt("SoLuong"));
				result.add(categoryDto);
			}
		} catch (SQLException e) {
			SqlUtils.close(rs, st);
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<String> getTopItemByYear(String year){
		List<String> result = new ArrayList<>();
		String sql = "SELECT m.MaMH, TenMH, SUM(SoLuong) SoLuong FROM chitietdonhang c\r\n"
				+ "JOIN donhang d\r\n"
				+ "ON c.MaDH = d.MaDH\r\n"
				+ "JOIN mathang m\r\n"
				+ "ON c.MaMH = m.MaMH\r\n"
				+ "WHERE YEAR(ThoiGianDatHang) = ?\r\n"
				+ "GROUP BY (m.MaMH)\r\n"
				+ "ORDER BY SoLuong DESC, m.MaMH\r\n"
				+ "LIMIT 3";
		try {
			preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, year);
			rs = preStatement.executeQuery();
			while(rs.next()) {
				result.add(rs.getString("TenMH"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, preStatement);
		}
		return result;
	}
	
	public List<ItemDto> getItemDtos(){
		List<ItemDto> result = new ArrayList<>();
		ItemDto itemDto = null;
		String sql = "SELECT * FROM mathang m\r\n"
				+ "JOIN loaihang l\r\n"
				+ "ON m.MaLH = l.MaLH\r\n"
				+ "JOIN chitietmathang c\r\n"
				+ "ON c.MaMH = m.MaMH";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				itemDto = new ItemDto(
						rs.getInt("MaLH"),
						rs.getString("TenLH"),
						rs.getInt("MaMH"),
						rs.getString("TenMH"),
						rs.getInt("GiaBan"),
						rs.getInt("GiaMua"),
						rs.getInt("SoLuong")
						);
				result.add(itemDto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	
	
}
