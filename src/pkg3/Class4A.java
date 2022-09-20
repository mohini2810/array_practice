package pkg3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class4A {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("enter a string");
		String a=scn.nextLine();
		List <Character>uList= new ArrayList<>();
		List <Character>lList= new ArrayList<>();
		int upper=0;
		int lower=0;
		int space=0;
		
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(Character.isUpperCase(ch)) {
				upper++;
				uList.add(ch);
			}else if(Character.isLowerCase(ch)) {
				lower++;
				lList.add(ch);
			}
			else if(Character.isWhitespace(ch)) {
				space++;
			}
		}

		System.out.println("lowercase letters "+lower);
		System.out.println("uppercase letters "+upper);
		System.out.println("space count "+space);
		System.out.println(lList);
		System.out.println(uList);
		
		
	}

}
