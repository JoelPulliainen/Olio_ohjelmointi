package Tehtavat;

/**
 *
 * @author joelp
 */
public class Car {
    
    private String Body;
    private String Chassis;
    private String Wheel;
    int nWheel;
    private String Engine;
    
    Car() {
		Body body = new Body();
		Chassis chassis = new Chassis();
		Engine engine = new Engine();
		Wheel wheel = new Wheel();
	}
	
	
	class Chassis {
		Chassis() {
                        Chassis = "Chassis";
			System.out.println("Manufacturing: Chassis");
		}
		
	}
	
	class Body {
		Body() {
                        Body = "Body";
			System.out.println("Manufacturing: Body");
		}
	}
	
	class Engine {
		Engine() {
                        Engine = "Engine";
			System.out.println("Manufacturing: Engine");
		}
		
	}
	
	class Wheel {
		Wheel() {
			for (int i = 1; i < 5; i++) {
				System.out.println("Manufacturing: Wheel");
                                nWheel = i;
			}
                        Wheel = "Wheel";
                        
		}
		
	}
        
        void print() {
		System.out.println("Car parts:");
		System.out.println("\t" + Body);
		System.out.println("\t" + Chassis);
		System.out.println("\t" + Engine);
		System.out.println("\t" + nWheel + " " + Wheel);
	}	
}
