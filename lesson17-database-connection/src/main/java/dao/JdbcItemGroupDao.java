package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {

	PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	private Connection conn;

	public JdbcItemGroupDao() {
		conn = DBConnection.getConnecttion();
	}

	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		String sql = "SELECT * FROM loaihang";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
//				System.out.print(rs.getInt("MaLH") + " - " + rs.getString("TenLH"));
//				System.out.println();
				ItemGroup item = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
				result.add(item);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	@Override
	public ItemGroup getItemGroup(int id) {
		ItemGroup result = null;
		String sql = "SELECT * FROM LoaiHang WHERE MaLH = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
//				System.out.print(rs.getInt("MaLH") + " - " + rs.getString("TenLH"));
//				System.out.println();
				result = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	@Override
	public int save(ItemGroup itemGroup) {
		// String sql = "INSERT INTO LoaiHang(MaLH,TenLH) Values("+ itemGroup.getId() +
		// ","+ itemGroup.getName()+ ") ";
		String sql = "INSERT INTO LoaiHang(MaLH, TenLH)" + "\nVALUES(?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			return pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		return -1;
	}

	@Override
	public int[] save(List<ItemGroup> itemGroups) {
		String sql = "INSERT INTO LoaiHang(MaLH, TenLH)" + "\nVALUES(?,?)";
		try {
			pst = conn.prepareStatement(sql);
			for (ItemGroup itemGroup : itemGroups) {
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
			}
			return pst.executeBatch();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		return null;
	}

	@Override
	public int update(ItemGroup itemGroup) {
		String sql = "UPDATE LoaiHang SET TenLH = ?\n" + "WHERE MaLH = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, itemGroup.getName());
			pst.setInt(2, itemGroup.getId());
			return pst.executeUpdate();
		} catch (Exception ex) {
//			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} finally {
			SqlUtils.close(pst);
		}
		return -1;
	}

	@Override
	public ItemGroup getItemGroup(String name) {
		ItemGroup result = null;
		String sql = "SELECT * FROM LoaiHang WHERE TenLH = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			while (rs.next()) {
//				System.out.print(rs.getInt("MaLH") + " - " + rs.getString("TenLH"));
//				System.out.println();
				result = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}

	@Override
	public List<ItemGroupDto> getItemsByItemGroup() {
		List<ItemGroupDto> result = new ArrayList<ItemGroupDto>();
		String sql = "SELECT mh.MaLH,\n" + "lh.TenLH,\n"
				+ "GROUP_CONCAT(concat(mh.TenMH, ' - ', ctmh.MaKC, ' - ', ctmh.SoLuong)) AS ThongTin,\n"
				+ "SUM(ctmh.SoLuong) AS TongSoLuong \n" + "FROM chitietmathang ctmh\n"
				+ "JOIN mathang mh ON ctmh.MaMH = mh.MaMH\n" + "JOIN loaihang lh ON mh.MaLH = lh.MaLH\n"
				+ "GROUP BY lh.MaLH";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroupDto itemGroupDto = new ItemGroupDto(rs.getInt("MaLH"), rs.getString("TenLH"),
						rs.getString("ThongTin"), rs.getInt("TongSoLuong"));
				result.add(itemGroupDto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
}
