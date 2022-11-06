package JavaBasics;

public class Methods {

	public static void main(String[] args) {
		// If you don't want to repeat lines, do it in method and access it by passing reference
		
		Methods m = new Methods();
		MethodCalling mc = new MethodCalling();
		mc.getUserData();
		//if a method is intrinsic to the same class and static no need to create object and it works directly
		getUserData2();
	}

	public static void getUserData2()
	{
		System.out.println("Hello World!");
	}
	
}
