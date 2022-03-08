package tugas2;


import java.util.Scanner;
import tugas2.Ruang.Balok;
import tugas2.Ruang.Tabung;

public class main {

    
   public static void main(String[] args) {
        int pilih = 0;
        boolean pil = true;
        double panjang,lebar,tinggiBalok,jari,tinggiTabung;
        Scanner input = new Scanner(System.in); 
         
       
        do{
        System.out.println("_________INPUT_________");
        System.out.println("1. BALOK");
        System.out.println("2. TABUNG");
        System.out.println("3. EXIT");
        System.out.print("pilih : "); pilih = input.nextInt();
        
        switch(pilih){
        
            case 1: 
                System.out.print("PANJANG   : "); panjang = input.nextInt();
                System.out.print("LEBAR     : "); lebar = input.nextInt();
                System.out.print("TINGGI    : "); tinggiBalok = input.nextInt();
                
                Balok balok = new Balok(tinggiBalok,panjang,lebar);
                
                System.out.println("________OUTPUT_________");
                System.out.println("LUAS PERSEGI            : " + balok.luas());
                System.out.println("KELILING PERSEGI        : " + balok.keliling());
                System.out.println("VOLUME                  : " + balok.volume());
                System.out.println("LUAS PERMUKAAN BALOK    : " + balok.luasPermukaan());
                
                
                break;
            case 2 :
                System.out.print("JARI-JARI : "); jari = input.nextInt();
                System.out.print("TINGGI    : "); tinggiTabung = input.nextInt();
                
                Tabung tabung = new Tabung(tinggiTabung,jari);
                
                System.out.println("________OUTPUT_________");
                System.out.println("LUAS LINGKARAN          : " + tabung.luas());
                System.out.println("KELILING LINGKARAN      : " + tabung.keliling());
                System.out.println("VOLUME TABUNG          : " + tabung.volume());
                System.out.println("LUAS PERMUKAAN TABUNG  : " + tabung.luasPermukaan());
                
                break;
            case 3:
                System.out.println("Terimakasih telah menggunakan aplikasi kami :3");
                System.exit(0);
                
                break;
            default:
                System.out.println("Silakan input ulang yaa sayang yaa!");
                pil = true;
                
                break;
        
        
        } 
       }while(pil = true);
        
    }
    
}