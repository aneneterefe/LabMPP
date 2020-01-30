package lab8.prob2.D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lab8.prob2.D.Product;

public class Main {
	
		public static void main(String[] args) {
		
		List<Product> l=new ArrayList<Product>();
		l.add(new Product("Pro1", 129.0, 1));
		l.add(new Product("Pro1", 78.09, 3));
		l.add(new Product("Pro1", 400.9, 2));
		Comparator<Product> comp=(Product o1, Product o2)->{
				if(o1.title.equals(o2.title)) {//if they have same title sort by price
					if(o1.price>o2.price)
						return 1;
					else if(o1.price<o2.price)
						return -1;
					else
						return 0;
				}else {//if they have different title sort by title
					return o1.title.compareTo(o2.title);
				}
		};
		Collections.sort(l, comp);
		System.out.println("----D. Sort By Price if If the title is same------");
		l.forEach(System.out::println);	
		List<Product> l2=new ArrayList<Product>();
		l2.add(new Product("Pro1", 129.0, 1));
		l2.add(new Product("Pro2", 78.09, 3));
		l2.add(new Product("Pro3", 400.9, 2));
		Collections.sort(l2, comp);
		System.out.println("----\nD. Sort By Title if If the title is different------");
		l2.forEach(System.out::println);	
		
		
	}
}
