/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.NHANVIEN;

/**
 *
 * @author CLAY
 */
public class ClassTableModel {
    public DefaultTableModel setTableQuanLyNhanVien(List<NHANVIEN> listItem, String[] listColumn){
    DefaultTableModel dtm = new DefaultTableModel(){
      public boolean isCellEditable(int row,int column) {
      return false;
      }
    };
    dtm.setColumnIdentifiers(listColumn);
    int columns = listColumn.length;
    Object[] obj = null;
    int row = listItem.size();
    if(row>0) {
        for(int i=0;i<row;i++) {
            NHANVIEN nhanvien = listItem.get(i);
            obj = new Object[columns];
            obj[0] = nhanvien.getMANHANVIEN();
            obj[1]=i+1;
            obj[2] = nhanvien.getMANHANVIEN();
            obj[3]=nhanvien.getHOTEN();
            obj[4]=nhanvien.getNGAYSINH();
            obj[5]=nhanvien.getNGAYVAOLAM();
            obj[6]=nhanvien.getCMND();
            obj[7]=nhanvien.getSODT();
            obj[8]=nhanvien.getMANGUOIQUANLY();
            dtm.addRow(obj);
        }
        }
     return dtm;
    }
}
