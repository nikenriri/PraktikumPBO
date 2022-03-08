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
public class lingkaran implements menghitungBidang {
    private double jarijari;
    
    public lingkaran(double jari){
        this.jarijari = jari;
    }
    public double getJari(){
        return jarijari;
    }
    public void setJari(double jari){
        this.jarijari = jari;
    }
    
    @Override
    public double luas(){
        if((jarijari % 7) == 0){
            return((22*jarijari*jarijari)/7);
        }else{
            return 3.14*jarijari*jarijari;
        }
    }
    
    @Override
    public double keliling(){
        if(jarijari % 7 == 0){
            return((22*2*jarijari)/7);
        }else{
            return 3.14*2*jarijari;
        }
    }
    
}
