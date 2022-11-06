package JavaBasics;

import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 15, 1111 };

		// Print the values which are multiplied by 2 from the set of Array values
		System.out.println("Array values muiltiples of 2 are as below:");
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
			} else {
				System.out.println("These numbers are not multiples of 2  >>> " + arr2[i]);
			}
		}
		// ArrayList basics

		ArrayList<String> a = new ArrayList<String>();
		a.add("Ryan");
		a.add("NIDHI");
		a.add("SARYU");
		a.add("ASHOK");
		System.out.println("Arraylist data extracted is : >>>>>>> " + a.get(3));
	}

}
