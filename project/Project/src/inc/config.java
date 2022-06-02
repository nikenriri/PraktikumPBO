package inc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author niken riri
 */

public class config {
    
    public static Connection konek;
    
    public static Connection Konek(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            konek = DriverManager.getConnection("jdbc:mysql://localhost/book_store","root","");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return konek;
    }
    
    public static void main(String args[]){
        System.out.println(config.Konek());
    }
    
}
