package makhlukhidup;

/**
 *
 * @author niken riri
 */
import makhlukhidup.hewan.Burung;
public class MainMakhlukHidup {

    public static void main(String[] args) {
        makhlukhidup.Manusia m = new makhlukhidup.Manusia();
        System.out.println("Nama : " + m.nama);
        System.out.println("Semua burung pasti bisa terbang?" + Burung.bisaTerbang);
        Burung b = new Burung("Beo");
        b.hapusNama();
        b.simpanNama("Kasuari");
        System.out.println("Nama baru burung : " + b.bacaNama());      
    }
}
