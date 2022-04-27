package soal4;

public class LabaLaba extends Hewan {

    public LabaLaba(String namaHewan, String makan) {
        super(namaHewan, makan);
    }
    
    public void mengeluarkanJaring(){
        System.out.println(this.namaHewan  + " mengeluarkan jaring.");
    }
}