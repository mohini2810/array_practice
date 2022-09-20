package pkg1;



public class Class2 {

	public static void main(String[] args)  {
		
		String str="@#$a&&&@$**ccenture";
//		System.out.print(str.charAt(3));
//		System.out.println((str.subSequence(11, 19)));
		
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}
