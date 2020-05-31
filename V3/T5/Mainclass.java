package Tehtavat;

import java.util.Scanner;

public class Mainclass {
	
	
	public static void main(String[] args) {
		BottleDispenser Machine = new BottleDispenser();
		int choice = 0;
		int choice2 = 0;
		int breaker = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("\n*** BOTTLE DISPENSER ***");
			System.out.println("1) Add money to the machine");
			System.out.println("2) Buy a bottle");
			System.out.println("3) Take money out");
			System.out.println("4) List bottles in the dispenser");
			System.out.println("0) End");
			System.out.print("Your choice: ");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				Machine.addMoney();
				break;
			case 2:
				Machine.ListBottles();
				System.out.print("Your choice: ");
				choice2 = scan.nextInt();
				Machine.buyBottle(choice2);
				break;
			case 3:
				Machine.returnMoney();
				break;
			case 4:
				Machine.ListBottles();
				break;
			case 0:
				breaker++;
				break;
			default:
				System.out.println("Invalid input.");
			}
		} while(breaker == 0);
	scan.close();
	}	
}
