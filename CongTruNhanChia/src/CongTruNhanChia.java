
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Panel;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;



/**
 *
 * @author thomc
 */
public class CongTruNhanChia extends Frame {
   
    public CongTruNhanChia()
    {
        setTitle("AWT");
        setSize(300, 300);
        GridLayout L=new GridLayout(4,2,10,10);
        setLayout(L);
        
        lbla = new Label("a");
        add(lbla);    // Gắn vào Frame
        
        txta= new TextField(10);
        add(txta);
        
        lblb = new Label("b");
        add(lblb);    // Gắn vào Frame
        
        txtb= new TextField(10);
        add(txtb);
        
        lblThaoTac=new Label("Thao Tac");
        add(lblThaoTac);
        
        btnCong = new Button("+");
        btnCong.addActionListener(new LangNgheCong());
        add(btnCong);
        
        btnTru=new Button("-");
        btnTru.addActionListener(new LangNgheTru());
        add(btnTru);
        
        btnNhan=new Button("*");
        btnNhan.addActionListener(new LangNgheNhan());
        add(btnNhan);
      
        btnChia=new Button("/");
        btnChia.addActionListener(new LangNgheChia());
        add(btnChia);
        // chừa ở đây 2 dòng nhóe
        
        Panel p=new Panel();
        p.setLayout(new FlowLayout());
        p.add(btnCong);
        p.add(btnTru);
        p.add(btnNhan);
        p.add(btnChia);
        add(p);
        
        lblKetQua = new Label("Kq");
        add(lblKetQua);    // Gắn vào Frame
        
        txtKetQua= new TextField(20);
        add(txtKetQua);
           
        setVisible(true);
        this.addWindowListener(new ABC());
    }
    public static void main(String[] args) {
        new CongTruNhanChia();
    }
    //--- Bộ lắng nghe
    class LangNgheCong  implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txta.getText());
           // Lấy B
           int b = Integer.parseInt(txtb.getText());
           //Tính tổng
           int Tong = a+b;
           // Xuất
           txtKetQua.setText(String.valueOf(Tong));
       }
    }
    class LangNgheTru  implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txta.getText());
           // Lấy B
           int b = Integer.parseInt(txtb.getText());
           //Tính tổng
           int Tru = a-b;
           // Xuất
           txtKetQua.setText(String.valueOf(Tru));
       }
    }
    class LangNgheNhan  implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txta.getText());
           // Lấy B
           int b = Integer.parseInt(txtb.getText());
           //Tính tổng
           int Nhan = a*b;
           // Xuất
           txtKetQua.setText(String.valueOf(Nhan));
       }
    }
    
    class LangNgheChia  implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txta.getText());
           // Lấy B
           int b = Integer.parseInt(txtb.getText());
           //Tính tổng
           float Chia = a/b;
           // Xuất
           txtKetQua.setText(String.valueOf(Chia));
       }
    }
    class ABC implements WindowListener{

        @Override
        public void windowOpened(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosing(WindowEvent we) {
            System.exit(0);
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosed(WindowEvent we) {
            
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    TextField txta,txtb,txtKetQua;
    Label lbla,lblb,lblKetQua,lblThaoTac;
    Button btnCong,btnTru,btnNhan,btnChia;
} 