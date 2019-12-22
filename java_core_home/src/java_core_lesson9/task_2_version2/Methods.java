package java_core_lesson9.task_2_version2;

public class Methods {
	double first, second;

	public Methods(double first, double second) {
		this.first = first;
		this.second = second;
	}

	public Methods() {
	}

	public double sum(double first, double second) throws MyException {
		methodException();
		return first + second;
	}

	public double minus(double first, double second) throws MyException {
		methodException();
		return first - second;
	}

	public double myltiply(double first, double second) throws MyException {
		methodException();
		return first * second;
	}

	public double div(double first, double second) throws MyException {
		methodException();
		return first / second;
	}

	public void methodException() {
		try {
			if (first < 0 && second < 0)
				throw new IllegalArgumentException(first + "<0 and " + second + "<0");
			if ((first == 0 && second != 0) || (first != 0 && second == 0))
				throw new ArithmeticException(
						"(" + first + "==0 and " + second + "!=0) or" + "(" + first + "!=0 and " + second + "==0)");
			if (first == 0 && second == 0)
				throw new IllegalAccessException(first + "=0 and " + second + "=0");
			if (first > 0 && second > 0)
				throw new MyException();
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

}
