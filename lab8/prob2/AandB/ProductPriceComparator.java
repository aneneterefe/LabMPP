package lab8.prob2.AandB;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.price>o2.price)
			return 1;
		else if(o1.price<o2.price)
			return -1;
		else
			return 0;
	}

}
