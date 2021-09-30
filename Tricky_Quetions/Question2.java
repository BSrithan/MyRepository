//Question2 :- Take 10 Integer inputs from user and store them in an Array. Again ask user to enter a number and now tell user
//             to check whether that number is present in an Array or not..?

//program :-

//package Practice;

import java.util.Scanner;

public class HomePractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Array :");
		int size = sc.nextInt();
		
		if(size != 0 && size > 0)
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
			System.out.println("Enter Any Value :");
			int num = sc.nextInt();
		
			boolean b = false;
			for(int i=0;i<array.length;i++)
			{
				if(num == array[i])
				{
					b = true;
				}
			}
			if(b)
			{
				System.out.println("The given Number "+num+" is present in Array");
			}
			else
				System.out.println("The given Number "+num+" is not present in Array");
		}
		else
		{
			System.out.println("Enter Valid Array Size");
		}
		
		sc.close();

	}

}
