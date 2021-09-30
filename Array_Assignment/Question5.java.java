//Q5 :- Move all Negative Elements to one side of the Array..?

//Program :-

public class NegativeArray {
	
	public static void main(String[] args) {
				
		int[] a1 = {1,2,-3,4,-6,7,-1,-2,3,-4};
		int a2;
		int j=0;
		
		System.out.println("Original Array :");
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+"\t");
		}
		
		for(int i1=0;i1<a1.length;i1++)
		{
			if(a1[i1]>0)
			{
				if(i1 != j)
				{
					a2 = a1[i1];
					a1[i1] = a1[j];
					a1[j] = a2;
				}
				j++;
			}
		}
		
		System.out.println();
		
		System.out.println("Modified Array :");
		for(int k=0;k<a1.length;k++)
		{	
			System.out.print(a1[k]+"\t");
		}				
	
	}

}
