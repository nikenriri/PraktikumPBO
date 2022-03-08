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
public class Kucing extends Hewan {
   

    public Kucing(String nama, int umur, int jmlkaki) {
        super(nama, umur, jmlkaki);
    }
    

    void lompat(){
        System.out.println("Bisa Lompat");
    }
    
}
