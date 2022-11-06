package JavaBasics;

public class Strings {

	public static void main(String[] args) {
		// String literal way to create String (it is an object)
		
		String s ="Selenium Automation";
		//String s1="Selenium";
		
		//Another way to create a string using new memory allocator
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String [] splitString = s.split("Automation");
		System.out.println(splitString[0]);
		//System.out.println(splitString[1]);
		
		
	}

}
