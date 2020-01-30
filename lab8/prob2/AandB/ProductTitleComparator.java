package lab8.prob2.AandB;

import java.util.Comparator;

public class ProductTitleComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.title.compareTo(o2.title);
	}

}
