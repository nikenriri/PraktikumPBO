package view;
import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame{
    JLabel ltitle = new JLabel("Login" , SwingConstants.CENTER);
    JLabel lid = new JLabel("ID",SwingConstants.CENTER);
    JLabel lpass = new JLabel("Pass" , SwingConstants.CENTER);

    JTextField tfid = new JTextField();
    JTextField tfpass = new JTextField();

    public JButton btnlog = new JButton("Login");
    public LoginView(){
        setTitle("Inventaris Buku");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);
        setVisible(true);

        // Menambahkan Properti pada layar
        add(ltitle);
        add(lid);
        add(lpass);
        add(tfid);
        add(tfpass);
        add(btnlog);

        // Ganti warna button
        btnlog.setBackground(new Color(3, 215, 252));

        //Atur letak Properti
        ltitle.setBounds(0,10,500,30);
        lid.setBounds(0,80,500,30);
        tfid.setBounds(150,110,200,30);
        lpass.setBounds(0,170,500,30);
        tfpass.setBounds(150,200,200,30);
        btnlog.setBounds(200,260,100,30);
    }

    public String getid(){
        return tfid.getText();
    }

    public String getpass(){
        return tfpass.getText();
    }

}
