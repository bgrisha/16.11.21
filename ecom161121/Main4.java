package ecom161121;

import java.util.Scanner;

//4.	Write a Java program to find the index of an array element.
public class Main4 {

	public static void main(String[] args) {

		int array[]= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			  if (array[i] == number) {
			    System.out.println("index is ="+i);
			    break;
			  }
				 
			  
			} 
			 
	}
}