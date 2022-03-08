/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.Bidang;

/**
 *
 * @author niken riri
 */
public class persegiPanjang implements menghitungBidang {
    private double panjang;
    private double lebar;
    
    public persegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double getPanjang(){
        return panjang;
    }
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public void setLebar(){
        this.lebar = lebar;
    }
    
    @Override
    public double luas(){
        return panjang*lebar;
    }
    
    @Override
    public double keliling(){
        return(panjang + lebar)*2;
    }
    
}
