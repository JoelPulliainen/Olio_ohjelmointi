import java.util.Scanner;



public class Mainclass {
	public static void main(String[] args) {
		
		String name1 = "";
	
		
		String speech1 = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Give a name to the dog: ");
		name1 = scan.nextLine();
		Dog dog1 = new Dog(name1);
		
		System.out.print("What does the dog say: ");
		speech1 = scan.nextLine();
		dog1.speak(speech1);
		
	}
}