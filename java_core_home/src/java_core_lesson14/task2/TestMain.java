package java_core_lesson14.task2;

import java.util.ArrayList;
import java.util.Scanner;
import java_core_lesson14.task2.MethodForList;

public class TestMain {

	public static void main(String[] args) {
		ArrayList<Commodity> list = new ArrayList<Commodity>();
		list.add(new Commodity("TV", 45, 47, 50));
		list.add(new Commodity("Radio", 35, 5, 4));
		list.add(new Commodity("Refrigerator", 35, 55, 4));
		list.add(new Commodity("Iron", 30, 5, 4));
		Scanner sc = new Scanner(System.in);
		MethodForList doingList = new MethodForList();

		while (true) {
			menu();
			System.out.println("Input item:");
			int item = sc.nextInt();
			switch (item) {
			case 1: {
				System.out.println("Input nameCommodity: ");
				String nameCommodity = sc.next();
				System.out.println("Input length: ");
				double length = sc.nextDouble();
				System.out.println("Input width: ");
				double width = sc.nextDouble();
				System.out.println("Input weight: ");
				double weight = sc.nextDouble();
				doingList.addCommodity(list, new Commodity(nameCommodity, length, width, weight));
				break;
			}
			case 2: {
				System.out.println("Input nameCommodity for removing: ");
				String nameCommodity = sc.next();
				doingList.removeCommodity(list, nameCommodity);
				break;
			}
			case 3: {
				System.out.println("Input nameCommodity for replace: ");
				String replaceNameCommodity = sc.next();
				System.out.println("Input new Commodity. ");
				System.out.println("Input name Commodity: ");
				String nameCommodity = sc.next();
				System.out.println("Input length: ");
				double length = sc.nextDouble();
				System.out.println("Input width: ");
				double width = sc.nextDouble();
				System.out.println("Input weight: ");
				double weight = sc.nextDouble();
				doingList.replaceCommodity(list, replaceNameCommodity,
						new Commodity(nameCommodity, length, width, weight));
			break;	
			}
			case 4: {
				ArrayList<Commodity> listExample = new ArrayList<Commodity>(list);
				System.out.println("Befor sorting by nameCommodit");
				doingList.output(listExample);
				doingList.sortByNameCommodity(listExample);
				System.out.println("After sorting by nameCommodit");
				doingList.output(listExample);
				break;
			}
			case 5: {
				ArrayList<Commodity> listExample = new ArrayList<Commodity>(list);
				System.out.println("Befor sorting by length");
				doingList.output(listExample);
				doingList.sortByLength(listExample);
				System.out.println("After sorting by length");
				doingList.output(listExample);
				break;
			}
			case 6: {
				ArrayList<Commodity> listExample = new ArrayList<Commodity>(list);
				System.out.println("Befor sorting by width");
				doingList.output(listExample);
				doingList.sortByWidth(listExample);
				System.out.println("After sorting by width");
				doingList.output(listExample);
				break;
			}
			case 7: {
				ArrayList<Commodity> listExample = new ArrayList<Commodity>(list);
				System.out.println("Befor sorting by weight");
				doingList.output(listExample);
				doingList.sortByWeight(listExample);
				System.out.println("After sorting by weight");
				doingList.output(listExample);
				break;
			}
			case 8: {
				try {
					System.out.println("Input index elementa");
					int index = sc.nextInt();
					System.out.println(index + " element of list Commodity is " + doingList.indexElement(list, index));
				} catch (IndexOutOfBoundsException e) {
					System.out.println(e);
				}
				break;
			}
			case 9: {
				System.out.println("Elements of collection Commodity:");
				doingList.output(list);
				break;
			}
			default: {
				System.exit(0);
			}
			}
		}

	}

	public static void menu() {
		System.out.println(
				"\nMenu:\n1. Add Commodity\n" + "2.Remove Commodity by nameCommodity\n" + "3. Replace Commodity by name\n"
						+ "4. Sorting by nameCommodity\n" + "5. Sorting by lemgth\n" + "6. Sorting by width\n"
						+ "7. Sorting by weight\n" + "8. Output ³-iy element list \n" + "9. Output listCommodity");
	}
}