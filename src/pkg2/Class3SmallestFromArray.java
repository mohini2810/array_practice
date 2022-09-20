package pkg2;

import java.util.Arrays;

public class Class3SmallestFromArray {
//smallest of given array
	public static void main(String[] args) {
		
		int[]a= {10,6,7,3,98};
		
		int smallNumber = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[0]>a[i])
			{
				smallNumber=a[i];
			}
			}
		System.out.println(smallNumber);
		}

	}


