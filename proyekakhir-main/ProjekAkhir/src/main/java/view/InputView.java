package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InputView extends JFrame {

        JLabel lstok = new JLabel("Stok");

        public JButton btn_tambah = new JButton("Tambah");
        public JButton btn_cari = new JButton("Cari Buku");
        public JButton btn_stok = new JButton("Edit stok");
        public JButton btn_hapus = new JButton("Hapus");

        public JTable table;
        DefaultTableModel dtm;
        JScrollPane jScrollPane;
        public Object namakolom[] = {"No Buku" , "Judul" , "Penulis" , "Penerbit" , "Stok"};

        public InputView(){
            dtm = new DefaultTableModel(namakolom,0);
            table = new JTable(dtm);
            jScrollPane = new JScrollPane(table);

            setTitle("Inventaris Buku");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(700,800);
            setLayout(null);
            setVisible(true);

            // Menambahkan Properti pada layar
            add(jScrollPane);
            add(lstok);
            add(btn_cari);
            add(btn_stok);
            add(btn_tambah);
            add(btn_hapus);

            // Ganbti warna button
            btn_hapus.setBackground(Color.RED);
            btn_stok.setBackground(new Color(3, 215, 252));
            btn_cari.setBackground(new Color(3, 215, 252));
            btn_tambah.setBackground(new Color(3, 215, 252));

            //Atur letak Properti
            jScrollPane.setBounds(20,20,450,700);
            btn_tambah.setBounds(500,30,120,30);
            btn_cari.setBounds(500,80,120,30);
            btn_stok.setBounds(500,130,120,30);
            btn_hapus.setBounds(500,180,120,30);

        }
}
