package soal4;

public class Main {
    public static void main(String[] args) {
        SpiderMan spiderMan = new SpiderMan("Peter Parker", "laba-laba", "serangga");

        spiderMan.mengeluarkanJaring();
        spiderMan.makan();
        spiderMan.memanjat();
        spiderMan.berayun();
        System.out.println();
 

        Burung burung = new Burung(10,"Garuda");
        burung.terbang();
        burung.makan();
        System.out.println();

        
        Gatotkaca gatotkaca = new Gatotkaca("bekerja","Gatot kaca",50,"Garuda");
        gatotkaca.terbang();
        gatotkaca.makan();
    }
}
