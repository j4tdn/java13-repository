package com.persistence.dao;

import com.persistence.connection.DBConnection;
import com.persistence.persistence.ItemGroup;
import com.persistence.persistence.ItemGroupDto;
import com.persistence.utils.SqlUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcItemGroupDao implements ItemGroupDao {
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    public final Connection conn;

    public JdbcItemGroupDao() {
        conn = DBConnection.getConnection();
    }

    @Override
    public List<ItemGroup> getAll() {
        List<ItemGroup> itemGroups = new ArrayList<>();
        String sql = "SELECT * FROM `loaihang`";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                itemGroups.add(new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            SqlUtils.close(rs, st);
        }
        return itemGroups;
    }

    @Override
    public ItemGroup getItemGroup(int id) {
        ItemGroup itemGroup = new ItemGroup();
        String sql = "SELECT * FROM `loaihang` WHERE MaLH = " + id;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()){
                itemGroup = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            SqlUtils.close(rs, st);
        }
        return itemGroup;
    }

    @Override
    public int save(ItemGroup itemGroup) {
        String sql = "INSERT INTO `loaihang`(MaLH, TenLH) VALUES(?, ?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, itemGroup.getId());
            pst.setString(2, itemGroup.getName());
            return pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            SqlUtils.close(pst);
        }
    }

    @Override
    public int update(ItemGroup itemGroup) {
        String sql = "UPDATE `loaihang` SET TenLH = ? WHERE MaLH = ? ";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, itemGroup.getName());
            pst.setInt(2, itemGroup.getId());
            return pst.executeUpdate();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            SqlUtils.close(pst);
        }
        return -1;
    }

    @Override
    public ItemGroup getItemGroup(String name) {
        ItemGroup itemGroup = new ItemGroup();
        String sql = "SELECT * FROM `LoaiHang` WHERE TenLH = ?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            rs = pst.executeQuery();
            if (rs.next()){
                itemGroup = new ItemGroup(rs.getInt("MaLh"), rs.getString("TenLH"));
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            SqlUtils.close(rs, pst);
        }
        return itemGroup;
    }

    @Override
    public List<ItemGroupDto> getItemsByItemGroup() {
        List<ItemGroupDto> itemGroupDtos = new ArrayList<>();
        String sql = "SELECT lh.MaLH, lh.TenLH,\n" +
                "GROUP_CONCAT(CONCAT(mh.TenMH, '-', ctmh.MaKC, '-', ctmh.SoLuong) SEPARATOR ',') DanhSachMatHang,\n" +
                "SUM(ctmh.SoLuong) AS TongSoLuong  \n" +
                "FROM `chitietmathang` ctmh\n" +
                "JOIN `mathang` mh ON ctmh.MaMH = mh.MaMH\n" +
                "JOIN `loaihang` lh ON lh.MaLH = mh.MaLH\n" +
                "GROUP BY mh.MaLH;";
        try{
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()){
                    ItemGroupDto itemGroupDto = new ItemGroupDto(rs.getInt("MaLH"),
                                                                rs.getString("TenLH"),
                                                                rs.getString("DanhSachMatHang"),
                                                                rs.getInt("TongSoLuong"));
                    itemGroupDtos.add(itemGroupDto);
                }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            SqlUtils.close(rs, st);
        }
        return itemGroupDtos;
    }
}
