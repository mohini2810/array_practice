package pkg4_star_pattern;

public class Class3_ {
	
//	      * 
//	    * * 
//	  * * * 
//	* * * *

	public static void main(String[] args) {
		
		for(int i=0;i<4;i++)
		{
			for(int j=3;j>=(i+1);j--)
			{
				System.out.print("  ");
			}
				for(int k=0;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
		}
			
		}

	}


