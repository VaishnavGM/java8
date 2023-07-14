package Vaish;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

public class streamc {

	public static void main(String[] args) {
List <Integer> l = Arrays.asList(10,40,50,20,30,3,5);
/*int result = l.stream()
    .filter(n -> n%2==1)
         .sorted()
         .map(n -> n*2)
         
         .reduce(0,(c,e)->c+e);
         System.out.println(result);
    */
l.stream()
.filter(n-> n%2==1);
l.forEach(n ->System.out.println(n));
         
l.stream()
.filter(n -> n%2==0);
l.forEach(n ->System.out.println(n));
	}

}
