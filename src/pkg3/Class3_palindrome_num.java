package pkg3;

import java.util.Scanner;

public class Class3_palindrome_num {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("enter a number/string to be check");
		String org = scn.nextLine();
		String rev="";
		int length=org.length();
		
		for(int i =length-1;i>=0;i--) 
		{
			rev=rev+org.charAt(i);
			
		}
		if(org.equals(rev)) {
			System.out.println(org+" is palindrome");
		}
		else {
			System.out.println(org+" is not a palindrome");
		}
		

	}

}
