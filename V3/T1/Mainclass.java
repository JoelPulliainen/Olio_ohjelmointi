package Tehtavat;

public class Mainclass {
	
	
	public static void main(String[] args) {
		BottleDispenser Machine = new BottleDispenser();
		
				
		Machine.addMoney();
		Machine.buyBottle();
		Machine.buyBottle();
		Machine.addMoney();
		Machine.addMoney();
		Machine.buyBottle();
		Machine.returnMoney();
	}	
}
