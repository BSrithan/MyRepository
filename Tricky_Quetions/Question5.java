//Question5 :- Write a program to check if elements of an Array are same or not, when it reads from front and back.


//Program :-

//package Practice;

import java.util.Scanner;

public class HomePractice6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array :");
		int size = sc.nextInt();
		
		if(size != 0 && size > 0)
		{
		
			int[] array = new int[size];
		
			System.out.println();
			System.out.println("Enter any "+size+" Integers :");
		
			for(int i=0;i<array.length;i++)
			{
				array[i] =sc.nextInt();
			}
		
			//int[] array = {2,4,6,4,2};
			boolean bl = false;
		
			System.out.println("Elements of given Array :");
			System.out.println();
			for(int i=0;i<array.length;i++)
			{
				int a = array[i];
				System.out.print(a+"\t");
			}
		
			System.out.println();
			System.out.println();
			
			for(int i=0; i<array.length/2; i++)
			{
				if(array[i] != array[array.length-i-1])
				{
					bl = false;
				}
				else
					bl=true;
			}
		
			if(bl)
			{
				System.out.println("The Given Array Elements are same from front and Back");
			}
			else
			{
				System.out.println("The Given Array Elements are not same from front and Back");
			}
		}
		else
		{
			System.out.println("Enter Valid Array Size");
		}
		sc.close();

		
	}
	
}
