package lab8.prob2.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lab8.prob2.AandB.ProductPriceComparator;

public class Main {
	
	static enum SortMethod {BYPRICE, BYTITLE};
	
	public void mysort(List<Product> l, SortMethod method ) {
		
		class ProductComparator implements Comparator<Product>{

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				if(method==SortMethod.BYPRICE) {
					if(o1.price>o2.price)
						return 1;
					else if(o1.price<o2.price)
						return -1;
					else
						return 0;
				}else {
					return o1.title.compareTo(o2.title);
				}
			}
			
		}
		Collections.sort(l, new ProductComparator());
	}

	public static void main(String[] args) {
		
		List<Product> l=new ArrayList<Product>();
		l.add(new Product("Pro1", 129.0, 1));
		l.add(new Product("Pro2", 78.09, 3));
		l.add(new Product("Pro0", 400.9, 2));
		Main m=new Main();
		m.mysort(l, SortMethod.BYPRICE);
		System.out.println("----C. Sort By Price------");
		l.forEach(System.out::println);
		m.mysort(l, SortMethod.BYTITLE);
		System.out.println("\n----C. Sort By Title------");
		l.forEach(System.out::println);
		
		
	}
}
