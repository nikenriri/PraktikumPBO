package soal4;

public class Burung{
    int tinggi;
    String namaBurung;

    public Burung(String namaHewan, String makanan) {
        this.tinggi = tinggi;
        this.namaBurung = namaBurung;
    }

    public void terbang(){
        System.out.println(this.namaBurung + " sedang terbang pada ketinggian " + tinggi + "meter");
    }

    public void makan(String racun){
        System.out.println(this.namaBurung + "sedang makan buah pisang");
    }
}
        