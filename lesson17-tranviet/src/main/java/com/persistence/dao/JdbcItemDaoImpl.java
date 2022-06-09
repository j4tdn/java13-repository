package com.persistence.dao;

import com.persistence.connection.DBConnection;
import com.persistence.persistence.ItemDto;
import com.persistence.utils.SqlUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class JdbcItemDaoImpl implements ItemDao {
    private static ResultSet rs;
    private static PreparedStatement pst;
    private static Connection conn;

    public JdbcItemDaoImpl() {
        conn = DBConnection.getConnection();
    }

    private static final String Q_ITEMS_DATE = "SELECT mh.MaMH, mh.TenMH, TIME(dh.ThoiGianDatHang) as ThoiGianDatHang\n" +
            "    FROM `donhang` dh\n" +
            "    JOIN `chitietdonhang` ctdh ON dh.MaDH = ctdh.MaDH\n" +
            "    JOIN `mathang` mh ON ctdh.MaMH = mh.MaMH\n" +
            "\tWHERE DATE(ThoiGianDatHang) = ?";

    private static final String Q_BESTSELLING_ITEMS = "SELECT mh.MaMH, mh.TenMH, ctdh.SoLuong, dh.ThoiGianDatHang FROM `mathang` mh\n" +
            "JOIN `chitietdonhang` ctdh ON ctdh.MaMH = mh.MaMH\n" +
            "JOIN `donhang`dh ON dh.MaDH = ctdh.MaDH\n" +
            "WHERE YEAR(dh.ThoiGianDatHang) = ?\n" +
            "ORDER BY ctdh.SoLuong DESC\n" +
            "LIMIT 3";

    @Override
    public List<ItemDto> getItemsByOrderingDate(LocalDate ld) {
        List<ItemDto> itemDtoList = new ArrayList<>();
        String ld_to_str = ld.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        //DATE(ThoiGianDatHang) format: yyyy-mm-dd
        try {
            pst = conn.prepareStatement(Q_ITEMS_DATE);
            pst.setString(1, ld.toString());
            rs = pst.executeQuery();
            while (rs.next()) {
                ItemDto itemDto = new ItemDto(rs.getInt("MaMH"), rs.getString("TenMH"),
                        LocalTime.parse(rs.getString("ThoiGianDatHang"), DateTimeFormatter.ofPattern("H:mm:ss")));
                itemDtoList.add(itemDto);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            SqlUtils.close(rs, pst);
        }
        return itemDtoList;
    }

    @Override
    public List<String> getBestSellingItems(int year) {
        List<String> itemList = new ArrayList<>();
        try {
            pst = conn.prepareStatement(Q_BESTSELLING_ITEMS);
            pst.setInt(1, year);
            rs = pst.executeQuery();
            while (rs.next()) {
                itemList.add(rs.getString("TenMH"));
            }
        } catch (Exception ex) {

        } finally {
            SqlUtils.close(rs, pst);
        }
        return itemList;
    }
}
