package java_core_lesson5.task4;

public class Person {
	private String name;
	private String surname;
	private int age;
	Person(){
		name="Petro";
		surname="Petrenco";
		age=25;
	}
	Person(String name){
		this();
		this.name=name;
	}
	Person(String name,String surname){
		this(name);
		this.surname=surname;
	}
	Person(String name, String surname, int age){
		this(name,surname);
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
	
}
