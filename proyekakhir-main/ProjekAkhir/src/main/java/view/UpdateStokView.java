package view;

import javax.swing.*;
import java.awt.*;

public class UpdateStokView extends JFrame {

    JLabel ltitle = new JLabel("Masukan Data Buku", SwingConstants.CENTER);
    JLabel lno_buku = new JLabel("No Buku");
    JLabel ljudul = new JLabel("Judul");
    JLabel hjudul = new JLabel();
    JLabel lstok = new JLabel("Stok Lama");
    JLabel hstok = new JLabel();
    JLabel lstokbaru = new JLabel("Stok Baru");

    JTextField tfstokbaru = new JTextField();
    JTextField tfno_buku = new JTextField();

    public JButton btn_cek = new JButton("Cek");
    public JButton btn_update = new JButton("Update");

    public UpdateStokView(){
        setTitle("Edit Stok");
        setLayout(null);
        setSize(500,500);
        setVisible(true);

        add(ltitle);
        add(lno_buku);add((tfno_buku));
        add(ljudul); add(hjudul);
        add(lstok); add(hstok);
        add(btn_cek);
        add(btn_update);

        btn_update.setEnabled(false);
        btn_update.setBackground(new Color(3, 215, 252));
        btn_cek.setBackground(new Color(3, 215, 252));

        ltitle.setBounds(0,20,500,30);
        lno_buku.setBounds(100,80,60,30); tfno_buku.setBounds(230,80,200,30);
        ljudul.setBounds(100,140,60,30); hjudul.setBounds(230,140,200,30);
        lstok.setBounds(100,200,60,30); hstok.setBounds(230,200,200,30);
        btn_cek.setBounds(150,320,100,30); btn_update.setBounds(260,320,100,30);
    }

    public void tampil(String hjudul, String hstok){
        add(lstokbaru); add(tfstokbaru);
        lstokbaru.setBounds(100,260,60,30); tfstokbaru.setBounds(230,260,200,30);

        this.hjudul.setText(hjudul);
        this.hstok.setText(hstok);
    }

    public String getno_buku(){
        return tfno_buku.getText();
    }

    public String getstok_baru(){
        return tfstokbaru.getText();
    }
}
