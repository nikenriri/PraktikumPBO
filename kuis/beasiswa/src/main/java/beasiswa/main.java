package beasiswa;

/**
 *
 * @author niken riri
 */
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
        System.out.println("Nama : ");
        String nama = data.next();
        System.out.println("Usia : ");
        String usia = data.next();
        System.out.println("Jenis Program Beasiswa : ");
        String jenisbeas = data.next();

        if(pilih == 1){
            System.out.println("Nilai Struktur dan Konten Esai : ");
            int nStruktur = data.nextInt();
            System.out.println("Nilai Teknik Visualisasi : ");
            int nVisual = data.nextInt();
            System.out.println("Nilai Kemampuan Design Thinking : ");
            int nDesign = data.nextInt();
            
            BeasiswaMahasiswa beasiswaMahasiswa = new BeasiswaMahasiswa(nama,usia,jenisbeas,nStruktur,nVisual,nDesign);
            do{
                System.out.println("=== Menu ===");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Keluar");
                System.out.println("Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.println("Nilai Struktur dan Konten Esai : ");
                    beasiswaMahasiswa.inputStruktur(input.nextInt());
                    System.out.println("Nilai Teknik Visualisasi : ");
                    beasiswaMahasiswa.inputVisual(input.nextInt());
                    System.out.println("Nilai Kemampuan Design Thinking : ");
                    beasiswaMahasiswa.inputDesign(input.nextInt());
                }else if(pilihMenu == 2){
                    System.out.println("Hasil Nilai : " + beasiswaMahasiswa.hitungNilai());
                    System.out.println("Keterangan  : " + beasiswaMahasiswa.keterangan());
                }else{
                    break;
                }
         
            }while(true);
            
            
        }else if(pilih == 2){
            System.out.println("Nilai Struktur dan Konten Jurnal : ");
            int nJurnal = data.nextInt();
            System.out.println("Nilai Relevansi Data : ");
            int nRelev = data.nextInt();
            System.out.println("Nilai Kemampuan Problem Solving : ");
            int nProb = data.nextInt();
            
            BeasiswaPelajar beasiswaPelajar = new BeasiswaPelajar(nama,usia,jenisbeas,nJurnal,nRelev,nProb);
            do{
                System.out.println("=== Menu ===");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Keluar");
                System.out.println("Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.println("Nilai Struktur dan Konten Esai : ");
                    beasiswaPelajar.inputJurnal(input.nextInt());
                    System.out.println("Nilai Teknik Visualisasi : ");
                    beasiswaPelajar.inputRelev(input.nextInt());
                    System.out.println("Nilai Kemampuan Design Thinking : ");
                    beasiswaPelajar.inputProb(input.nextInt());
                }else if(pilihMenu == 2){
                    System.out.println("Hasil Nilai : " + beasiswaPelajar.hitungNilai1());
                    System.out.println("Keterangan  : " + beasiswaPelajar.keterangan());
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
