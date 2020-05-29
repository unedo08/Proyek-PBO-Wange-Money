/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yohan
 */
public class expansePerDay {
    transactionHistory inDayHistory;
    
    public expansePerDay(transactionHistory inDayHistory){
        view(inDayHistory);
    }
    
    public void view(transactionHistory inDayHistory){
        this.inDayHistory = inDayHistory;
    }
}
