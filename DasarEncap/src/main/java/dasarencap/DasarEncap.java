/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasarencap;

import java.util.Scanner;

/**
 *
 * @author niken riri
 */
public class DasarEncap {

    public static void main(String[] args) {
        User user = new User("Deva123","1234567");
        
        System.out.println("Userame saya : " + user.getUsername());
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama : ");
        String name = input.next();
        System.out.println("Masukkan password : ");
        String pass = input.next();
        
        if(user.login(name, pass)){
            System.out.println("Login Berhasil!");
        }else{
            System.out.println("Login Gagal!");
        }
    }
    
}
