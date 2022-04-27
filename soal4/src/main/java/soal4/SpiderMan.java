package soal4;

public class SpiderMan extends LabaLaba implements Parkour {
    private String namaOrang;

    public SpiderMan(String namaOrang, String namaHewan, String makan) {
        super(namaHewan, makan);
        this.namaOrang = namaOrang;
    }

    public String getNamaOrang() {
        return namaOrang;
    }

    public void setNamaOrang(String namaOrang) {
        this.namaOrang = namaOrang;
    }

    @Override
    public void memanjat() {
        System.out.println(this.namaOrang + "memanjat");
    }

    @Override
    public void mengeluarkanJaring() {
        super.mengeluarkanJaring();
    }

    @Override
    public void berayun() {
        System.out.println(this.namaOrang + "Berayun");
    }

    @Override
    public void makan() {
        super.makan(); 
    }

    @Override
    public void minum() {
        System.out.println(this.namaOrang + "Sedang minum");
    }


}
