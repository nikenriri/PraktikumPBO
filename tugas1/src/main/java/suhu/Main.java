/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;

/**
 *
 * @author niken riri
 */
import static java.lang.System.exit;
import java.util.Scanner;
import suhu.Konversi;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih = 0;
        int celcius, fahrenheit, kelvin, reamur;
        boolean pil = true;
        Scanner input = new Scanner (System.in);
        
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius : "); celcius = input.nextInt();
        Konversi konversi = new Konversi(celcius);
        System.out.println("");
        System.out.println("");
        
        do{
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("-----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : "); pilih = input.nextInt();
            
            if(pilih == 1){
                System.out.println("");
                konversi.suhuAkhir();
            }else if(pilih == 2){
                input = new Scanner(System.in);
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.println("Suhu Dalam Celcius : "); konversi.celcius = input.nextInt();
            }else if(pilih == 3){
                System.exit(0);
            }else{
                System.out.println("Oops maaf opsi tidak tersedia, mohon masukkan opsi dengan benar!");
                pil = true;
            }
        }
        while(pil = true);
    }
}
