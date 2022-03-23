package soal6;

public abstract class Hewan {
    String namaHewan;
    String makanan;

    public Hewan(String namaHewan, String makan) {
        this.namaHewan = namaHewan;
        this.makanan = makan;
    }

    public void makan(){
        System.out.println(this.namaHewan + " memakan " + this.makanan + ".");
        System.out.println(this.namaHewan + " kenyang.");
    }
}

