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
public class DasarOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Burung burung = new Burung("pudel",20,2);
        //Kucing kucing = new Kucing("Meong",3,4);
        //uburubur Uburubur = new uburubur("gery",5,10);
        
        burung.terbang();
        burung.terbang(2);
        burung.terbang("4");
        //kucing.berjalan();
        //Uburubur.berjalan();
    }
    
}

