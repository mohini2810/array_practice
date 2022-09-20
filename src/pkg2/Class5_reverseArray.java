package pkg2;

import java.util.Arrays;

public class Class5_reverseArray {
	
	//reverse given array

	public static void main(String[] args) {
		
		int []a= {12,45,67,11,-19,87};
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<(a.length/2);i++)
		{
			int b = a[i];
			a[i]=a[a.length-(i+1)];
			a[a.length-(i+1)]=b;
			
		}
		
		System.out.println(Arrays.toString(a));
		

	}

}
