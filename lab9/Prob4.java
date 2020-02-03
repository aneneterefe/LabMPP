package lab9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Prob4 {
	
	public static void printSquares(int num) {

		IntStream ints=IntStream.iterate(1,(n) ->n+1)
				 .map(n->n*n)
				 .limit(num);
		System.out.println(Arrays.toString(ints.toArray()));
	}
	
	public static int squared(int num) {
		double x= Math.pow(num, 2);
		return (int) x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prob4 p=new Prob4();
		p.printSquares(4);
	}
	
}
