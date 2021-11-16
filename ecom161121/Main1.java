package ecom161121;

//1.	Write a Java program to sum values of an array. (array has 10 values)

public class Main1 {

	public static void main(String[] args) {
		
		int array[]= {2,4,7,5,8,9,10,15,20};
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}System.out.println(sum);

	}

}
