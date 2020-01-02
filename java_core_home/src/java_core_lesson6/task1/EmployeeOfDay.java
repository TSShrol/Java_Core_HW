package java_core_lesson6.task1;

public class EmployeeOfDay implements Salary {
	private int countDays;
	
	public EmployeeOfDay(int countDays) {
		super();
		this.countDays = countDays;
	}

	@Override
	public double salary() {
		return countDays*2000;
	}
	

}
