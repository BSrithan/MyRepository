//Question3 :- Take 20 integer inputs from user and Store them in an Array and print the following :
//             -Number of Even Numbers
//	       -Number of Odd Numbers	
//             -Number of Positive Numbers
//             -Number of Negative Numbers
//	       -Number of Zero's

//Program :-

package Practice;

import java.util.Scanner;

public class HomePractice3 {

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
			int even = 0;
			int odd = 0;
			int pos = 0;
			int neg = 0;
			int zero = 0;
			for(int i=0;i<array.length;i++)
			{
				if(array[i] % 2 == 0 && array[i] >= 0)
				{
					even++;
				}
				else if(array[i] % 2 != 0 && array[i] > 0)
				{
					odd++;
				}
			}
		
			for(int i=0;i<array.length;i++)
			{
				if(array[i] > 0)
				{
					pos++;
				}
				else if(array[i] < 0)
				{
					neg++;
				}
				else if(array[i] == 0)
				{
					zero++;
				}
			}
			System.out.println();
			System.out.println("Total number of Even Numbers present in an Array :"+even);
			System.out.println("Total number of Odd Numbers present in an Array :"+odd);
			System.out.println("Total number of Positive Numbers present in an Array :"+pos);
			System.out.println("Total number of Negative Numbers present in an Array :"+neg);
			System.out.println("Total number of Zero's present in an Array :"+zero);
		}
		else
		{
			System.out.println("Enter Valid Array Size");
		}
		sc.close();

	}

}
