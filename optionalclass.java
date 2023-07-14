package Vaish;
import java.util.*;
public class optionalclass {
public static void main(String[]args)
{
String a[] = new String[10];
Optional <String> c = Optional.ofNullable(a[5]);
		if(c.isPresent())
		{
			System.out.println(a[5].toUpperCase());
		}
		else
		{
			System.out.println("np string is present");

	
		}
		
}
}
