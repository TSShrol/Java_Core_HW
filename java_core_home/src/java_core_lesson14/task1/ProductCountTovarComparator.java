package java_core_lesson14.task1;

import java.util.Comparator;

public class ProductCountTovarComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getCount_tovar()>o2.getCount_tovar()) {
			return 1;
		}else {
			if(o1.getCount_tovar()<o2.getCount_tovar()) {
				return -1;
			}
		}
		return 0;
	}
	

}
