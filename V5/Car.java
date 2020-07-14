package Tehtavat;

public class Car {
	
	Car() {
		Body body = new Body();
		Chassis chassis = new Chassis();
		Engine engine = new Engine();
		Wheel wheel = new Wheel();
	}
	void print() {
		System.out.println("Car parts:");
		System.out.println("\tBody");
		System.out.println("\tChassis");
		System.out.println("\tEngine");
		System.out.println("\t4 Wheel");
	}
	
	
	class Chassis {
		Chassis() {
			System.out.println("Manufacturing: Chassis");
		}
		
	}
	
	class Body {
		Body() {
			System.out.println("Manufacturing: Body");
		}
	}
	
	class Engine {
		Engine() {
			System.out.println("Manufacturing: Engine");
		}
		
	}
	
	class Wheel {
		Wheel() {
			for (int i = 0; i < 4; i++) {
				System.out.println("Manufacturing: Wheel");
			}
		}
		
	}
	
	
	
	
	
}
