package Mainclass;

/**
 *
 * @author joelp
 */
import java.util.Scanner;

public class Mainclass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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
				System.out.println("Account number: "+accountNumber);
				System.out.println("Amount of money: " + depositMoney);
				break;
			case 2:
				System.out.print("Give an account number: ");
				scan.nextLine();
				accountNumber = scan.nextLine();
				System.out.print("Amount of money to deposit: ");
				depositMoney = scan.nextInt();
				System.out.print("Give a credit limit: ");
				credit = scan.nextInt();
				System.out.println("Account number: "+accountNumber);
				System.out.println("Amount of money: " + depositMoney);
				System.out.println("Credit: "+credit);
				break;
			case 3:
				System.out.print("Give an account number: ");
				scan.nextLine();
				accountNumber = scan.nextLine();
				System.out.print("Amount of money to deposit: ");
				depositMoney = scan.nextInt();
				System.out.println("Account number: "+accountNumber);
				System.out.println("Amount of money: " + depositMoney);
				break;
			case 4:
				System.out.print("Give an account number: ");
				scan.nextLine();
				accountNumber = scan.nextLine();
				System.out.print("Amount of money to withdraw: ");
				depositMoney = scan.nextInt();
				System.out.println("Account number: "+accountNumber);
				System.out.println("Amount of money: " + depositMoney);
				break;
			case 5:
				System.out.print("Give the account number of the account to delete: ");
				scan.nextLine();
				accountNumber = scan.nextLine();
				System.out.println("Account number: "+accountNumber);
				break;
			case 6:
				scan.nextLine();
				System.out.print("Give the account number of the account to print information from: ");
				accountNumber = scan.nextLine();
				System.out.println("Account number: "+accountNumber);
				break;
			case 7:
				System.out.println("Prints every account");
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

