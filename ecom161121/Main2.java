package ecom161121;
//2.	Write a Java program to calculate average value of an array elements
public class Main2 {

	public static void main(String[] args) {
		int array[]= {1,2,4,7};
		
		int count=0;
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
			count++;
		}
		double avg=(double)sum/count;
		System.out.println("average="+avg);
		System.out.println("sum= "+sum);
		System.out.println("count= "+count);
		System.out.println(avg);

	}

}
