package responsiNiken;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author niken riri
 */

public class movieModel {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/movie_db";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection konek;
    Statement st;
    
    public movieModel(){
        try{
            Class.forName(JDBC_DRIVER);
            konek = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil!!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal!!");  
        }
    }
    
    public String[][] readData(){
        try{
            int jumData = 0;
            
            String data[][] = new String[getBanyakData()][5]; 
            
            String query = "SELECT * FROM movie"; 
            ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()){
                data[jumData][0] = resultSet.getString("judul");
                data[jumData][1] = String.valueOf(resultSet.getDouble("alur"));                
                data[jumData][2] = String.valueOf(resultSet.getDouble("penokohan"));
                data[jumData][3] = String.valueOf(resultSet.getDouble("akting"));
                data[jumData][4] = String.valueOf(resultSet.getDouble("nilai"));
                jumData++;
            }
            return data;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error!!");
            return null;
        }
    }
    
    public void inputData(String judul, double alur, double penokohan, double akting, double nilai){
        int jumData = 0;
        
        try{
           String query = "SELECT * FROM movie WHERE judul='" +judul+"'"; 
           System.out.println(judul + " " + alur + " " + penokohan + " " + akting);
           ResultSet resultSet = st.executeQuery(query);
           
           while (resultSet.next()){ 
                jumData++;
            }
            
            if (jumData==0) {
                query = "INSERT INTO movie(judul, alur, penokohan, akting, nilai) VALUES('"+judul+"','"+alur+"','"+penokohan+"','"+akting+"','"+nilai+"')";
                st = (Statement) konek.createStatement();
                st.executeUpdate(query); //execute query
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
            
        }catch(Exception sql){
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
        
    }
    
    public void updateData(String judul, double alur, double penokohan, double akting, double nilai){
        int jumData = 0;
        try{
           String query = "SELECT * FROM movie WHERE judul='" + judul +"'"; 
           ResultSet resultSet = st.executeQuery(query);
           
           while (resultSet.next()){ 
                jumData++;
            }
           
             if (jumData==1) {
                query = "UPDATE movie SET  ='alur" + alur + "', penokohan='" + penokohan + "', akting='" + akting + "', nilai='"+ nilai+"' WHERE judul='" + judul+"'"; 
                st = (Statement) konek.createStatement();
                st.executeUpdate(query); //execute querynya
                System.out.println("Berhasil mengupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             } 
        }catch(Exception sql){
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
        
    }

    int getBanyakData() {
        int jumData = 0;
        try{
            st = konek.createStatement();
            String query = "SELECT * FROM movie";
            ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()){ 
                jumData++;
            }
            return jumData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public void HapusData (String judul) {
        try{
            String query = "DELETE FROM movie WHERE judul = '"+judul+"'";
            st = konek.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
    
}
