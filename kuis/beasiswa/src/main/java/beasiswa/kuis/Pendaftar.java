package beasiswa.kuis;

/**
 *
 * @author niken riri
 */
import java.util.Scanner;
public class Pendaftar {
    String nama,usia;
    int nStruktur, nVisual, nDesign, nJurnal, nRelev, nProb;
    
    public Pendaftar(String nama,String usia,int nStruktur, int nVisual, int nDesign, int nJurnal, int nRelev, int nProb ){
        this.nama = nama;
        this.usia = usia;
        this.nStruktur = nStruktur;
        this.nVisual = nVisual;
        this.nDesign = nDesign;
        this.nJurnal = nJurnal;
        this.nRelev = nRelev;
        this.nProb = nProb;
    }
}
