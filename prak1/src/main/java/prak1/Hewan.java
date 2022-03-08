/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak1;


public class Hewan {
    String nama;
    int umur;
    int jmlkaki;

    public Hewan(String nama, int umur, int jmlkaki) {
        this.nama = nama;
        this.umur = umur;
        this.jmlkaki = jmlkaki;
    }
    

    void berjalan(){
        System.out.println(nama + "Bisa Berjalan");
    }
}
