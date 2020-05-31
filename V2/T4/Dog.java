public class Dog {
	private String name = "";
	private String says = "";
	
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
		if(s.isEmpty())
			System.out.println(name + ": " + says);
		else
			System.out.println(name + ": " + s);
	}
	
}
