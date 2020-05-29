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
public class Customer {
     String name;
    String no_telp;
    String address;
    String postal_code;
    String email;
     int totalSaldo;
     int  totalTransaction;

    
    public Customer(String name, String no_telp, String address, String postal_code, String email){
      create(name, no_telp, address, postal_code, email);
    }
    
    
     public void create(String name, String no_telp, String address, String postal_code, String email){
          this.name = name;
          this.no_telp = no_telp;
          this.address = address;
          this.postal_code = postal_code;
          this.email = email;
      }
     
     public UserAccount login(String username, String password, boolean loginStatus){
         return new UserAccount(username, password, false);
     }
     
    
     public void register(UserAccount regist){
        regist.create(null, null, this);
     }
     
     public VirtualAccount VirtualAccount(int VirtualAccountId){
         return new VirtualAccount(VirtualAccountId);
     }
     
     public boolean loginStatus(UserAccount status){
        status.loginStatus = true;
        return status.getStatus();
     }
     
     public Transaction Transaction(String noTransaction, boolean transactionStatus){
         return new Transaction(null, false);
     }
     
     public boolean transactionStatus(Transaction transactionStatus){
         transactionStatus.transactionStatus = true;
         return transactionStatus.getTransactionStatus();
     }
     
       /*
        *   
        *
        public void makeTransaction(){
        if(this.totalSaldo != 0 && this.totalSaldo > this.Transaction.totalTransaction){
            System.out.println("Dapat dapat melakukan Transaksi");
        } else {
            System.out.println("Tidak dapat melakukan Transaksi");
        } 
    }*/
}
