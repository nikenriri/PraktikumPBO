package beasiswa;

/**
 *
 * @author niken riri
 */
import beasiswa.kuis.BeasiswaPelajar;
import beasiswa.kuis.BeasiswaMahasiswa;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== FORM PENDAFTARAN BEASISWA =====");
        System.out.println("1. Beasiswa Pelajar");
        System.out.println("2. Beasiswa Mahasiswa");
        System.out.println(" Pilih Form : ");
        int pilih = input.nextInt();
        
        System.out.println("===== FORM PENDAFTARAN =====");
        Scanner data = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = data.next();
        System.out.print("Usia : ");
        String usia = data.next();
        System.out.print("Jenis Program Beasiswa : ");
        String jenisbeas = data.next();
        
        System.out.print("Nilai Struktur dan Konten Esai : ");
        int nStruktur = data.nextInt();
        System.out.print("Nilai Teknik Visualisasi : ");
        int nVisual = data.nextInt();
        System.out.print("Nilai Kemampuan Design Thinking : ");
        int nDesign = data.nextInt();
        
        System.out.print("Nilai Struktur dan Konten Jurnal : ");
        int nJurnal = data.nextInt();
        System.out.print("Nilai Relevansi Data : ");
        int nRelev = data.nextInt();
        System.out.print("Nilai Kemampuan Problem Solving : ");
        int nProb = data.nextInt();
        
        if(pilih == 1){

            BeasiswaPelajar beasiswaPelajar = new BeasiswaPelajar(nama,usia,nStruktur,nVisual,nDesign,nJurnal,nRelev,nProb);
            do{
                System.out.println("=== Menu ===");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Keluar");
                System.out.println("Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.print("Nilai Struktur dan Konten Esai : ");
                    beasiswaPelajar.inputStruktur(input.nextInt());
                    System.out.print("Nilai Teknik Visualisasi : ");
                    beasiswaPelajar.inputVisual(input.nextInt());
                    System.out.print("Nilai Kemampuan Design Thinking : ");
                    beasiswaPelajar.inputDesign(input.nextInt());
                }else if(pilihMenu == 2){
                    System.out.println("Hasil Nilai : " + beasiswaPelajar.hitungNilai());
                    System.out.println("Keterangan  : " + beasiswaPelajar.keterangan());
                }else{
                    break;
                }
         
            }while(true);
            
            
        }else if(pilih == 2){

            BeasiswaMahasiswa beasiswaMahasiswa = new BeasiswaMahasiswa(nama,usia,nStruktur,nVisual,nDesign,nJurnal,nRelev,nProb);
            do{
                System.out.println("=== Menu ===");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Keluar");
                System.out.println("Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.print("Nilai Struktur dan Konten Esai : ");
                    beasiswaMahasiswa.inputJurnal(input.nextInt());
                    System.out.print("Nilai Teknik Visualisasi : ");
                    beasiswaMahasiswa.inputRelev(input.nextInt());
                    System.out.print("Nilai Kemampuan Design Thinking : ");
                    beasiswaMahasiswa.inputProb(input.nextInt());
                }else if(pilihMenu == 2){
                    System.out.println("Hasil Nilai : " + beasiswaMahasiswa.hitungNilai1());
                    System.out.println("Keterangan  : " + beasiswaMahasiswa.keterangan());
                }else{
                    break;
                }
         
            }while(true);
            
        }else{
            System.out.println("Inputan Salah!");
            System.out.println("(Silahkan Input Ulang)");
        }
        
    }
    
}
