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
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao{
	
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	private final Connection conn;
	
	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT * FROM LoaiHang";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			// replace by ORM mapping
			while(rs.next()) {
				ItemGroup itemGroup = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
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
	public ItemGroup get(int id) {
		ItemGroup itemGroup = null;
		String sql = "SELECT * FROM LoaiHang WHERE MaLH = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				itemGroup = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return itemGroup;
	}
	
	@Override
	public int save(ItemGroup itemGroup) {
		String sql = "INSERT INTO LoaiHang(MaLH, TenLH)\n"
				   + "VALUES(?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			return pst.executeUpdate();
		} catch (SQLException e) { // batch bunch
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		return -1;
	}
	
	@Override
	public int[] save(List<ItemGroup> itemGroups) {
		String sql = "INSERT INTO LoaiHang(MaLH, TenLH)\n"
				   + "VALUES(?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			for (ItemGroup itemGroup: itemGroups) {
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
			}
			return pst.executeBatch();
		} catch (Exception e) {
			System.out.println("Duplicated values");
		} finally {
			SqlUtils.close(pst);
		}
		return null;
	}
	
	@Override
	public int update(ItemGroup itemGroup) {
		String sql = "UPDATE LoaiHang\n"
				   + "SET TenLH = ?\n"
				   + "WHERE MaLH = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, itemGroup.getName());
			pst.setInt(2, itemGroup.getId());
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		return -1;
	}
	
	@Override
	public ItemGroup get(String name) {
		ItemGroup itemGroup = null;
		String sql = "SELECT * FROM LoaiHang WHERE TenLH = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			if(rs.next()) {
				itemGroup = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return itemGroup;
	}

	@Override
	public List<ItemGroupDto> getItemsByItemGroup() {
		List<ItemGroupDto> result = new ArrayList<>();
		String sql = 
				"SELECT mh.MaLH,\n" 
				+ "     lh.TenLH,\n"
			    + "     GROUP_CONCAT(CONCAT(mh.TenMH, ' - ', ctmh.MaKC, ' - ', ctmh.SoLuong)) DanhSachMatHang,\n" 
				+ "		SUM(ctmh.SoLuong) TongSoLuong\n"
				+ " FROM MatHang mh\n"
				+ " JOIN LoaiHang lh\n" 
				+ "		ON mh.MaLH = lh.MaLH\n"
				+ " JOIN ChiTietMatHang ctmh\n"
				+ "     ON mh.MaMH = ctmh.MaMH\n"
				+ "	GROUP BY mh.MaLH;";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ItemGroupDto igDto = new ItemGroupDto(
						rs.getInt("MaLH"),
						rs.getString("TenLH"),
						rs.getString("DanhSachMatHang"),
						rs.getInt("TongSoLuong"));
				result.add(igDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
}
