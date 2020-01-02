package java_core_lesson6.task1;

public class EmployeeOfHour implements Salary {
	private int countHour;
	
	public EmployeeOfHour(int countHour) {
		super();
		this.countHour = countHour;
	}

	public double salary() {
	
		return countHour*200;
	}
	

}
