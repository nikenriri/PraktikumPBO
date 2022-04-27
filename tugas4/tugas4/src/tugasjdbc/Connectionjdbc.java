package tugasjdbc;

/**
 *
 * @author niken riri
 */

import java.sql.*;

public class Connectionjdbc {
    String DBurl = "jdbc:mysql://localhost/tugasjdbc";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;

    public Connectionjdbc() {
        try{
           Class.forName("com.mysql.jdbc.Driver");
           koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
           System.out.println("Koneksi Berhasil!!");
        }catch(Exception ex){
            System.out.println("Koneksi Gagal!!");
        }
    }
    
    
    
}
