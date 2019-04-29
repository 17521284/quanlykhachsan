
package model;

import java.util.Date;

/**
 *
 * @author CLAY
 */
public class NHANVIEN {
    private String MANHANVIEN;
    private String HOTEN;
    private Date NGAYSINH;
    private Date NGAYVAOLAM;
    private int CMND;
    private int SODT;
    private String MANGUOIQUANLY;

    public String getMANHANVIEN() {
        return MANHANVIEN;
    }

    public void setMANHANVIEN(String MANHANVIEN) {
        this.MANHANVIEN = MANHANVIEN;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public Date getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(Date NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public Date getNGAYVAOLAM() {
        return NGAYVAOLAM;
    }

    public void setNGAYVAOLAM(Date NGAYVAOLAM) {
        this.NGAYVAOLAM = NGAYVAOLAM;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getSODT() {
        return SODT;
    }

    public void setSODT(int SODT) {
        this.SODT = SODT;
    }

    public String getMANGUOIQUANLY() {
        return MANGUOIQUANLY;
    }

    public void setMANGUOIQUANLY(String MANGUOIQUANLY) {
        this.MANGUOIQUANLY = MANGUOIQUANLY;
    }

    @Override
    public String toString() {
        return MANHANVIEN + "--" + HOTEN + "--" + NGAYSINH + "--" + CMND + "--" + SODT + "--" + MANGUOIQUANLY ;
    }
    
    

}
