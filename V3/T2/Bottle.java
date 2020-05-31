package Tehtavat;

public class Bottle {
    private String name = "Pepsi Max";
    private String manufacturer = "Pepsi";
    private double total_energy = 0.3f;
    public Bottle(){}
    public Bottle(String name, String manuf, float totE){}
    
    public String getName(){
    	return name;
    }
    public String getManufacturer(){
    	return manufacturer;
    }
    public double getEnergy(){
    	return total_energy;
    }

	
}

