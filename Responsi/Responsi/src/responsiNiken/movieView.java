package responsiNiken;

/**
 *
 * @author niken riri
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class movieView extends JFrame{
    JLabel lJudul = new JLabel("Judul");
    JLabel lAlur = new JLabel("Alur");
    JLabel lPenokohan = new JLabel("Penokohan");
    JLabel lAkting = new JLabel("Akting");
    
    public JTextField tfJudul = new JTextField();
    public JTextField tfAlur = new JTextField();
    public JTextField tfPenokohan = new JTextField();
    public JTextField tfAkting = new JTextField();
    
    public JButton btnTambah = new JButton("Tambah");
    public JButton btnUpdate = new JButton("Update");
    public JButton btnHapus = new JButton("Hapus");
    public JButton btnReset = new JButton("Clear");
    
    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"Judul","Alur", "Penokohan", "Akting", "Nilai Akhir" };
    
    public movieView(){
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Movie");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(700,400);
        
        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 300);
        
        add(lJudul);
        lJudul.setBounds(510, 20, 90, 20);
        add(tfJudul);
        tfJudul.setBounds(510, 40, 120, 20);
        
        add(lAlur);
        lAlur.setBounds(510, 60, 90, 20);
        add(tfAlur);
        tfAlur.setBounds(510, 80, 120, 20);
        
        add(lPenokohan);
        lPenokohan.setBounds(510, 100, 90, 20);
        add(tfPenokohan);
        tfPenokohan.setBounds(510, 120, 120, 20);
        
        add(lAkting);
        lAkting.setBounds(510, 140, 90, 20);
        add(tfAkting);
        tfAkting.setBounds(510, 160, 120, 20);
        
        add(btnTambah);
        btnTambah.setBounds(510, 190, 90, 20);
        
        add(btnUpdate);
        btnUpdate.setBounds(510, 220, 90, 20);
        
        add(btnHapus);
        btnHapus.setBounds(510, 250, 90, 20);
        
        add(btnReset);
        btnReset.setBounds(510, 280, 90, 20);
    }
    
    public String getJudul(){
        return tfJudul.getText();
    }
    
    public String getAlur(){
        return tfAlur.getText();
    }
    
    public String getPenokohan(){
        return tfPenokohan.getText();
    }
    
    public String getAkting(){
        return tfAkting.getText();
    }
    
}
