
package controller;
import java.util.List;
import bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javafx.scene.layout.Border;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.DatPhongTruocJPanel;
import view.DichVuJPanel;
import view.InHoaDonJPanel;
import view.QuanLyKhachHangJPanel;
import view.QuanLyNhanVienJPanel;
import view.ThongKeDoanhSoJPanel;
import view.ThuePhongJPanel;
import view.TrangChuJPanel;

/**
 *
 * @author CLAY
 */
public class ChuyenManHinhController {
    private JPanel jpnRoot;
    private String kindSelected ="";
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.jpnRoot = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem ){
        this.kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
    
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new TrangChuJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    } 
    
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item : listItem) {
        item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
    
    }

class LabelEvent implements MouseListener {
    private JPanel node;
    private String kind;
    
    private JPanel jpnItem;
    private JLabel jlbItem;

    public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
        this.kind = kind;
        this.jpnItem = jpnItem;
        this.jlbItem = jlbItem;
    }
     
    
     
    @Override
    public void mouseClicked(MouseEvent e) {
        switch(kind) {
            case "TrangChu" :
                node = new TrangChuJPanel();
                break;
            case "QuanLyKhachHang" :
                node = new QuanLyKhachHangJPanel();
                break;
            case "QuanLyNhanVien" :
                node = new QuanLyNhanVienJPanel();
                break;
            case "DatPhongTruoc" :
                node = new DatPhongTruocJPanel();
                break;
            case "ThuePhong" :
                node = new ThuePhongJPanel();
                break;
            case "DichVu" :
                node = new DichVuJPanel();
                break;
            case "InHoaDon" :
                node = new InHoaDonJPanel();
                break;
            case "ThongKeDoanhSo" :
                node = new ThongKeDoanhSoJPanel();
                break;
            default:
                node = new TrangChuJPanel();
                break;
        }
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(node);
        jpnRoot.validate();
        jpnRoot.repaint();
        setChangeBackground(kind);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        kindSelected = kind;
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(!kindSelected.equalsIgnoreCase(kind)) {
            jpnItem.setBackground(new Color(76,175,80));
            jlbItem.setBackground(new Color(76,175,80));
            
        }
    }

}
private void setChangeBackground(String kind){
    for(DanhMucBean item : listItem) {
        if(item.getKind().equalsIgnoreCase(kind)) {
            item.getJpn().setBackground(new Color(96,100,191));
            item.getJlb().setBackground(new Color(96,100,191));
        } else {
            item.getJpn().setBackground(new Color(76,175,80));
            item.getJlb().setBackground(new Color(76,175,80));
        }
    }
        
}
}