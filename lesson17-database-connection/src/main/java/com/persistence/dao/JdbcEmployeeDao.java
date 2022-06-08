package com.persistence.dao;


import com.persistence.connection.DBConnection;
import com.persistence.persistence.Employee;
import com.persistence.persistence.Title;
import com.persistence.utils.SqlUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcEmployeeDao implements EmployeeDao {
    private static ResultSet rs;
    private static Statement st;
    private static PreparedStatement pst;
    private final Connection conn;

    public JdbcEmployeeDao() {
        conn = DBConnection.getConnection();
    }

    private static final String EMPTY_STRING = "";
    private static final Integer DEFAULT_NUMBER = 1;
    private static final String Q_GET_ALL = "SELECT nv.*, cv.TenCV FROM `nhanvien` nv JOIN `chucvu` cv ON nv.MaCV = cv.MaCV";
    private static final String Q_SIGN_UP = "INSERT INTO `nhanvien`(TenNV, Email, SDT, DiaChi, MatKhau, MaCV)\n" +
            "VALUES(?,?,?,?,?,?)";
    private static final String Q_SIGN_IN = "SELECT nv.*, cv.TenCV FROM `nhanvien` nv JOIN `chucvu` cv ON nv.MaCV = cv.MaCV WHERE Email = ? AND Matkhau = ?";

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(Q_GET_ALL);
            while (rs.next()) {
                Title title = new Title(rs.getInt("MaCV"), rs.getString("TenCV"));
                Employee employee = new Employee(rs.getInt("MaNV"), rs.getString("TenNV"),
                        rs.getString("Email"), rs.getString("SDT"),
                        rs.getString("DiaChi"), rs.getString("MatKhau"),
                        title);
                employees.add(employee);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            SqlUtils.close(rs, st);
        }
        return employees;
    }

    @Override
    public boolean signup(String email, String password) {
        try {
            pst = conn.prepareStatement(Q_SIGN_UP);
            pst.setString(1, EMPTY_STRING);
            pst.setString(2, email);
            pst.setString(3, EMPTY_STRING);
            pst.setString(4, EMPTY_STRING);
            pst.setString(5, SqlUtils.encrypt(password));
            pst.setInt(6, DEFAULT_NUMBER);
            return pst.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            SqlUtils.close(pst);
        }
        return false;
    }

    @Override
    public Employee signin(String email, String password) {
        Employee employee = null;
        try {
            pst = conn.prepareStatement(Q_SIGN_IN);
            pst.setString(1, email);
            pst.setString(2, SqlUtils.encrypt(password));
            rs = pst.executeQuery();
            if (rs.next()) {
                Title title = new Title(rs.getInt("MaCV"), rs.getString("TenCV"));
                employee = new Employee(rs.getInt("MaNV"), rs.getString("TenNV"),
                        rs.getString("Email"), rs.getString("SDT"),
                        rs.getString("DiaChi"), rs.getString("MatKhau"),
                        title);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            SqlUtils.close(rs, pst);
        }
        return employee;
    }

    @Override
    public boolean isExist(String email) {
        String sql = "SELECT COUNT(*) AS COUNT FROM `nhanvien` WHERE Email = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt("COUNT") > 0;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            SqlUtils.close(rs, pst);
        }
        return false;
    }

}
