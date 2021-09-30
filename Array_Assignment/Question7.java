//Q7 :- Find Factorial of a Large Number..?

//Program :-

public class FactorialArray {
	
	public static void main(String[] args)
	{
		int[] a = {5,3,6,4,1,7,9,2,8};
		int a1;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					a1 = a[i];
					a[i] = a[j];
					a[j] = a1;
				}
			}
		}
		System.out.println("Largest Number of an Array :"+a[a.length-1]);
		
		int largeNo = a[a.length-1];
		int fact = 1;
		
		for(int i=1;i<=largeNo;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+largeNo+" is :"+fact);
	}

}
