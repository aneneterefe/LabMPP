package lab8.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Double, Double, List<Double>> fun=(x,y)->{
			List<Double> list=new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x*y);
			return list;
		};
		
		List<Double> result=fun.apply(2.0, 3.0);
		result.forEach(System.out::println);
	}

}
