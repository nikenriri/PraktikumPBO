package makhlukhidup.hewan;

/**
 *
 * @author niken riri
 */
public class Burung {
    public static final boolean bisaTerbang = true;
    public String nama = "";
    
    public Burung (String nama){
        this.nama = nama;
        System.out.println("Nama Burung : " + nama);
    }
    
    public void simpanNama(String nama){ //method penyimpan nama
        this.nama = nama;
    }
    
    public void hapusNama(){ //method penghapus nama
        nama = "";
    }
    
    public String bacaNama(){ //method pengambil nama
        return nama;
    }
    
}
