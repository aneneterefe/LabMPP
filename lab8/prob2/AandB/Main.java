package lab8.prob2.AandB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Product> l=new ArrayList<Product>();
		l.add(new Product("Pro1", 129.0, 1));
		l.add(new Product("Pro2", 78.09, 3));
		l.add(new Product("Pro0", 400.9, 2));
		Collections.sort(l,new ProductPriceComparator());
		System.out.println("----A. Sort By Price------");
		l.forEach(System.out::println);
		
		Collections.sort(l,new ProductTitleComparator());
		System.out.println("\n----B. Sort By Title------");
		l.forEach(System.out::println);
	}
}
