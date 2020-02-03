package lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prob6 {

	public Set<String> union(List<Set<String>> sets){
		return sets.stream().reduce(new HashSet(),(x,y)->{x.addAll(y); return x;});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = Arrays.asList("A", "B"); 
		List<String> l2 = Arrays.asList("D");
		List<String> l3 = Arrays.asList("1", "3","5");
		Set<String> hSet1 = new HashSet<String>(); 
		for (String li1 : l1) {
			hSet1.add(li1);
		}
		Set<String> hSet3 = new HashSet<String>(); 
		for (String li3 : l3) {
			hSet1.add(li3);
		}
		Set<String> hSet2 = new HashSet<String>(); 
		for (String li2 : l2) {
			hSet1.add(li2);
		}
		
		List<Set<String>> s=new ArrayList<Set<String>>();
		s.add(hSet2);
		s.add(hSet3);
		s.add(hSet1);
		Prob6 p=new Prob6();
		Set<String> result=p.union(s);
		System.out.print(result);
		
		
	}

}
