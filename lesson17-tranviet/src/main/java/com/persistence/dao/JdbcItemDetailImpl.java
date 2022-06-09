package com.persistence.dao;

import com.persistence.connection.DBConnection;
import com.persistence.persistence.ItemDetail;
import com.persistence.utils.SqlUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcItemDetailImpl implements ItemDetailDao {
    private static ResultSet rs;
    private static Statement st;
    private static Connection conn;

    public JdbcItemDetailImpl() {
        conn = DBConnection.getConnection();
    }

    private static final String Q_HIGHESTPRICE_IGROUP = "\tWITH LoaiHang_GBCN AS\n"
            + "\t\t(\n"
            + "SELECT lh.MaLH, \n"
            + "\t\t\t\t MAX(ctmh.GiaBan) AS MAX\n"
            + "\t\tFROM `chitietmathang` ctmh\n"
            + "\t\tJOIN `mathang` mh ON ctmh.MaMH = mh.MaMH\n"
            + "\t\tJOIN `loaihang` lh ON lh.MaLH = mh.MaLH\n"
            + "\t\tGROUP BY lh.MaLH\n"
            + ")\n"
            + "\t\t\n"
            + "SELECT mh.*, ctmh.MaKC, \n"
            + "\t\tctmh.GiaBan \n"
            + "FROM `mathang` mh\n"
            + "JOIN `chitietmathang` ctmh ON mh.MaMH = ctmh.MaMH\n"
            + "JOIN LoaiHang_GBCN lhcn ON mh.MaLH = lhcn.MaLH\n"
            + "WHERE ctmh.GiaBan = lhcn.MAX";

    @Override
    public List<ItemDetail> getHighestPriceItemsByItemGroup() {
        List<ItemDetail> itemDetails = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(Q_HIGHESTPRICE_IGROUP);
            while (rs.next()) {
                ItemDetail itemDetail = new ItemDetail(rs.getInt("MaMH"), rs.getString("TenMH"),
                        rs.getString("MauSac"), rs.getInt("MaLH"), rs.getString("MaKC"),
                        rs.getDouble("GiaBan"));
                itemDetails.add(itemDetail);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            SqlUtils.close(rs, st);
        }
        return itemDetails;
    }
}
