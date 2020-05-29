/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12S18026_YohanesSilitonga
 */
public class saldo {
    int totalSaldo;
    int topUpMoney;
    virtualAccount virtualAccountId;
    int moneyChanges;
   
    
    public saldo(int totalSaldo){
        create(totalSaldo);
    }
    
    public void create(int totalSaldo){
        this.totalSaldo = totalSaldo;
    }
    
    public void create(int topUpMoney,  virtualAccount virtualAccountId){
        this.topUpMoney = topUpMoney;
        this.virtualAccountId = virtualAccountId;
    }
    public void topUp(int topUpMoney, virtualAccount virtualAccountId){
        create(topUpMoney, virtualAccountId);
    }
    
    

    /*public class moneyChanges {

        Transaction totalTransaction;

        public moneyChanges() {
            moneyChanges = totalSaldo - this.totalTransaction ;
        }
    }*/
}
