/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unedo
 */
public class Customer {
    String name;
    String no_telp;
    String address;
    String postal_code;
    String email;
    
    public Customer(String name, String no_telp, String address, String postal_code, String email){
      registery(name, no_telp, address, postal_code, email);
    }
     public void registery(String name, String no_telp, String address, String postal_code, String email){
          this.name = name;
          this.no_telp = no_telp;
          this.address = address;
          this.postal_code = postal_code;
          this.email = email;
      }
     
}
