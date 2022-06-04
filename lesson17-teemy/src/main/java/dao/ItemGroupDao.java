package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import connection.DbManager;
import persistence.Item;
import persistence.ItemGroup;
import utils.SqlUtils;

public class ItemGroupDao {
	private Connection connection;
	private ResultSet rs;
	private PreparedStatement pst;
	private Statement st;

	public ItemGroupDao() {
		connection = DbManager.getConnection();
	}

	public List<Item> getItems(Date date) {
		List<Item> result = new ArrayList<>();

		String sql = "SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang \n"+
					 "FROM MatHang mh \n"+
					 "JOIN ChiTietDonHang ctdh \n"+
					 "ON mh.MaMH = ctdh.MaMH \n"+ 
					 "JOIN DonHang dh \n"+ 
					 "ON dh.MaDH = ctdh.MaDH \n"+
					 "WHERE CAST(dh.ThoiGianDatHang AS Date) = ? ";
		
		
		try {
			pst = connection.prepareStatement(sql);
			pst.setDate(1, date);
			rs = pst.executeQuery();
			while (rs.next()) {
				Item items = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getTime("ThoiGianDatHang"));
				result.add(items);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
		     
	}


	public List<ItemGroup> getItemsAmount() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT lh.*\n"+
				 "SUM(kcmh.SoLuong) SoLuong\n"+ 
				 "FROM MatHang mh\n"+
				 "JOIN LoaiHang lh\n"+ 
				 " ON  mh.MaLoai = lh.MaLoai\n"+ 
				 "JOIN KichCoMatHang kcmh\n"+
				 " ON  mh.MaMH = kcmh.MaMH \n"+ 
				 "GROUP BY MaLoai";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup item = new ItemGroup(rs.getInt("MaLoai"),rs.getString("TenLoai"), rs.getInt("SoLuong"));
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}


}