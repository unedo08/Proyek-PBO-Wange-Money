/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12S18026_YohanesSilitonga
 */
public class Transaction {
    String noTransaction;
    int totalTransaction;
    boolean transactionStatus;
    
    public Transaction(String noTransaction, int totalTransaction, boolean transactionStatus){
        create(noTransaction, totalTransaction, transactionStatus);
    }

    Transaction(Object object, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void create(String noTransaction,int totalTransaction, boolean transactionStatus){
        this.noTransaction = noTransaction;
        this.transactionStatus = transactionStatus;
        this.totalTransaction = this.totalTransaction;
    }
    
    public saldo saldo(int totalSaldo){
        return new saldo(totalSaldo);
    }
    
    public boolean getTransactionStatus(){
        return this.transactionStatus;
    }
    
    
}
