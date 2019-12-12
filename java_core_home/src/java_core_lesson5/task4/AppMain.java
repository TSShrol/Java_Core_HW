package java_core_lesson5.task4;

public class AppMain {

	public static void main(String[] args) {
		Person person1=new Person();
		System.out.println(person1);
		Person person2=new Person("Semen");
		System.out.println(person2);
		Person person3=new Person("Semen","Semenov");
		System.out.println(person3);
		Person person4=new Person("Semen","Semenov",43);
		System.out.println(person4);
	}

}
