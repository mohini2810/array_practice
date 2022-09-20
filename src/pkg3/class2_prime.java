package pkg3;

import java.util.Scanner;

public class class2_prime {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n= scn.nextInt();
		int count=0;
		int d=n;
		for(int i=n;i>0;i--)
		{
			if(d%i==0) 
			{
				count++;
			}
		}
			if(count==2) {
				System.out.println(n+" is prime number");
			}
			else {
				System.out.println(n+" is not a prime number");
			}
			
			}
		}
	

