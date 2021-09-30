//Q1 :-Find Minimum and Maximum Element in an Array..?

//Program :-

public class MinMax {
	
	public static void main(String[] args) {
		
		int[] a1 = {50,30,10,40,60,20};
		int a2;
		
		//Arrays.sort(a);
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i] > a1[j])
				{
					a2 = a1[i];
					a1[i] = a1[j];
					a1[j] = a2;
				}
			}
		}
		
		System.out.println("Minimum Value of an Array :"+a1[0]);
		System.out.println("Maximum Value of an Array :"+a1[a1.length-1]);
		
	}

}
