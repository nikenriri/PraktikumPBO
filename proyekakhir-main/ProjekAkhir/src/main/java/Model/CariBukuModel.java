package Model;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CariBukuModel extends InputModel{
    public String[][] cari(String cari){
        String[][] data = new String[1][5];
        int jmlh = 0;
        try {
            String query = "Select * from buku where no_buku ="+ cari;
            statement = (Statement) koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[0][0] = resultSet.getString("no_buku");
                data[0][1] = resultSet.getString("judul");
                data[0][2] = resultSet.getString("penerbit");
                data[0][3] = resultSet.getString("penulis");
                data[0][4] = resultSet.getString("stok");
                jmlh++;
            }
            if (jmlh==0){
                JOptionPane.showMessageDialog(null,"Buku tidak ditemukan");
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak ditemukan");
        }
        return data;
    }
}
