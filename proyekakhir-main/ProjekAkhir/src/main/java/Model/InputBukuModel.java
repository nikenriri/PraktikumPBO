package Model;

import javax.swing.*;
import java.sql.SQLException;
import java.sql.Statement;

public class InputBukuModel extends InputModel{
    public void insertdata(String no_buku, String judul, String penerbit, String penulis){
        try {
            String query = "Insert into buku Values ('" + no_buku + "','" + judul + "','" + penerbit + "','" + penulis + "',0)";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Data berhasil ditambahkan");

        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Pastikan No Buku Tidak Sama dengan yang lain dan data yang diimasukan sudah betul");
        }

    }
}
