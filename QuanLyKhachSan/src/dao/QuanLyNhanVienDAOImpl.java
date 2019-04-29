/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NHANVIEN;

/**
 *
 * @author CLAY
 */
public class QuanLyNhanVienDAOImpl implements QuanLyNhanVienDAO {

    @Override
    public List<NHANVIEN> getList() {
        try {
            Connection cons = DBConnect.getConnection();
            String sql="SELECT * FROM NHANVIEN";
            List<NHANVIEN> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                NHANVIEN nhanvien = new NHANVIEN();
                nhanvien.setMANHANVIEN(rs.getString("MANHANVIEN"));
                nhanvien.setHOTEN(rs.getString("HOTEN"));
                nhanvien.setNGAYSINH(rs.getDate("NGAYSINH"));
                nhanvien.setNGAYVAOLAM(rs.getDate("NGAYVAOLAM"));
                nhanvien.setSODT(rs.getInt("SODT"));
                nhanvien.setCMND(rs.getInt("CMND"));
                nhanvien.setMANGUOIQUANLY(rs.getString("MANGUOIQUANLY"));
                list.add(nhanvien);
            }
            ps.close();
            rs.close();
            cons.close();
            return list;
        } catch (SQLException ex) { 
            ex.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        QuanLyNhanVienDAO nhanviendao= new QuanLyNhanVienDAOImpl();
        System.out.println(nhanviendao.getList());
        
    }
}
