package java_core_lesson8.task_2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_2_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Task 2:");
		task2();
		
		System.out.println("Task 3:");
		task3();

	}
	
	public static void task2() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number int");
		double number=scanner.nextDouble();
		if(number%1==0) {
			System.out.println("int number");
			if(number%2==0) {
				System.out.println("even number");
			}else {
				System.out.println("odd number");
			}
		}else{
			System.out.println("Error! Not int!");
		}
		scanner.close();
	}
	public static void task3() throws NumberFormatException,IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first number int");
		double first=Double.parseDouble(br.readLine());

		System.out.println("Enter second number int");
		double second=Double.parseDouble(br.readLine());
		
		if((first%1==0)&&(second%1==0)) {
			System.out.println("int numbers");
			System.out.println("Suma="+(first+second));
		}else{
			System.out.println("Error! Not int!");
		}
	}

}
