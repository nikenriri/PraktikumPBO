package perulangan2;

/**
 *
 * @author niken riri
 */
public class PerulanganDalamPerulangan {
    public static void main(String[] args) {
        int tinggi = 4;
        int baris, kolom;
        
        for(baris = 1; baris <= tinggi; baris++){
            //tampilkan *
            for(kolom = 1; kolom <= baris; kolom++){
                System.out.println("*");
            }
            //pindah baris
            System.out.println();
        }
    }
    
}
