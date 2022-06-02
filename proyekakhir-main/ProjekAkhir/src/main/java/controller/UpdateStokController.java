package controller;

import Model.InputModel;
import Model.UpdateStokModel;
import view.InputView;
import view.UpdateStokView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateStokController {
    UpdateStokView updateStokView;
    UpdateStokModel updateStokModel;
    InputView inputView;
    InputModel inputModel;

    UpdateStokController(UpdateStokView updateStokView, UpdateStokModel updateStokModel , InputView inputView , InputModel inputModel){
        this.updateStokModel = updateStokModel;
        this.updateStokView = updateStokView;
        this.inputView = inputView;
        this.inputModel = inputModel;

        updateStokView.btn_update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String no_buku = updateStokView.getno_buku();
                String stokbaru = updateStokView.getstok_baru();
                updateStokModel.upstok(no_buku,stokbaru);
                String[][] databuku = inputModel.readbuku();
                inputView.table.setModel((new JTable(databuku,inputView.namakolom)).getModel());

            }
        });

        updateStokView.btn_cek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String no_buku = updateStokView.getno_buku();
                String[][] hasil = updateStokModel.readbuku(no_buku);
                if (hasil != null){
                    updateStokView.tampil(hasil[0][0],hasil[0][1]);
                    updateStokView.btn_update.setEnabled(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Buku tidak ada");
                }
            }
        });
    }
}
