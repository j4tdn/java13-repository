package com.persistence.dao;

import com.persistence.connection.DBConnection;
import com.persistence.utils.SqlUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ItemDetailDaoImpl implements ItemDetailDao {
    private static PreparedStatement pst;
    private static Connection conn;

    public ItemDetailDaoImpl() {
        conn = DBConnection.getConnection();
    }

    private static final String Q_UPDATE = "UPDATE `chitietmathang` SET SoLuong = ? WHERE MAMH = ? AND MaKC = ?";

    @Override
    public boolean update() {
        try {
            conn.setAutoCommit(false);
            pst = conn.prepareStatement(Q_UPDATE);
            pst.setInt(1, 80);
            pst.setInt(2, 1);
            pst.setString(3, "L");
            int r1 = pst.executeUpdate();

            pst = conn.prepareStatement(Q_UPDATE);
            pst.setInt(1, 40);
            pst.setInt(2, Integer.parseInt("abc"));
            pst.setString(3, "M");
            int r2 = pst.executeUpdate();

            System.out.println(r1 + ", " + r2);
            conn.commit();

            return r1 > 0 && r2 > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            SqlUtils.close(pst);
        }
        return false;
    }
}
