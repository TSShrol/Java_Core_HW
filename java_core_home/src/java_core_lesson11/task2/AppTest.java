package java_core_lesson11.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AppTest {

	public static void main(String[] args) {
		Car[][] arrayOfCar = new Car[getRandomValueFromRange(2, 3)][getRandomValueFromRange(2, 3)];
		System.out.println(Arrays.deepToString(arrayOfCar));
		for (int i = 0; i < arrayOfCar.length; i++) {
			for (int j = 0; j < arrayOfCar[i].length; j++) {
				arrayOfCar[i][j] = new Car(getRandomValueFromRange(2, 8), getRandomValueFromRange(2000, 2019),
						new Helm(getRandomValueFromRange(30, 40), material()),
						new Engine(getRandomValueFromRange(3, 7)));
			}
		}
				
		while (true) {
			menu();
			Scanner sc = new Scanner(System.in);
			int item = sc.nextInt();
			switch (item) {
				case 1: {
					System.out.println(Arrays.deepToString(arrayOfCar));
				break;
				}
				case 2: {
					Car car=new Car(getRandomValueFromRange(2,8), getRandomValueFromRange(2000, 2019),
							new Helm(getRandomValueFromRange(30, 40), material()),
							new Engine(getRandomValueFromRange(3, 7)));
					System.out.println(car);
					
					for(Car[] nextCar:arrayOfCar) {
						Arrays.fill(nextCar,car);
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
		System.out.println("1. Output toString() array to consol.\n" + "2. Fill the array with the sme objects.\n");
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
