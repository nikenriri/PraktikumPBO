/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.Ruang;
import tugas2.Bidang.persegiPanjang;

/**
 *
 * @author niken riri
 */
public class Balok extends persegiPanjang implements menghitungRuang{
    private double tinggi;
    
    public Balok(double tinggi, double panjang, double lebar){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        return luas()*tinggi;
    }
    
    @Override
    public double luasPermukaan(){
        return (luas()+(getPanjang()*tinggi+getLebar()*tinggi))*2;
    }
    
}
