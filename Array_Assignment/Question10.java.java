//Q10 :- Write a Program to find the sum and Product of all Elements of an Array..?

//Program :-

public class SumProduct {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		int product = 1;
		
		System.out.println("Sum of the Elements of an Array :");
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
			product = product * a[i];
		}
		System.out.println(sum);
		
		System.out.println();
		
		System.out.println("Product of the Elements of an Array :");
		System.out.println(product);
	}

}
