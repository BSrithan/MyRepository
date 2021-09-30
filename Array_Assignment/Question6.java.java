//Q6 :- Find Duplicates in an Array..?

//Program :-

public class ArrayDuplicates {
	
	public static void main(String[] args)
	{
		int[] a = {6,2,3,2,3,4,4,5,6,5,7};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}
