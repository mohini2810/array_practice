package pkg2;

public class Class4GreatestFromArray {

	public static void main(String[] args) {
		
int[]a= {10,6,7,3,98};
		
		int greatNumber = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[0]<a[i])
			{
				greatNumber=a[i];
			}
			}
		System.out.println(greatNumber);

	}

}
