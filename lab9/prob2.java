package lab9;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> myIntStream = Stream.of(1,5,7,9,2);
		IntSummaryStatistics summary=myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Max="+summary.getMax());
		System.out.println("Min="+summary.getMin());
		
	}

}
