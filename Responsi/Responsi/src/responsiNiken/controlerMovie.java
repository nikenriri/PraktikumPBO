package responsiNiken;

/**
 *
 * @author niken riri
 */

import java.awt.event.*;
import javax.swing.*;

public class controlerMovie {
    movieModel model;
    movieView tampilan;
    public String data;
    public controlerMovie(movieModel model, movieView tampilan){
        this.model = model;
        this.tampilan = tampilan;
        
        if (model.getBanyakData()!=0) {
            String dataAslab[][] = model.readData();
            tampilan.tabel.setModel((new JTable(dataAslab, tampilan.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
        }
        
         tampilan.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String Judul = tampilan.getJudul();
                double Alur = Double.parseDouble(tampilan.getAlur());
                double Penokohan = Double.parseDouble(tampilan.getPenokohan());
                double Akting = Double.parseDouble(tampilan.getAkting());
                double Rating = (Alur+Penokohan+Akting)/3;
                model.inputData(Judul, Alur, Penokohan, Akting, Rating);
         
                String dataAslab[][] = model.readData();
                tampilan.tabel.setModel((new JTable(dataAslab, tampilan.namaKolom)).getModel());
            }
        });
         
         tampilan.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String judul = tampilan.getJudul();
                double alur = Double.parseDouble(tampilan.getAlur());
                double penokohan = Double.parseDouble(tampilan.getPenokohan());
                double akting = Double.parseDouble(tampilan.getAkting());
                double nilai = (alur+penokohan+akting)/3;
                model.updateData(judul, alur, akting, penokohan, nilai);

                String dataAslab[][] = model.readData();
                tampilan.tabel.setModel((new JTable(dataAslab, tampilan.namaKolom)).getModel());
            }
        });
         
         tampilan.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                tampilan.tfJudul.setText("");
                tampilan.tfAlur.setText("");
                tampilan.tfPenokohan.setText("");
                tampilan.tfAkting.setText("");
            }
        });
         
         tampilan.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                
                int baris = tampilan.tabel.getSelectedRow();
                data = tampilan.tabel.getValueAt(baris, 0).toString();
                String dataUpdate[] = new String[4];
                dataUpdate[0] = tampilan.tabel.getValueAt(baris, 0).toString();
                dataUpdate[1] = tampilan.tabel.getValueAt(baris, 1).toString();
                System.out.println(data);
            }
           });
                  
          tampilan.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               int input = JOptionPane.showConfirmDialog(null,
                "Apakah anda yakin ingin menghapus Judul " + data + "?", "Pilih...", JOptionPane.YES_NO_OPTION);

            if (input == 0) {
                model.HapusData(data);
                String dataMovie[][] = model.readData();
                tampilan.tabel.setModel((new JTable(dataMovie, tampilan.namaKolom)).getModel());
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
            }
                }
        });
    
    }
}
