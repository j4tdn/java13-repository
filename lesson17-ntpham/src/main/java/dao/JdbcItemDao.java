package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.HighestPriceItemDto;
import persistence.ItemCountDto;
import persistence.ItemDto;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao{
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	private final Connection conn;
	
	private static final String Q_GET_ITEM_BY_DATE = ""
			+ "SELECT mh.MaMH, mh.TenMH, ctttdh.ThoiGian\n"
			+ "FROM MatHang mh\n"
			+ "JOIN chitietdonhang ctdh\n"
			+ "ON mh.MaMH = ctdh.MaMH\n"
			+ "JOIN chitiettinhtrangdonhang ctttdh\n"
			+ "ON ctttdh.MaDH = ctdh.MaDH\n"
			+ "WHERE CAST(ctttdh.ThoiGian AS DATE) = ?";
	
	private static final String Q_COUNT_SALE_ITEM_BY_YEAR = ""
			+ "SELECT MH.MaMH, MH.TenMH, SUM(CTDH.SoLuong) AS SoLuong\n"
			+ "FROM MatHang AS MH\n"
			+ "INNER JOIN ChiTietDonHang AS CTDH\n"
			+ "ON MH.MaMH = CTDH.MaMH\n"
			+ "INNER JOIN DonHang AS DH\n"
			+ "ON CTDH.MaDH = DH.MaDH\n"
			+ "WHERE CAST(YEAR(DH.ThoiGianDatHang) AS CHAR) = ?\n"
			+ "GROUP BY MH.MaMH\n"
			+ "ORDER BY SoLuong DESC, MH.MaMH \n"
			+ "LIMIT 3";
	
	private static final String Q_HIGHEST_PRICE_ITEM_OF_ITEM_GROUP = ""
			+ "SELECT MH.*, CTMH.GiaBan FROM MatHang AS MH\n"
			+ "INNER JOIN ChiTietMatHang AS CTMH\n"
			+ "ON MH.MaMH = CTMH.MaMH\n"
			+ "JOIN (\n"
			+ "SELECT MH.MaLH, MAX(CTMH.GiaBan) AS GiaBanCaoNhat FROM MatHang AS MH\n"
			+ "INNER JOIN ChiTietMatHang AS CTMH\n"
			+ "ON MH.MaMH = CTMH.MaMH\n"
			+ "GROUP BY MH.MaLH ) AS GBCN\n"
			+ "ON GBCN.MaLH = MH.MaLH\n"
			+ "WHERE CTMH.GiaBan = GBCN.GiaBanCaoNhat";
	
	public JdbcItemDao() {
		conn = DbConnection.getConnection();
	}

	@Override
	public List<ItemDto> get(LocalDate date) {
		List<ItemDto> result = new ArrayList<>();
		try {
			pst = conn.prepareStatement(Q_GET_ITEM_BY_DATE);
			pst.setDate(1, Date.valueOf(date));
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemDto itemDto = new ItemDto(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getTime("ThoiGian").toLocalTime());
				result.add(itemDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}

	@Override
	public List<ItemCountDto> count(String year) {
		List<ItemCountDto> result = new ArrayList<>();
		try {
			pst = conn.prepareStatement(Q_COUNT_SALE_ITEM_BY_YEAR);
			pst.setString(1, year);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemCountDto temCountDto = new ItemCountDto(
													rs.getInt("MaMH"), 
													rs.getString("TenMH"), 
													rs.getInt("SoLuong"));
				result.add(temCountDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}

	@Override
	public List<HighestPriceItemDto> getHighestPriceItem() {
		List<HighestPriceItemDto> result = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(Q_HIGHEST_PRICE_ITEM_OF_ITEM_GROUP);
			while (rs.next()) {
				HighestPriceItemDto highestPriceItem = new HighestPriceItemDto(
															rs.getInt("MaMH"),
															rs.getString("TenMH"),
															rs.getString("MauSac"),
															rs.getInt("MaLH"),
															rs.getInt("GiaBan")
														);
				result.add(highestPriceItem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return result;
	}
	
	
}
