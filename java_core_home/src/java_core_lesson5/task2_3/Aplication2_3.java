package java_core_lesson5.task2_3;

public class Aplication2_3 {

	public static void main(String[] args) {
		/*
		 * 2. Напишіть програму,
		 * яка моделюватиме кидок монети? * */

		double f = Math.random()/Math.nextDown(1.0);
		long x =Math.round(1*(1.0 - f) + 2*f);
		System.out.println(x);
		
		if (x==1) {
			System.out.println("Орел");
		}
		else {
			System.out.println("Рєжка");
		}
		
		/*
		 * 
		 * 3. Виведіть найменше і найбільше 
		 * число типу float і double 
		 * в експоненціальній формі?*/
		
		System.out.printf("Min_float= %e, Max_float=%e\n",Float.MIN_VALUE,Float.MAX_VALUE);
		System.out.printf("Min_double= %e, Max_double=%e\n",Double.MIN_VALUE,Double.MAX_VALUE);
	}

}
