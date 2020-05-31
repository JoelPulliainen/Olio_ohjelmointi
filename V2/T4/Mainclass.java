import java.util.Scanner;

public class Mainclass {
	public static void main(String[] args) {
		
		String name1 = "";
		String speech1 = "";
		
		int breaker = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Give a name to the dog: ");
		name1 = scan.nextLine();
		Dog dog1 = new Dog(name1);
		
		while(speech1.trim().length() == 0) {
			System.out.print("What does a dog say: ");
			speech1 = scan.nextLine();
			dog1.speak(speech1);
		}
	}
}