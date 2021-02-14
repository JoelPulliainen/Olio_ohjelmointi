/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainclass;

/**
 *
 * @author joelp
 */
abstract class Account {
    public abstract String getName();
    public abstract int getMoney();
    public abstract void depositMoney(int m);
    public abstract void withdrawMoney(int m);
    public abstract int getCredit();
}


class RegularAccount extends Account {
    String name;
    int amoney;
    public RegularAccount(String accountname, int money) {
        name = accountname;
        amoney = money;
    }
    
    public String getName(){
        return name;
    }
    public int getMoney() {
        return amoney;
    }
    public void depositMoney(int m) {
        amoney += m;
    }
    public void withdrawMoney(int m) {
        amoney -= m;
    }

    @Override
    public int getCredit() {
        return 0;
    }

}

class CreditAccount extends Account {
    String name;
    int amoney;
    int creditlimit;
    public CreditAccount(String accountname, int money, int credit) {
        name = accountname;
        amoney = money;
        creditlimit = credit;
    }
    
    public String getName(){
        return name;
    }
    public int getMoney() {
        return amoney;
    }
    
    public int getCredit() {
        return creditlimit;
    }
    public void depositMoney(int m) {
        amoney += m;
    }
    public void withdrawMoney(int m) {
        amoney -= m;
    }
}
