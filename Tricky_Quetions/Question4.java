//Question4 :- Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array
//	       but in Reverse order..? 

//Program :-

//package Practice;

import java.util.Scanner;

public class HomePractice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array :");
		int size = sc.nextInt();
		
		if(size !=0 && size > 0)
		{
			int[] array = new int[size];
		
			System.out.println();
			System.out.println("Enter any "+size+" Integers :");
			
			for(int i=0;i<array.length;i++)
			{
				array[i] = sc.nextInt();
			}
			
			System.out.println();
			System.out.println("Array of Given Integers :");
			System.out.println();
		
			for(int i=0;i<array.length;i++)
			{
				int a = array[i];
				System.out.print(a+"\t");
			}
		
			System.out.println();
			System.out.println();
			System.out.println("New Array of Given Integers in Reverse :");
			System.out.println();
		
			int[] array2 = new int[array.length];
		
			System.out.println();
			for(int i=0;i<array.length;i++)
			{
				array2[i] = array[array.length-i-1];
				int b = array2[i];
				System.out.print(b+"\t");
			}
		}
		else
		{
			System.out.println("Enter Valid Array Size");
		}
		
		sc.close();
	}

}
