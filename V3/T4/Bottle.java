package Tehtavat;

public class Bottle {
    private String name = "Pepsi Max";
    private String manufacturer = "Pepsi";
    private double total_energy = 0.3;
    private double size = 0.5;
    private double prize = 1.8;
    public Bottle(){}
    public Bottle(String name, String manuf, float totE, float siz, float priz){}
    
    public String getName(){return name;}
    public String getManufacturer(){return manufacturer;}
    public double getEnergy(){return total_energy;}
    public double getSize() {return size;}
    public double getPrize() {return prize;}
    
}

