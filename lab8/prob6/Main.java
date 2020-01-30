package lab8.prob6;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		Arrays.sort(names, String::compareToIgnoreCase);
		Stream.of(names).forEach(System.out::println);
		

	}

}
