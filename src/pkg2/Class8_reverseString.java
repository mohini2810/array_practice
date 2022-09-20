package pkg2;

import java.util.Arrays;

public class Class8_reverseString {

	public static void main(String[] args) {
		
		String s ="Mohini is in Vairag";
		System.out.println(s);
		char[]c=s.toCharArray();
		
		for(int i=0;i<(c.length/2);i++)
		{
			char r = c[i];
			c[i]=c[c.length-(i+1)];
			c[c.length-(i+1)]=r;
		}
		System.out.println(c);
		

	}

}
