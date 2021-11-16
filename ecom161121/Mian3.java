package ecom161121;

import java.util.Scanner;

// 3.	Write a Java program to test if an array contains a certain value
public class Mian3 {

	public static void main(String[] args) {


		int[] intArray = new int[] { 1789, 2035, 1899, 1456, 2013, 1458,
				2458, 1254, 1472, 2365, 1456, 2265, 1457,2456 };
				

		boolean found = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();

		for (int x : intArray) {
			if (x == number) {
				found = true;
				
				break;
			}
		}

		System.out.println(found);
		
		sc.close();
	}

}
