package Tehtavat;

public class BottleDispenser {
	private int bottles;
    private int money;
    
    public BottleDispenser() {
        bottles = 5;
        money = 0;
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
    	if(bottles < 1)
    		System.out.println("No bottles remaining!");
    	else if(money < 1)
    		System.out.println("Add money first!");
    	else
    		System.out.println("KACHUNK! A bottle came out of the dispenser!");
    		bottles -= 1;
			money -= 1;
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
}

