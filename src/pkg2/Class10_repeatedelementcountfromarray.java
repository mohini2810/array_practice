package pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class10_repeatedelementcountfromarray {

	public static void main(String[] args) {
		
		int []a= {1,5,9,7,5,9,8,10,10,65,65};
		List <Integer> iList = new ArrayList<>();
		
		
		for(int i=0;i<a.length;i++)
		{
			int count =1;
			if(!iList.contains(a[i]))
			{
				for(int j =i+1;j<a.length;j++) 
				{
					if(a[i]==a[j]) 
					{
						count++;
						iList.add(a[i]);
					}
				}
				System.out.println(a[i]+" repeated "+count +" times");
			}
		}
		
		
		

}}
