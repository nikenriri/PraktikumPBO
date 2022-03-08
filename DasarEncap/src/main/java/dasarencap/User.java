/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasarencap;

/**
 *
 * @author niken riri
 */
public class User {
    private String username;
    private String password;
    
    //constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //setter getter
    public String getUsername() { //mengambil data = getter
        return username;
    }

    public void setUsername(String username) { //mengisi data atau nialai = setter
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    boolean login(String username, String password){
        if(this.username.equals(username)&&this.password.equals(password)){
            return true;
        }else{
            return false;
        }
    }
    
    
}
