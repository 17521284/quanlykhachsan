/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javafx.scene.control.TableRow;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.NHANVIEN;
import service.QuanLyNhanVienService;
import service.QuanLyNhanVienServiceImpl;
import utility.ClassTableModel;

/**
 *
 * @author CLAY
 */
public class QuanLyNhanVienController {
    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;
    private QuanLyNhanVienService quanLyNhanVienService = null;
    private String[] listColumn = {"Mã nhân viên","Họ tên","Ngày sinh","Ngày vào làm","Chứng minh nhân dân","Số điện thoại","Mã người quản lý"};
    private TableRow<TableModel> rowSorter =null;
    public QuanLyNhanVienController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;
        this.quanLyNhanVienService = new QuanLyNhanVienServiceImpl();
    }
    public void setDateToDate() {
    List<NHANVIEN> listItem = quanLyNhanVienService .getList();
    DefaultTableModel model = new ClassTableModel().setTableQuanLyNhanVien(listItem,listColumn);
    JTable table = new JTable(model);
    rowSorter = new TableRowSorter<>(table.getModel());
    }
}
