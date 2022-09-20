package pkg2;

public class ClassA {

	public static void main(String[] args) {
		
		String a ="121";
		String r="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			r=r+a.charAt(i);
		}
		System.out.println(r);
		
		if(r.equals(a))
		{
			System.out.println(a+" is palindrome");
		}
		else
		{
			System.out.println(a+" is not palindrome");
		}
		
		

	}

}
