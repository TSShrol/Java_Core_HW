package java_core_lesson14.task1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestApplication {

	public static void main(String[] args) {
		Set<Product> setProduct = new HashSet<>();
		setProduct.add(new Product("Apple", "Golden", 234));
		setProduct.add(new Product("Apple", "Garden", 230));
		setProduct.add(new Product("Cheese", "Golden", 20));
		setProduct.add(new Product("Cheese", "Golden", 24));
		setProduct.add(new Product("Cheese", "Golden", 24));
		setProduct.add(new Product("Apple", "Golden", 24));
		setProduct.add(new Product("Apple", "Poland", 20));
		setProduct.add(new Product("Cheese", "Golden", 26));
		setProduct.add(new Product("Cherry", "Poland", 32));
		setProduct.add(new Product("Fish", "Golden", 48));
		setProduct.add(new Product("Cherry", "Golden", 48));
		setProduct.add(new Product("Fish", "Golden", 36));
		

		System.out.println("Before sorting:");
		for (Product product : setProduct) {
			System.out.println(product);
		}
		System.out.println();

		//sorting by Comparable
		Set<Product>setProduct2=new TreeSet<>(setProduct);
		System.out.println();
		System.out.println("Aftre sorting (interface Comparable):");
		for (Product product : setProduct2) {
			System.out.println(product);
		}
		
		// using Comparator of field tovar
		System.out.println("Before using comparator:");
		for (Product product : setProduct) {
			System.out.println(product);
		}
		System.out.println();

		Set<Product> setProduct3 = new TreeSet<>(new ProductTovarComparator());
		setProduct3.addAll(setProduct);// no sorting
		System.out.println();
		System.out.println("Aftre sorting (interface Comparator) by field tovar:");
		for (Product product : setProduct3) {
			System.out.println(product);
		}
		System.out.println();

		// using Comparator of field provisioner
		System.out.println("Before using comparator:");
		for (Product product : setProduct) {
			System.out.println(product);
		}
		System.out.println();

		Set<Product> setProduct4 = new TreeSet<>(new ProductProvisionerComparator());
		setProduct4.addAll(setProduct);// no sorting
		System.out.println();
		System.out.println("Aftre using (interface Comparator) and sorting by field provisioner:");
		for (Product product : setProduct4) {
			System.out.println(product);
		}

		// using Comparator of field count_tovar
		System.out.println("Before using comparator:");
		for (Product product : setProduct) {
			System.out.println(product);
		}
		System.out.println();

		Set<Product> setProduct5 = new TreeSet<>(new ProductCountTovarComparator());
		setProduct5.addAll(setProduct);// no sorting
		System.out.println();
		System.out.println("After using (interface Comparator) and sorting by field count_tovar:");
		for (Product product : setProduct5) {
			System.out.println(product);
		}
		
		// using Comparator of all field
		System.out.println("Before using comparator:");
		for (Product product : setProduct) {
			System.out.println(product);
		}
		System.out.println();
		Comparator<Product> pcomp = new ProductTovarComparator().thenComparing(new ProductProvisionerComparator()).thenComparing(new ProductCountTovarComparator());
		Set<Product> setProduct6 = new TreeSet<>(pcomp);
		setProduct6.addAll(setProduct);// no sorting
		System.out.println();
		System.out.println("After using (interface Comparator) and sorting by all field:");
		for (Product product : setProduct6) {
			System.out.println(product);
		}

	}

}
