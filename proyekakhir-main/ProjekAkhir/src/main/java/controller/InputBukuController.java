package controller;

import Model.InputBukuModel;
import view.InputBukuView;
import view.InputView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputBukuController {
    InputBukuView inputBukuView;
    InputBukuModel inputBukuModel;
    InputView inputView;
    public InputBukuController(InputBukuModel inputBukuModel , InputBukuView inputBukuView , InputView inputView){
        this.inputBukuView = inputBukuView;
        this.inputBukuModel=inputBukuModel;
        this.inputView = inputView;

        inputBukuView.btn_tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String no_buku = inputBukuView.getno_buku();
                String judul = inputBukuView.getTfjudul();
                String penerbit = inputBukuView.getTfpenerbit();
                String penulis = inputBukuView.getTfpenulis();
                inputBukuModel.insertdata(no_buku,judul,penerbit,penulis);

                String[][] databuku = inputBukuModel.readbuku();
                inputView.table.setModel((new JTable(databuku,inputView.namakolom)).getModel());

            }
        });


    }
}
