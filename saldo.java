/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Conro Manuel
 */
public class saldo {
    int totalSaldo;
    int topUpMoney;
    VirtualAccount VirtualAccountId;
    int moneyChanges;
   
    
    public saldo(int totalSaldo){
        create(totalSaldo);
    }
    
    public void create(int totalSaldo){
        this.totalSaldo = totalSaldo;
    }
    
    public void create(int topUpMoney,  VirtualAccount VirtualAccountId){
        this.topUpMoney = topUpMoney;
        this.VirtualAccountId = VirtualAccountId;
    }
    public void topUp(int topUpMoney, VirtualAccount VirtualAccountId){
        create(topUpMoney, VirtualAccountId);
    }
    
    

    /*public class moneyChanges {
        Transaction totalTransaction;
        public moneyChanges() {
            moneyChanges = totalSaldo - this.totalTransaction ;
        }
    }*/
}
}
