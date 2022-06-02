package Model;

import javax.swing.*;
import java.sql.*;

public class InputModel {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/toko_buku";
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;

    public InputModel(){
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Gagal Koneksi ke Server");
        }
    }

    public int getbannyakdata(){
        int Jmldata = 0;
        try {
            statement = koneksi.createStatement();
            String query = "Select * from buku";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                Jmldata++;
            }
            return Jmldata;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

    public String[][] readbuku(){
        try {
            int jumlahdata = 0 ;
            String[][] data = new String[getbannyakdata()][5];
            String query = "Select * from buku";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                data[jumlahdata][0] = resultSet.getString("no_buku");
                data[jumlahdata][1] = resultSet.getString("judul");
                data[jumlahdata][2] = resultSet.getString("penerbit");
                data[jumlahdata][3] = resultSet.getString("penulis");
                data[jumlahdata][4] = resultSet.getString("stok");
                jumlahdata++;
            }
            return data;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
}
