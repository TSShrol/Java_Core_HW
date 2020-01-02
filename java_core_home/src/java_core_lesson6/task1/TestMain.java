package java_core_lesson6.task1;

public class TestMain {
	public static void main(String[] args) {
		EmployeeOfHour employee1=new EmployeeOfHour(16);
		EmployeeOfDay employee2=new EmployeeOfDay(2);
		System.out.println("Salary of employee1 is "+employee1.salary());
		System.out.println("Salary of employee2 is "+employee2.salary());
	}
}