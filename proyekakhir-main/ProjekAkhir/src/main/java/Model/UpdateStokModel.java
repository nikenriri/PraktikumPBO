package Model;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStokModel extends InputModel{

    public String[][] readbuku(String no_buku){
        String[][] data = new String[1][2];
        int jmlh = 0;
        try {
            String query = "Select * from buku where no_buku ="+ no_buku;
            statement = (Statement) koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[0][0] = resultSet.getString("judul");
                data[0][1] = resultSet.getString("stok");
                jmlh++;
            }
            if (jmlh==0){
                JOptionPane.showMessageDialog(null,"Buku tidak ditemukan");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return data;
    }

    public void upstok(String no_buku , String stok_baru){
        try {
            String query = "Update buku set stok = '"+ stok_baru + "' where no_buku = " + no_buku;
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Stok Berhasil Diganti");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
