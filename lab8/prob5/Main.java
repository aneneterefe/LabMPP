package lab8.prob5;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		System.out.println("---a) Using lamda---");
		fruits.forEach((x)->System.out.println(x));
		System.out.println("---b) Using method referene---");
		fruits.forEach(System.out::println);
		
	}

}
