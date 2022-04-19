/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankexamp;

import javax.ejb.Stateful;

/**
 *
 * @author Dell
 */
@Stateful
public class BankTransaction implements BankTransactionLocal {

   //let consider default balance amount = 10000
    
    int balance = 10000;
    
    @Override
    public void deposite(int amount) {
        balance = balance + amount;
    }

    @Override
    public int withdraw(int amount) {
        balance = balance - amount;
        return balance;
    }
}
