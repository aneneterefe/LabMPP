package lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Prob3 {

	public int countWords(List<String> words, char c, char d, int len) {
		return (int)
				words.stream()
				.filter(x->x.length()==len)
				.filter(x->x.contains(""+c))
				.filter(x->!x.contains(""+d))
				.count();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prob3 p=new Prob3();
		List<String> words= new ArrayList<String>();
		words.add("come");
		words.add("door");
		words.add("byec");
		words.add("hello");
		System.out.println(p.countWords(words, 'c', 'd', 4));
	}

}
