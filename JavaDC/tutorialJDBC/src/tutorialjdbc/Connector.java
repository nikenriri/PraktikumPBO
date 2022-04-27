package tutorialjdbc;

/**
 *
 * @author niken riri
 */
import java.sql.*;


public class Connector {
    String DBurl = "jdbc:mysql://localhost/mahasiswa";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;

    public Connector() {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
           System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi Gagal");
        }
    }
      
}
