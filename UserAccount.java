/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wangemoney;

/**
 *
 * @author Alex Conro Manuel
 */
  public class UserAccount {
     String username;
     String password;
     Boolean loginStatus;
     Customer email;
     private String[][] accounts = {{"anthony", "supernova"},{"steve", "java1"}};
     public void create(String username,String password,boolean loginStatus){
        this.username = username;
        this.password = password;
        this.loginStatus = loginStatus;
    }
    
    public UserAccount(String username, String password, boolean loginStatus){
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

    public UserAccount(String username, String password) 
    {
        this.username = username;
        this.password = password;
        boolean active;
    }

    public boolean checkPassword()
    {

        if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1])))
            return true;
        else
            return false;
    }

    public void deactivateAccount()
    {
        boolean active = false;
    }
}
