package Tehtavat;

import java.util.ArrayList;

public class BottleDispenser {
	private int bottles;
	 // The array for the Bottle-objects
    //private Bottle[] bottle_array;
    private int money;
    

    
    ArrayList<Bottle> Bottles = new ArrayList<Bottle>();

    
    public BottleDispenser() {
        bottles = 5;
        money = 0;
        /*
        // Initialize the array
        bottle_array = new Bottle[bottles];
        // Add Bottle-objects to the array
        for(int i = 0;i<bottles;i++) {
            // Use the default constructor to create new Bottles
            bottle_array[i] = new Bottle();
        }*/
        for (int i = 0; i< 5; i++) {
			Bottle temp = new Bottle();
			Bottles.add(temp);
		}
        
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
	Bottle temp2 = Bottles.get(0);
    	if(bottles < 1)
    		System.out.println("No bottles remaining!");
    	else if(money < temp2.getPrize())
    		System.out.println("Add money first!");
    	else {
    		System.out.println("KACHUNK! " + temp2.getName() + " came out of the dispenser!");
			Bottles.remove(temp2);
    		bottles -= 1;
			money -= 1;
    	}
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
    
    public void ListBottles() {
    	int index = 1;
    	for (Bottle mini : Bottles) {
			System.out.println(index + ". Name: " + mini.getName());
			System.out.println("\tSize: " + mini.getSize() + "\tPrice: " + mini.getPrize());
			index++;
		}
    	
    }
   
}

