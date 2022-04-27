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
public class BeasiswaMahasiswa extends Pendaftar implements Seleksi {

    public BeasiswaMahasiswa(String nama, String usia, int nStruktur, int nVisual, int nDesign,int nJurnal, int nRelev, int nProb) {
        super(nama,usia,nDesign,nVisual,nStruktur,nJurnal,nRelev,nProb);
    }
    
    public void inputJurnal(int nextInt) {
        this.nJurnal = nJurnal;
    }

    public void inputRelev(int nextInt) {
        this.nRelev = nRelev;
    }

    public void inputProb(int nextInt) {
        this.nProb = nProb;
    }
    
 @Override
 public double hitungNilai(){
     return(0.5*super.nStruktur)+(0.2*super.nVisual)+(0.3*super.nDesign);
 }
 
 @Override
 public String keterangan(){
     if(this.hitungNilai()>= 87.5)
         return "LOLOS SELEKSI MENDAPATKAN BEASISWA MAHASISWA";
     else
         return "MAAF ANDA GAGAL";
 }

 @Override
 public double hitungNilai1() {
    return(0.6*super.nJurnal)+(0.25*super.nRelev)+(0.15*super.nProb);
 }
    
}
