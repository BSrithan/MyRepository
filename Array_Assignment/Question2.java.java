//Q2 :- Write a Program to Reverse an Array..?

//Program :-

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50,60};
		System.out.println("Original Array :");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		System.out.println();
		System.out.println("Reverse Array :");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+"\t");
		}
	}

}