//Q4 :- Find The Occurence of an Integer in the Array..?

//Program :-

import java.util.Scanner;

public class IntegerOccurence {
	
	public static void main(String[] args) {
		
		int[] a = {5,8,5,7,4,5,8,8,9,10,8,24,12,23,8,2,4,5,6,8,2,6,8};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of an Integer :");
		
		int x=sc.nextInt();
		sc.close();
		
		int occurence = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(x == a[i])
			{
				occurence++;
			}
		
		}
		System.out.println("Total Number of Occurence of an integer "+x+" : "+occurence);
	}

}
