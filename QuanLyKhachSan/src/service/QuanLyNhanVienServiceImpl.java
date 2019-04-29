/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.QuanLyNhanVienDAO;
import dao.QuanLyNhanVienDAOImpl;
import java.util.List;
import model.NHANVIEN;

/**
 *
 * @author CLAY
 */
public class QuanLyNhanVienServiceImpl implements QuanLyNhanVienService{
    private QuanLyNhanVienDAO quanLyNhanVienDAO = null;

    public QuanLyNhanVienServiceImpl() {
        quanLyNhanVienDAO = new QuanLyNhanVienDAOImpl();
    }

    @Override
    public List<NHANVIEN> getList() {
        return quanLyNhanVienDAO.getList();
    }
    
}
