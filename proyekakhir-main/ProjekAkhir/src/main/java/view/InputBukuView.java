package view;

import javax.swing.*;
import java.awt.*;

public class InputBukuView extends JFrame {
    JLabel ltitle = new JLabel("Input Data Buku", SwingConstants.CENTER);
    JLabel lno_buku = new JLabel("No Buku");
    JLabel ljudul = new JLabel("Judul");
    JLabel lpenerbit = new JLabel("Penerbit");
    JLabel lpenulis = new JLabel("Penulis");

    JTextField tfno_buku = new JTextField();
    JTextField tfjudul = new JTextField();
    JTextField tfpenulis = new JTextField();
    JTextField tfpenerbit = new JTextField();

    public JButton btn_tambah = new JButton("Tambah");
    public InputBukuView(){
        setTitle("Input Buku");
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(ltitle);
        add(ljudul);
        add(lno_buku);
        add(lpenerbit);
        add(lpenulis);
        add(tfjudul);
        add(tfno_buku);
        add(tfpenerbit);
        add(tfpenulis);
        add(btn_tambah);

        btn_tambah.setBackground(new Color(3, 215, 252));

        ltitle.setBounds(0,30,500,30);
        lno_buku.setBounds(100,80,60,30); tfno_buku.setBounds(230,80,200,30);
        ljudul.setBounds(100,140,60,30); tfjudul.setBounds(230,140,200,30);
        lpenerbit.setBounds(100,200,60,30); tfpenerbit.setBounds(230,200,200,30);
        lpenulis.setBounds(100,260,60,30); tfpenulis.setBounds(230,260,200,30);
        btn_tambah.setBounds(200,320,100,30);


    }
        public String getno_buku(){
            return tfno_buku.getText();
        }

        public String getTfjudul() {
            return tfjudul.getText();
        }

        public String getTfpenulis() {
            return tfpenulis.getText();
        }

        public String getTfpenerbit() {
            return tfpenerbit.getText();
        }

}
