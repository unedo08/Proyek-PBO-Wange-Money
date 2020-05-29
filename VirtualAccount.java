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
public class VirtualAccount {
    int VirtualAccountId;
    
    public void make(int VirtualAccountId){
        this.VirtualAccountId = VirtualAccountId;
    }
    
    public VirtualAccount(int VirtualAccountId){
        make(VirtualAccountId);
    }
}
