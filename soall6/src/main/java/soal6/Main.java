package soal6;

public class Main {
    public static void main(String[] args) {
        SpiderMan spiderMan = new SpiderMan("Peter Parker", "Kalkun", "Jurnalis");

        spiderMan.berubah();
        spiderMan.berburu();
        spiderMan.berburu("Venom");
        spiderMan.mengeluarkanJaring();
        spiderMan.makan();
        spiderMan.memanjat();
        spiderMan.berayun();
        spiderMan.bekerja();
        spiderMan.tidur();

        System.out.println();

        System.out.println(spiderMan.namaHewan);
        System.out.println(spiderMan.makanan);
        System.out.println(spiderMan.energi);
        System.out.println(spiderMan.costMemanjat);
        System.out.println(spiderMan.costBerayun);
        System.out.println(spiderMan.getNamaOrang());
        System.out.println(spiderMan.getPekerjaan());
        System.out.println(spiderMan.getSisaEnergi());
    }
}
