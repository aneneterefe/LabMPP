package lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Prob2{

	public static <T> T secondSmallest(List<T> list){
		List<T> l=list.stream().sorted().collect(Collectors.toList());
		return l.get(1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(1);
		List<Character> charlist= new ArrayList<Character>();
		charlist.add('D');
		charlist.add('A');
		charlist.add('B');
		charlist.add('C');
		Prob2 test=new Prob2();
		System.out.println("Second Smallest Integer: "+test.secondSmallest(list));
		System.out.println("Second Smallest Character: "+test.secondSmallest(charlist));
		
		
	}

}
