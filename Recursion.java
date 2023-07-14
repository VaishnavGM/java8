package Vaish;

public class Recursion {

	public static void main(String[] args) {

method(1);

	}
	public static void method(int n)
	{
		if(n>0)
		{
		 System.out.println("100");
	}
		else if(n%2==0)
		{
System.out.println(n);	
method(n+1);
		}
		else {
			method(n+1);
		}
		
	}
}
