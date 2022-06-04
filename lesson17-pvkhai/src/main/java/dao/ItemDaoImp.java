package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemDetailDto;
import persistence.ItemDto;
import persistence.NumberItemDto;
import utils.SqlUtils;

public class ItemDaoImp implements ItemDao{
	
	private final Connection conn;
	private PreparedStatement preparedStatement;
	private ResultSet rs;

	public ItemDaoImp() {
		conn = DbConnection.getConnection();
	}
	//1
	@Override
	public List<ItemDto> getItem(LocalDate date) {
		List<ItemDto> itemDtos = new ArrayList<>();
		ItemDto itemDto = null;
		
		String sql = "SELECT mh.MaMH, mh.TenMH, CAST(dh.ThoiGianDatHang AS TIME) AS Time\n"
				+ "FROM mathang mh\n" 
				+ "JOIN chitietdonhang ctdh ON mh.MaMH = ctdh.MaMH\n"
				+ "JOIN donhang dh ON dh.MaDH = ctdh.MaDH\n"
				+ "WHERE CAST(dh.ThoiGianDatHang AS DATE) = ?\n";
		
		try {
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
			
			rs = preparedStatement.executeQuery();
			while(rs.next()) {
				itemDto = new ItemDto(rs.getInt("MaMH"), rs.getString("TenMH"), LocalTime.parse(rs.getString("Time"), DateTimeFormatter.ofPattern("HH:mm:ss")));
				
				itemDtos.add(itemDto);
				
			}
			return itemDtos;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, preparedStatement);
		}
		
		
		return itemDtos;
	}

	//4
	@Override
	public List<ItemDetailDto> getItemDetail() {
		List<ItemDetailDto> itemDetails = new ArrayList<>();
		ItemDetailDto itemDetail = null;
		String sql = "SELECT lh.MaLH,\n"
						+ "lh.TenLH,\n"
				   		+ "mh.MaMH,\n"
				   		+ "mh.TenMH,\n"
				   		+ "ctmh.GiaBan,\n"
				   		+ "ctmh.GiaMua,\n"
				   		+ "ctmh.SoLuong\n"
				   + "FROM loaihang lh\n"
				   + "JOIN mathang mh ON lh.MaLH = mh.MaLH\n"
				   + "JOIN chitietmathang ctmh ON ctmh.MaMH = mh.MaMH";
		try {
			preparedStatement = conn.prepareStatement(sql);
			
			rs = preparedStatement.executeQuery();
			while(rs.next()) {
				
				itemDetail = new ItemDetailDto(rs.getInt("MaLH"), rs.getString("TenLH"), rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaBan"), rs.getDouble("GiaMua"), rs.getInt("SoLuong"));
				itemDetails.add(itemDetail);
				
			}
			return itemDetails;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, preparedStatement);
		}
		
		
		return itemDetails;
	}

	//2
	@Override
	public List<NumberItemDto> getNumberItemDto() {
		List<NumberItemDto> number = new ArrayList<>();
		NumberItemDto NumberItemDto = null;
		String sql = "SELECT lh.MaLH, lh.TenLH, SUM(ctmh.SoLuong) AS SoLuong\n"
					+ "FROM loaihang lh\n"
					+ "JOIN mathang mh ON mh.MaLH = lh.MaLH\n"
					+ "JOIN chitietmathang ctmh ON ctmh.MaMH = mh.MaMH\n"
					+ "GROUP BY lh.MaLH\n";
		try {
			preparedStatement = conn.prepareStatement(sql);
			
			rs = preparedStatement.executeQuery();
			while(rs.next()) {
				
				NumberItemDto = new NumberItemDto(rs.getInt("MaLH"), rs.getString("TenLH"), rs.getInt("SoLuong"));
				number.add(NumberItemDto);
				
			}
			return number;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, preparedStatement);
		}
		
		
		return number;
	}

	//3
	@Override
	public List<String> getItemMax(int year) {
		List<String> items = new ArrayList<>();
		
		String sql = "SELECT mh.MaMH, mh.TenMH, ctdh.SoLuong\n"
				+ "FROM chitietdonhang ctdh\n"
				+ "JOIN donhang dh ON ctdh.MaDH = dh.MaDH\n"
				+ "JOIN mathang mh ON mh.MaMH = ctdh.MaMH\n"
				+ "WHERE YEAR(dh.ThoiGianDatHang) = ?\n"
				+ "GROUP BY mh.MaMH\n"
				+ "ORDER BY SoLuong DESC, mh.MaMH ASC\n"
				+ "LIMIT 3\n";
		
		try {
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, year);
			rs = preparedStatement.executeQuery();
			while(rs.next()) {
				items.add(rs.getString("TenMH"));
			}
			return items;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, preparedStatement);
		}
		
		return items;
		
	}

}
