package java_core_lesson12.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AppTest {

	public static void main(String[] args) {
		ArrayList<Car> listOfCar = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.println("Input count element of list:");
		count = sc.nextInt();
		// filling in the list
		for (int i = 0; i < count; i++) {
			listOfCar.add(new Car(getRandomValueFromRange(2, 8), getRandomValueFromRange(2000, 2019),
					new Helm(getRandomValueFromRange(30, 40), material()), new Engine(getRandomValueFromRange(3, 7))));
		}
		while (true) {
			menu();
			int item = sc.nextInt();
			switch (item) {
			case 1: {
				for (Car car : listOfCar) {
					System.out.println(car);
				}
				break;
			}
			case 2: {
				Car car = new Car(getRandomValueFromRange(2, 8), getRandomValueFromRange(2000, 2019),
						new Helm(getRandomValueFromRange(30, 40), material()),
						new Engine(getRandomValueFromRange(3, 7)));
				listOfCar.add(car);
				break;
			}
			case 3: {
				System.out.println("Input year of car:");
				int year = sc.nextInt();
				for (int i = 0; i < listOfCar.size(); i++) {
					if (listOfCar.get(i).getYear() == year) {
						listOfCar.remove(i);
					}
				}
				break;
			}

			default: {
				System.exit(0);
			}
			}
		}

	}

	public static void menu() {
		System.out.println("Input number menu. For exit press any key:");
		System.out.println("1. Output toString() list to consol.\n" + "2. Add to list the same objects.\n"
				+ "3. Removing a car by its year");
	}

	public static int getRandomValueFromRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}
		Random n = new Random();
		return n.nextInt(max - min + 1) + min;

	}

	public static String material() {
		Random n = new Random();
		int kindOfMaterial = n.nextInt(2);
		if (kindOfMaterial == 0)
			return "skin";
		else {
			return "alcator";
		}
	}
}
