
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yohan
 */
public class transactionHistory {
    Date date;
    int amount;
    
    public transactionHistory(Date date, int amount){
        addTransactionHistory(date, amount);
    }

    public void addTransactionHistory(Date date, int amount) {
        this.date = date;
        this.amount = amount;
    }
    
}
