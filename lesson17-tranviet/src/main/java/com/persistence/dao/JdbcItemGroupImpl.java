package com.persistence.dao;

import com.persistence.connection.DBConnection;
import com.persistence.persistence.ItemGroupDto;
import com.persistence.utils.SqlUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcItemGroupImpl implements ItemGroupDao {
    private static ResultSet rs;
    private static Statement st;
    private static Connection conn;

    public JdbcItemGroupImpl() {
        conn = DBConnection.getConnection();
    }

    private static final String Q_ITEMS_ITEMGROUP = "SELECT lh.MaLH, lh.TenLH,\n" +
            "GROUP_CONCAT(CONCAT(mh.TenMH, '-', ctmh.MaKC, '-', ctmh.SoLuong) SEPARATOR ',') DanhSachMatHang,\n" +
            "SUM(ctmh.SoLuong) AS TongSoLuong  \n" +
            "FROM `chitietmathang` ctmh\n" +
            "JOIN `mathang` mh ON ctmh.MaMH = mh.MaMH\n" +
            "JOIN `loaihang` lh ON lh.MaLH = mh.MaLH\n" +
            "GROUP BY mh.MaLH";

    @Override
    public List<ItemGroupDto> getItemsByItemGroup() {
        List<ItemGroupDto> itemGroupDtos = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(Q_ITEMS_ITEMGROUP);
            while (rs.next()) {
                ItemGroupDto itemGroupDto = new ItemGroupDto(rs.getInt("MaLH"),
                        rs.getString("TenLH"),
                        rs.getString("DanhSachMatHang"),
                        rs.getInt("TongSoLuong"));
                itemGroupDtos.add(itemGroupDto);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            SqlUtils.close(rs, st);
        }
        return itemGroupDtos;
    }
}
