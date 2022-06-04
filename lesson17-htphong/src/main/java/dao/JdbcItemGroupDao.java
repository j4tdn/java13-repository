package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import util.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {
	
	private Statement st;
	private ResultSet rs;
	private final Connection conn;
	
	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}
	
	@Override
	public List<ItemGroup> getAllByItemGroup() {
		List<ItemGroup> result = new ArrayList<>();
		String sql  = "SELECT mh.MaLH, lh.TenLH, SUM(ct.SoLuong) as SoLuong FROM MatHang mh\n"
				+"Join ChiTietMatHang ct\n"
				+"On mh.MaMH = ct.MaMH\n"
				+"Join LoaiHang lh\n"
				+"On lh.MaLH = mh.MaLH\n"
				+"GRoup by lh.MaLH";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				ItemGroup itemGroup = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"), rs.getInt("SoLuong"));
				result.add(itemGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
		
	}
	@Override
	public List<ItemGroupDto> getItemByItemGroup() {
		List<ItemGroupDto> result = new ArrayList<>();
		String sql  = "SELECT mh.MaLH, lh.TenLH, mh.MaMH, mh.TenMH, ct.GiaBan, ct.GiaMua, ct.SoLuong FROM MatHang mh\n"
				+"Join ChiTietMatHang ct\n"
				+"On mh.MaMH = ct.MaMH\n"
				+"Join LoaiHang lh\n"
				+"On lh.MaLH = mh.MaLH\n"
				+"Group by mh.MaMH";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				ItemGroupDto itemGroupDto = new ItemGroupDto(rs.getInt("MaLH"), rs.getString("TenLH"),rs.getInt("MaMH"),rs.getString("TenMH"),rs.getDouble("GiaBan"), rs.getDouble("GiaMua"), rs.getInt("SoLuong"));
				result.add(itemGroupDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
}
