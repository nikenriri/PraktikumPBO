package view;

import javax.swing.*;
import java.awt.*;

public class HapusBukuView extends JFrame{
    JLabel ltitle = new JLabel("Masukan Data Buku", SwingConstants.CENTER);
    JLabel lno_buku = new JLabel("No Buku");
    JLabel ljudul = new JLabel("Judul");
    JLabel hjudul = new JLabel();
    JTextField tfno_buku = new JTextField();

    public JButton btn_cek = new JButton("Cek");
    public JButton btn_hapus = new JButton("Hapus");

    public HapusBukuView(){
        setTitle("Hapus Buku");
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(ltitle);
        add(lno_buku);add((tfno_buku));
        add(ljudul); add(hjudul);
        add(btn_cek);
        add(btn_hapus);

        btn_hapus.setEnabled(false);
        btn_hapus.setBackground(new Color(252, 3, 3));
        btn_cek.setBackground(new Color(3, 215, 252));

        ltitle.setBounds(0,20,500,30);
        lno_buku.setBounds(100,80,60,30); tfno_buku.setBounds(230,80,200,30);
        ljudul.setBounds(100,140,60,30); hjudul.setBounds(230,140,200,30);
        btn_cek.setBounds(150,320,100,30); btn_hapus.setBounds(260,320,100,30);

    }

    public String getno_buku(){
        return tfno_buku.getText();
    }

    public void tampil(String hjudul){
        this.hjudul.setText(hjudul);
    }
}
