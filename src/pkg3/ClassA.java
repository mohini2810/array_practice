package pkg3;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter string");
		String a=scn.nextLine();
	int upper=0;
	int lower=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)>='A'&&a.charAt(i)<='Z')
			{
				
				System.out.print(a.charAt(i)+" ");
				upper++;
				System.out.println();
				
			}
			else if(a.charAt(i)>='a'&&a.charAt(i)<='z')
				
			{
				System.out.print(a.charAt(i)+" ");
				lower++;
			}
		}
		System.out.println();
		System.out.println(upper);
		System.out.println(lower);
		

	}

}
