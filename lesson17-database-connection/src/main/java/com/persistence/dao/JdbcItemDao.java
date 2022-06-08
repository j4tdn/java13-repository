package com.persistence.dao;

import com.persistence.connection.DBConnection;
import com.persistence.persistence.Item;
import com.persistence.persistence.ItemGroup;
import com.persistence.utils.SqlUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcItemDao implements ItemDao{
    private final Connection conn;
    private static Statement st;
    private static PreparedStatement pst;
    private static ResultSet rs;

    public JdbcItemDao(){
        conn = DBConnection.getConnection();
    }
    @Override
    public List<Item> getAll() {
        List<Item> items = new ArrayList<>();
        String sql = "SELECT * FROM `mathang`";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getString("MauSac"));
                items.add(item);
            }

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally {
            SqlUtils.close(rs, st);
        }
        return items;
    }

    @Override
    public List<Item> findItemsByItemGroupName(String name) {
        List<Item> items = new ArrayList<>();
        String sql = "SELECT mh.*, lh.TenLH FROM `loaihang` lh JOIN `mathang` mh ON lh.MaLH = mh.MaLH WHERE lh.TenLH = ?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            rs = pst.executeQuery();
            while(rs.next()){
                ItemGroup itemGroup = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
                Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getString("MauSac"), itemGroup);
                items.add(item);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally {
            SqlUtils.close(rs, pst);
        }
        return items;
    }
}
