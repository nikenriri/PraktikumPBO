package soal6;

public class SpiderMan extends LabaLaba implements Parkour {
    private String namaOrang;

    private int sisaEnergi = energi;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bekerja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tidur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
