package Tehtavat;

import java.util.ArrayList;

public class BottleDispenser {
	private int bottles;
    private double money;
    ArrayList<Bottle> Bottles = new ArrayList<Bottle>();

    
    public BottleDispenser() {
        bottles = 5;
        money = 0;
        
        String[] Brands = {"Pepsi Max","Pepsi Max","Coca-Cola Zero","Coca-Cola Zero","Fanta Zero"};
        String[] Manufacturers = {"Pepsi","Pepsi","Coca-Cola","Coca-Cola","Coca-Cola"};
        double energy = 0.3;
        double[] sizes = {0.5, 1.5, 0.5, 1.5, 0.5};
        double[] prices = {1.8, 2.2, 2.0, 2.5, 1.95};
        
        for (int i = 0; i< 5; i++) {

			Bottle temp = new Bottle();
			temp.setName(Brands[i]);
			temp.setManufacturer(Manufacturers[i]);
			temp.setEnergy(energy);
			temp.setSize(sizes[i]);
			temp.setPrize(prices[i]);
        	Bottles.add(temp);
		}
        
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle(int pick) {
   
    	Bottle temp2 = Bottles.get(pick-1);
    	if(bottles < 1)
    		System.out.println("No bottles remaining!");
    	else if(money < temp2.getPrize())
    		System.out.println("Add money first!");
    	else {
    		System.out.println("KACHUNK! " + temp2.getName() + " came out of the dispenser!");
			Bottles.remove(temp2);
    		bottles -= 1;
			money -= temp2.getPrize();
    	}
    }
    
    public void returnMoney() {
    	System.out.format("Klink klink. Money came out! You got " + "%.2f" + "€ back\n",money);
    	money = 0;
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

