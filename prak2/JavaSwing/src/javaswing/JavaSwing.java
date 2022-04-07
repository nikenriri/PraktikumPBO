package javaswing;
import javax.swing.*;
/**
 *
 * @author niken riri
 */
public class JavaSwing {
    public static void main(String[] args) {
       //JFrame frame = new JFrame(); 
       //frame.setTitle("ini bagian judul");
       //frame.setSize(300,200);
       //frame.pack();
       //frame.setLayout(null);
       //frame.setVisible(true);
       //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class GUI extends JFrame{
    JLabel lnama = new JLabel("Nama Lengkap");
    final JTextField fnama = new JTextField(10);
    
    JLabel ljeniskelamin = new JLabel("Jenis Kelamin");
    JRadioButton rblaki = new JRadioButton("Laki-laki");
    JRadioButton rbperempuan = new JRadioButton("Perempuan");
    
    JLabel lagama = new JLabel("Agama");
    String[] namaAgama = {"Islam","Kristen","Hindu","Budha","Katholik"};
    JComboBox cmagama = new JComboBox(namaAgama);
    
    JLabel lhobi = new JLabel("Hobi");
    JCheckBox cbsepakbola = new JCheckBox("Sepakbola");
    JCheckBox cbbasket = new JCheckBox("Basket");
    
    JButton bsave = JButton("Save");
    
    public GUI(){
        setTitle("Coba Komponen GUI");
        setSize(350,200);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rblaki);
        group.add(rbperempuan);
        
        setLayout(null);
        add(lnama);
        add(fnama);
        add(ljeniskelamin);
        add(rblaki);
        add(rbperempuan);
        add(lagama);
        add(cmagama);
        add(lhobi);
        add(cbsepakbola);
        add(cbbasket);
        add(bsave);
        
    }
    
            
    
}
