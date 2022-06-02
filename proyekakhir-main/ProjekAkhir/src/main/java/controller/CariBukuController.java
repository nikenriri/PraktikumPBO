package controller;

import Model.CariBukuModel;
import view.CariBukuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CariBukuController {
    CariBukuModel cariBukuModel;
    CariBukuView cariBukuView;
    public CariBukuController(CariBukuView cariBukuView, CariBukuModel cariBukuModel){
        this.cariBukuModel = cariBukuModel;
        this.cariBukuView = cariBukuView;

        cariBukuView.btn_cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cari = cariBukuView.getcari();
                String[][] hasil = cariBukuModel.cari(cari);
                cariBukuView.setText(hasil[0][1],hasil[0][2],hasil[0][3],hasil[0][4]);
            }
        });

    }
}
