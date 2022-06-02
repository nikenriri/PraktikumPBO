package view;

import javax.swing.*;
import java.awt.*;

public class CariBukuView extends JFrame{

    JLabel ltitle = new JLabel("Cari Buku", SwingConstants.CENTER);
    JLabel lno_buku = new JLabel("No Buku");
    JLabel ljudul = new JLabel("Judul");
    JLabel lpenerbit = new JLabel("Penerbit:");
    JLabel lpenulis = new JLabel("Penulis:");
    JLabel lstok = new JLabel("Stok");
    JLabel ljudulbuku = new JLabel();
    JLabel lpenerbitbuku = new JLabel();
    JLabel lpenulisbuku = new JLabel();
    JLabel lstokbuku = new JLabel();

    JTextField tfno_buku = new JTextField();

    public JButton btn_cari = new JButton("Cari");

    public CariBukuView(){
        setTitle("Cari Buku");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(ltitle);
        add(lno_buku); add(tfno_buku);
        add(ljudul);add(ljudulbuku);
        add(lpenerbit); add(lpenerbitbuku);
        add(lpenulis); add(lpenulisbuku);
        add(lstok); add(lstokbuku);
        add(btn_cari);

        btn_cari.setBackground(new Color(3, 215, 252));

        ltitle.setBounds(0,20,500,30);
        lno_buku.setBounds(100,80,60,30); tfno_buku.setBounds(230,80,200,30);
        ljudul.setBounds(100,140,60,30); ljudulbuku.setBounds(230,140,200,30);
        lpenerbit.setBounds(100,200,60,30); lpenerbitbuku.setBounds(230,200,200,30);
        lpenulis.setBounds(100,260,60,30); lpenulisbuku.setBounds(230,260,200,30);
        lstok.setBounds(100,320,60,30);lstokbuku.setBounds(230,320,200,30);
        btn_cari.setBounds(200,380,100,30);
    }

    public String getcari(){
        return tfno_buku.getText();
    }

    public void setText(String hjudul , String hpenerbit , String hpenulis , String hstok){
        ljudulbuku.setText(hjudul);
        lpenerbitbuku.setText(hpenerbit);
        lpenulisbuku.setText(hpenulis);
        lstokbuku.setText(hstok);
    }
}
