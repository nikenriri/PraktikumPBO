/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak1;

/**
 *
 * @author niken riri
 */
public class Burung extends Hewan{
 
    public Burung(String nama, int umur, int jmlkaki) {
        super(nama, umur, jmlkaki);
    }
    
    @Override
    void berjalan(){
        System.out.println("Burung bisa terbang");
    }
    void terbang(){
        System.out.println("Bisa Terbang");
    }
    void terbang(int jarak){
        System.out.println(nama + " sudah terbang sejauh " + jarak + " km.");
    }
    void terbang(String jarak){
        System.out.println(nama + " sudah terbang sejauh " + jarak + " km.");
    }
}
