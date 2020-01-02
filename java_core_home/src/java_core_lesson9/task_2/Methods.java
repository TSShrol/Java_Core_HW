package java_core_lesson9.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		try {
			double a = -4, b = 7;
			if (a < 0 && b < 0)
				throw new IllegalArgumentException(a + "<0 and " + b + "<0");
			if ((a == 0 && b != 0) || (a != 0 && b == 0))
				throw new ArithmeticException("(" + a + "==0 and " + b + "!=0) or" + "(" + a + "!=0 and " + b + "==0)");
			if (a == 0 && b == 0)
				throw new IllegalAccessException(a + "=0 and " + b + "=0");
			if (a > 0 && b > 0)
				throw new MyException();
			System.out.println(a + "+" + b + "=" + sum(a, b));
			System.out.println(a + "-" + b + "=" + minus(a, b));
			System.out.println(a + "*" + b + "=" + myltiply(a, b));
			System.out.println(a + "/" + b + "=" + div(a, b));
		} catch (IllegalArgumentException e) {
			System.err.println("IllegalArgumentException: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException: (" + e.getMessage());
		} catch (IllegalAccessException e) {
			System.err.println("IllegalAccessException: " + e.getMessage());
		} catch (MyException e) {
			System.err.println("MyException: " + e.getMessage());
		}

	}

	public static double sum(double first, double second) {
		return first + second;
	}

	public static double minus(double first, double second) {
		return first - second;
	}

	public static double myltiply(double first, double second) {
		return first * second;
	}

	public static double div(double first, double second) {
		return first / second;
	}

}
