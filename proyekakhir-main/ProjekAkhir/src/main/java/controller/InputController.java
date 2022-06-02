package controller;

import Model.*;
import view.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputController {
    InputModel InputModel;
    InputView inputView;
    public InputController(InputView inputView , InputModel inputModel){
        this.inputView =inputView;
        this.InputModel = inputModel;

        if(inputModel.getbannyakdata() != 0){
            String databuku[][] = inputModel.readbuku();
            inputView.table.setModel((new JTable(databuku,inputView.namakolom).getModel()));
        }

        inputView.btn_tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputBukuView inputBukuView = new InputBukuView();
                InputBukuModel inputBukuModel = new InputBukuModel();
                new InputBukuController(inputBukuModel,inputBukuView,inputView);
            }
        });

        inputView.btn_cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CariBukuView cariBukuView = new CariBukuView();
                CariBukuModel cariBukuModel = new CariBukuModel();
                new CariBukuController(cariBukuView,cariBukuModel);
            }
        });

        inputView.btn_stok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateStokModel updateStokModel = new UpdateStokModel();
                UpdateStokView updateStokView = new UpdateStokView();
                new UpdateStokController(updateStokView,updateStokModel,inputView,inputModel);
            }
        });

        inputView.btn_hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HapusBukuView hapusBukuView = new HapusBukuView();
                HapusBukuModel hapusBukuModel = new HapusBukuModel();
                new HapusBukuController(hapusBukuModel,hapusBukuView,inputView,inputModel);
            }
        });
    }
}
