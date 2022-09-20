package pkg2;

import java.util.ArrayList;
import java.util.List;

public class Class11 {

	public static void main(String[] args) {
		
		String s ="have some good habbit in 2022";
		char[]c=s.toCharArray();
		List<Character>cList = new ArrayList<>();
		
		for(int i =0;i<c.length;i++)
		{
			int count=1;
			if(!cList.contains(c[i])) {
			for(int j=i+1;j<c.length;j++)
			{
				 {
					
					if(c[i]==c[j]) {
						count++;
						cList.add(c[i]);
					}
				}}
			System.out.println(c[i]+" is repeated "+ count+" times");
			}
					
					
			}
			
			
		}}


