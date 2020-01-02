package java_core_lesson11.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class AppTask1 {

	public static void main(String[] args) {
		/*1. Створити масив Integer, заповнити його рандомними значеннями,
		 *  відсортувати його в порядку спадання та в порядку зростання.
		 * */
		Integer [] array=new Integer[10];
		//Arrays.fill(array, getRandomValueFromRange(10,120));
		for(int i=0; i<array.length;i++) {
			array[i]=new Integer(getRandomValueFromRange(10,120));
		}
		System.out.println("Array before sort ");
		System.out.println(Arrays.toString(array));
		
		System.out.println("Array after sort ");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		System.out.println("Array after sort revers ");
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}

	public static int getRandomValueFromRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}
		Random n = new Random();
		return n.nextInt(max - min + 1) + min;

	}
}
