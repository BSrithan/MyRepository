//Q3 :- Write a program to Sort the given Array..?

//Program :-

import java.util.Arrays;

public class SortingArray {
	
	public static void main(String[] args) {
		
		int[] a = {20,10,-20,40,-40,-10,-30,50,-50,30};
		
		System.out.println("Original Array :");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		System.out.println();
		System.out.println();
		
		Arrays.sort(a);
		
		System.out.println("Array Sorting :");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}

}
