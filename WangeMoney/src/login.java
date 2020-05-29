/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12S18026_YohanesSilitonga
 */
class login {
    String username;
    String password;
    Boolean loginStatus;
    Customer email;
    
    public void create(String username,String password,boolean loginStatus){
        this.username = username;
        this.password = password;
        this.loginStatus = loginStatus;
    }
    
    public login(String username, String password, boolean loginStatus){
        create(username, password, loginStatus);
    }
    
    public void create(String username,String password, Customer email){
        this.username = username;
        this.password = password;
        this.email = email;
        this.loginStatus = loginStatus;
    
    }
    
    public void register(String username, String password, Customer email){
        create(username, password, email);
    }

    public boolean getStatus(){
        return this.loginStatus;
    }

}
