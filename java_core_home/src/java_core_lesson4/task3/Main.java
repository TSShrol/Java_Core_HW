package java_core_lesson4.task3;

public class Main {

	public static void main(String[] args) {
		Animal animal=new Animal("Леопард",20, 7);
		System.out.println("Назва тварини = "+animal.getName()+
				", Швдкість тварини = "+animal.getSpeed()+
				" км/год, Вік тварини = "+animal.getAge()+" років.");
		animal.setName("Бик");
		animal.setSpeed(4);
		animal.setAge(2);
		System.out.println("Назва тварини = "+animal.getName()+
				", Швдкість тварини = "+animal.getSpeed()+
				" км/год, Вік тварини = "+animal.getAge()+" років.");
		

	}

}
