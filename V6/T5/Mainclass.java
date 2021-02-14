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
import java.util.Scanner;

public class Mainclass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
                Bank bank = new Bank();
		int choice = 0;
		int breaker = 0;
		String accountNumber = "";
		int depositMoney = 0;
		int credit = 0;
		do {
			System.out.println("\n*** BANK SYSTEM ***");
			System.out.println("1) Add a regular account");
			System.out.println("2) Add a credit account");
			System.out.println("3) Deposit money");
			System.out.println("4) Withdraw money");
			System.out.println("5) Remove an account");
			System.out.println("6) Print account information");
			System.out.println("7) Print all accounts");
			System.out.println("0) Quit");
			System.out.print("Your choice: ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Give an account number: ");
				scan.nextLine();
				accountNumber = scan.nextLine();
				System.out.print("Amount of money to deposit: ");
				depositMoney = scan.nextInt();
				bank.addAccount(accountNumber, depositMoney);
				break;
			case 2:
				System.out.print("Give an account number: ");
				scan.nextLine();
				accountNumber = scan.nextLine();
				System.out.print("Amount of money to deposit: ");
				depositMoney = scan.nextInt();
				System.out.print("Give a credit limit: ");
				credit = scan.nextInt();
				bank.addCreditAccount(accountNumber, depositMoney, credit);
				break;
			case 3:
				System.out.print("Give an account number: ");
				scan.nextLine();
				accountNumber = scan.nextLine();
				System.out.print("Amount of money to deposit: ");
				depositMoney = scan.nextInt();
				bank.addMoney(accountNumber, depositMoney);
				break;
			case 4:
				System.out.print("Give an account number: ");
				scan.nextLine();
				accountNumber = scan.nextLine();
				System.out.print("Amount of money to withdraw: ");
				depositMoney = scan.nextInt();
				bank.takeMoney(accountNumber, depositMoney);
				break;
			case 5:
				System.out.print("Give the account number of the account to delete: ");
				scan.nextLine();
				accountNumber = scan.nextLine();
                                bank.removeAccount(accountNumber);
                                System.out.println("Account removed.");
				break;
			case 6:
				scan.nextLine();
				System.out.print("Give the account number of the account to print information from: ");
				accountNumber = scan.nextLine();
				Account temp = bank.searchAccount(accountNumber);
                                if (temp == null) {
                                    System.out.println("Account does not exist");
                                } else if (temp.getCredit() == 0) {
                                    System.out.println("Account number: " + temp.getName() + " Amount of money: " + temp.getMoney());
                                } else {
                                    System.out.println("Account number: " + temp.getName() + " Amount of money: " + temp.getMoney() + " Credit limit: " + temp.getCredit());
                                }
				break;
			case 7:
				System.out.println("All accounts:");
                                for (Account account : bank.accounts) {
                                    if (account.getCredit() != 0) {
                                        System.out.println("Account number: " + account.getName() + " Amount of money: " + account.getMoney() + " Credit limit: " + account.getCredit());
                                    } else {
                                        System.out.println("Account number: " + account.getName() + " Amount of money: " + account.getMoney());
                                    }
                                }
				break;
			case 0:
				breaker++;
				break;
			default:
				System.out.println("Invalid choice.");
			}
		} while (breaker == 0);
                scan.close();
	}
}
