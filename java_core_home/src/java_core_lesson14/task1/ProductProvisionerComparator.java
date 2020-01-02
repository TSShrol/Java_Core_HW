package java_core_lesson14.task1;

import java.util.Comparator;

public class ProductProvisionerComparator  implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if (o1.getProvisioner().compareToIgnoreCase(o2.getProvisioner()) > 0) {
			return 1;
		} else {
			if (o1.getProvisioner().compareToIgnoreCase(o2.getProvisioner()) < 0) {
				return -1;
			}
			return 0;
		}
	}

}
