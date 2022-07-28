package pkg1;

import java.util.Arrays;

//Q. Addition of two arrays first index with the last index of the second array.

//   A[]={1,2,3,4,5}
//   B[]={6,7,8,9,10}
//   O/p:- C={11,11,11,11,11}



public class Class1 {

	public static void main(String[] args) {
			
		int[]a= {1,2,3,4,5};
		int[]b= {6,7,8,9,10};
		
		int[]c=new int[5];
		
		for(int i=0;i<5;i++)
		{	
	   c[i]=a[i]+b[b.length-(i+1)];
		}
		
		System.out.print("c = ");
		System.out.println(Arrays.toString(c));
		

	}

}
