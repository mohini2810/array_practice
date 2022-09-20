package pkg2;

import java.util.Arrays;

public class Class1ArrayAscending {
//array in ascending order
	
	public static void main(String[] args) {
		
		int []a= {12,20,30,5,7};
		
		for(int i=0;i<a.length;i++)	
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[j]<a[i]) 
				{
			        int h = a[i];
					a[i] = a[j];
					a[j] = h;
				}
			}
			
		}	
		System.out.println(Arrays.toString(a));
	}

}
