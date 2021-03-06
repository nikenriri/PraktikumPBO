/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beasiswa.kuis;

/**
 *
 * @author niken riri
 */
public class BeasiswaPelajar extends Pendaftar implements Seleksi {

    public BeasiswaPelajar(String nama, String usia, int nStruktur, int nVisual, int nDesign, int nJurnal, int nRelev, int nProb){
        super(nama,usia,nStruktur,nVisual,nDesign,nJurnal,nRelev,nProb);
    }

    public void inputStruktur(int nextInt) {
        this.nStruktur = nStruktur;
    }

    public void inputVisual(int nextInt) {
        this.nVisual = nVisual;
    }

    public void inputDesign(int nextInt) {
        this.nDesign = nDesign;
    }
    
    @Override
    public double hitungNilai1(){
     return(0.6*super.nJurnal)+(0.25*super.nRelev)+(0.15*super.nProb);
    }
    
    @Override
    public String keterangan(){
     if(this.hitungNilai1()>= 87.5)
         return "LOLOS SELEKSI MENDAPATKAN BEASISWA MAHASISWA";
     else
         return "MAAF ANDA GAGAL";
    }

    @Override
    public double hitungNilai() {
        return(0.5*super.nStruktur)+(0.2*super.nVisual)+(0.3*super.nDesign);
    }
}
