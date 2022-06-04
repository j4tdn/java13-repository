package dao.ex04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemDto;
import persistence.ItemGroup;
import utils.SqlUtils;

public class JdbcItemDtoDao implements ItemDtoDao{
	
	private Statement st;
	private ResultSet rs;
	private final Connection conn;
	
	public JdbcItemDtoDao() {
		conn = DbConnection.getConnection();
	}
	
	private String sql = "SELECT lh.*,\n"
						+ "      mh.MaMH,\n"
						+ "      mh.TenMH,\n"
						+ "      ctmh.GiaBan,\n"
						+ "      ctmh.GiaMua,\n"
						+ "      ctmh.SoLuong\n"
						+ "FROM MatHang mh\n"
						+ "JOIN LoaiHang lh ON lh.MaLH = mh.MaLH\n"
						+ "JOIN ChiTietMatHang ctmh ON ctmh.MaMH = mh.MaMH;";
	
	@Override
	public List<ItemDto> getItems() {
		List<ItemDto> result = new ArrayList<>();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				ItemDto itemDto = new ItemDto(
									new ItemGroup(rs.getInt("lh.MaLH"), rs.getString("lh.TenLH")),
									rs.getInt("mh.MaMH"),
									rs.getString("mh.TenMH"),
									rs.getInt("GiaBan"),
									rs.getInt("GiaMua"),
									rs.getInt("SoLuong"));
				result.add(itemDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return result;
	}

}
