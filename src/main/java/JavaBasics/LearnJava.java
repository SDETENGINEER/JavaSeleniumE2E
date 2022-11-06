package JavaBasics;

public class LearnJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Num =5;
		//Arrays-
		int [] arr = new int[5];
		//assigning array the values
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		//Another shortcut for Array value assignment-
		int [] arr2= {1,2,3,4,5,6,7,8,9,11,13,15,1111};
		
		 System.out.println("This is Java Basics!!");
		 System.out.println(arr2[0]);
		 
		 //To print array values using loop - Loop introduction
		 for(int i=1; i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 System.out.println("This is to print for loop with shortcut array assignment");
		 for(int i=0;i<arr2.length; i++)
		 {
			 System.out.println(arr2[i]);
		 }
		 
		 //String array variable
		 System.out.println("Printing String array values>>>>>>>");
		 String[] name= {"Ryan","Wife","Mother","Father","Myself"};
		 for(int i=0; i<name.length; i++)
		 {
			 System.out.println(name[i]);
		 }
		 
		 System.out.println("Enhanced For loop practice>>>");
		 
		 for(String S:name)
		 {
			 System.out.println(S);
		 }
		
	}
	

}
