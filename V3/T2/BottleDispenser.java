package Tehtavat;

public class BottleDispenser {
	private int bottles;
	 // The array for the Bottle-objects
    private Bottle[] bottle_array;
    private int money;


    public BottleDispenser() {
        bottles = 50;
        money = 0;
        
        // Initialize the array
        bottle_array = new Bottle[bottles];
        // Add Bottle-objects to the array
        for(int i = 0;i<bottles;i++) {
            // Use the default constructor to create new Bottles
            bottle_array[i] = new Bottle();
        }
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
    		System.out.println("KACHUNK! " + bottle_array[0].getName() + " bottle came out of the dispenser!");
    		bottles -= 1;
			money -= 1;
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
}

