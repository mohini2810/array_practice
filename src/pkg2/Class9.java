package pkg2;

import java.util.Arrays;
import java.util.Scanner;

public class Class9 {
	
	//Declare array by taking values from user with Scanner class.

	public static void main(String[] args) {
		
        Scanner scn= new Scanner(System.in);
     System.out.println("enter size of an array");
         int size=scn.nextInt();
         
         int[] b =new int [size];
         
        for(int i=0;i<size;i++) {
        	
        	System.out.println("enter "+(i+1)+" element of an array" );
        	
        	 b[i]= scn.nextInt();   	
        }
        System.out.print("user entered array is : ");
        System.out.println(Arrays.toString(b));
         
         scn.close();
		
	}

}
