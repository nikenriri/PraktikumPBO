package soal6;

public class GatotKaca extends Burung implements Manusia, Mesin {
    private String kerja, nama;

    public GatotKaca(String kerja, String nama, int tinggi, String namaBurung) {
        super(tinggi, namaBurung);
        this.kerja = kerja;
        this.nama = nama;
    }

    public String getKerja() {
        return kerja;
    }

    public void setKerja(String kerja) {
        this.kerja = kerja;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void pekerjaan(){
        System.out.println(this.nama + "melakukan" + this.kerja);
    }

    @Override
    public void terbang() {
        System.out.println(this.nama + "terbang" + tinggi + "meter");
    }

    @Override
    public void makan() {
        System.out.println(this.nama + "sedang makan pisang");
    }

    @Override
    public void bantu() {
        System.out.println(this.nama + "sedang membantu orang memperbaiki" + this.namaMesin);
    }
}
