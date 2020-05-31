import java.io.*; 
import java.util.*; 


public class Dog {
	
	private String name = "";
	private String says = "";
	private String[] input = {};
	private int i = 0;
	
	public Dog (String n) {
		n = n.trim(); 
		if(n.isEmpty())
			n = "Doge";
		System.out.println("Hey, my name is " + n + "!");
		name = n;
		says = "Much wow!";
	}
	
	public void speak(String s) {
		s = s.trim();
		input = s.split(" ");
		if(s.isEmpty())
			System.out.println(name + ": " + says);
		else
			
			
			System.out.println(Arrays.toString(input));
			while(i != input.length) {
				
				if(input[i].matches("^[0-9]+$"))
					System.out.println("Such integer: " + input[i]);
				else if(input[i].matches("true"))
					System.out.println("Such boolean: " + input[i]);
				else if(input[i].matches("false"))
					System.out.println("Such boolean: " + input[i]);
				else 
					System.out.println(input[i]);
				i++;
				
			}
	}
	
}
