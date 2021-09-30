//Q9 :- How to Rearrange Array in alternating Positive and Negative Number..?

//Program :-

public class AltPosNeg {
	
	public static void main(String[] args) {
		
		int[] a1={-4,-3,-2,-1,1,2,5,6};	
		int i=-1;
		int a2;
		
		System.out.println("Original Array :");
		for(int a=0;a<a1.length;a++)
		{
			System.out.print(a1[a]+"\t");
		}
		
		for(int j=0;j<a1.length;j++)
		{
			if(a1[j]<0)
			{
				i++;
				a2=a1[i];
				a1[i]=a1[j];
				a1[j]=a2;
			}			
		}
		int pos=i+1,neg=0;
		while(pos<a1.length && neg<pos && a1[neg]<0)
		{
			a2=a1[neg];
			a1[neg]=a1[pos];
			a1[pos]=a2;
			pos++;
			neg+=2;
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Modified Array :");
		for(int k=0;k<a1.length;k++)
		{	
				System.out.print(a1[k]+"\t");
		}
	}

}
