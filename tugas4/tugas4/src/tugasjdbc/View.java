package tugasjdbc;

/**
 *
 * @author niken riri
 */
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;


public class View extends JFrame{
    JLabel ltitle = new JLabel("Login User",SwingConstants.CENTER);
    JLabel luser = new JLabel("Username : ");
    JLabel lpass = new JLabel("Password : ");
    JLabel lor = new JLabel("=====OR=====",SwingConstants.CENTER);
    JLabel lregis = new JLabel("Registration",SwingConstants.CENTER);
    JLabel luser2 = new JLabel("Username : ");
    JLabel lpass2 = new JLabel("Password : ");
    
    JTextField tfUser = new JTextField();
    JTextField tfPass = new JTextField();
    JTextField tfuser2 = new JTextField();
    JTextField tfpass2 = new JTextField();
    
    JButton btnLogin = new JButton("Login");
    JButton btnRegis = new JButton("Regist");
    String dbtabel = "users";
    String query;
    String[][] data = new String[2][2];
    
    Connectionjdbc koneksi = new Connectionjdbc();

    public View() {
        setTitle("Login");
        setLayout(null);
        setSize(1000, 480);
        
        add(ltitle);
        add(luser);
        add(lpass);
        add(luser2);
        add(lpass2);
        add(lor);
        add(lregis);
        add(tfUser);
        add(tfPass);
        add(tfuser2);
        add(tfpass2);
        add(btnLogin);
        add(btnRegis);
        
        ltitle.setBounds(0, 10, 480, 20);
        luser.setBounds(20, 50, 100, 25);
        lpass.setBounds(20, 90, 100, 25);
        luser2.setBounds(600, 50, 150, 25);
        lpass2.setBounds(600, 90, 100, 25);
        lor.setBounds(200, 60, 480, 20);
        lregis.setBounds(580, 10, 480, 20);
        tfUser.setBounds(160, 50, 150, 25);
        tfPass.setBounds(160, 90, 150, 25);
        tfuser2.setBounds(750, 50, 150, 25);
        tfpass2.setBounds(750, 90, 150, 25);
        btnLogin.setBounds(200, 140, 80, 30);
        btnRegis.setBounds(780, 140, 100, 30);
        
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    koneksi.statement = koneksi.koneksi.createStatement();
                    query = "select 'username' from " + dbtabel + " where username = '" + getUser() + "';";
                    ResultSet result_user = koneksi.statement.executeQuery(query);
                    while (result_user.next())
                        data[0][0] = result_user.getString("username");
                    query = "select 'password' from " + dbtabel + " where password = '" + getPass() + "';";
                    ResultSet result_pass = koneksi.statement.executeQuery(query);
                    while (result_pass.next())
                        data[0][1] =result_pass.getString("password");
                    if (getUser().isEmpty()|| getPass().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Isi Semua Data");
                    }else if (data[0][0] == null){
                        JOptionPane.showMessageDialog(null,"Username tidak ditemukan");
                    } else if (data[0][1] == null){
                        JOptionPane.showMessageDialog(null,"Password Salah");
                    } else {
                        JOptionPane.showMessageDialog(null,"Login Berhasil");
                    }
                    data[0][0]= null; data[0][1]= null;

                } catch (SQLException e1){
                    System.out.println(e1.getMessage());
                }
            }
        });
        
        btnRegis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    koneksi.statement = koneksi.koneksi.createStatement();
                    query = "select 'username' from " + dbtabel + " where username = '" + getuser2() + "';";
                    ResultSet result_user = koneksi.statement.executeQuery(query);
                    while (result_user.next())
                        data[0][0] = result_user.getString("username");
                    if (getuser2().isEmpty()|| getpass2().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Isi semua Data");
                    }else if(data[0][0] != null){
                        JOptionPane.showMessageDialog(null,"Username Telah digunakan");
                    } else {
                        query = "Insert  into " + dbtabel + " (username, password) Values ('" + getuser2() + "','" + getpass2() + "')";
                        koneksi.statement.executeUpdate(query);
                        JOptionPane.showMessageDialog(null,"Registrasi Berhasil");
                    }
                    data[0][0] = null;
                }catch (SQLException e2){
                    System.out.println(e2.getMessage());
                }

            }
        });

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String getUser(){
        return tfUser.getText();
    }

    public String getPass(){
        return tfPass.getText();
    }

    public String getuser2(){
        return tfuser2.getText();
    }

    public String getpass2(){
        return tfpass2.getText();
    }
}
    
