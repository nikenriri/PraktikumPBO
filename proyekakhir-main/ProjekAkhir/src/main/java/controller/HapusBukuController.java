package controller;

import Model.HapusBukuModel;
import Model.InputModel;
import view.HapusBukuView;
import view.InputView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HapusBukuController {
    InputView inputView;
    HapusBukuModel hapusBukuModel;
    HapusBukuView hapusBukuView;
    InputModel inputModel;

    public HapusBukuController(HapusBukuModel hapusBukuModel,HapusBukuView hapusBukuView,InputView inputView ,InputModel inputModel){
        this.hapusBukuModel =hapusBukuModel;
        this.hapusBukuView = hapusBukuView;
        this.inputView = inputView;
        this.inputModel = inputModel;

        hapusBukuView.btn_cek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String no_buku = hapusBukuView.getno_buku();
                String[][] hasil = hapusBukuModel.readbuku(no_buku);
                if (hasil != null){
                    hapusBukuView.tampil(hasil[0][0]);
                    hapusBukuView.btn_hapus.setEnabled(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Buku tidak ada");
                }
            }
        });

        hapusBukuView.btn_hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String no_buku = hapusBukuView.getno_buku();
                hapusBukuModel.hapus(no_buku);
                String[][] databuku = inputModel.readbuku();
                inputView.table.setModel((new JTable(databuku,inputView.namakolom)).getModel());
            }
        });

    }
}
