/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainclass;

import java.util.ArrayList;

/**
 *
 * @author joelp
 */
public class Bank {
    
    private ArrayList<Account> accounts;
    
    Bank(){
        accounts = new ArrayList<Account>();
    }
    
    void removeAccount(String accountname) {
        if (accounts.isEmpty()) {
        }
        else {
            accounts.removeIf(n -> (n.getName().equals(accountname)));
        }
    }
    
    void addAccount(String accountname, int money) {
        RegularAccount temp = new RegularAccount(accountname, money);
        accounts.add(temp);
        System.out.println("Account created.");
    }
    
    void addCreditAccount(String accountname, int money, int credit) {
        CreditAccount temp = new CreditAccount(accountname, money, credit);
        accounts.add(temp);
        System.out.println("Account created.");
    }
    
    void addMoney(String accountname, int money) {
        if (accounts.isEmpty()) {
        }
        else {
            for (Account account : accounts) {
                if (account.getName().equals(accountname)) {
                    account.depositMoney(money);
                }
            }
        }
    }
        
    void takeMoney(String accountname, int money) {
        if (accounts.isEmpty()) {
        }
        else {
            for (Account account : accounts) {
                if (account.getName().equals(accountname)) {
                    account.withdrawMoney(money);
                }
            }
        }
    }
        
        
    Account searchAccount(String faccount) {
        if (accounts.isEmpty()) {
            return null;
        }
        else {
            for (Account account : accounts) {
                if (account.getName().equals(faccount)) {
                    return account;
                }
            }
        return null;
        }
    }
    
}


