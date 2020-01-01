package java_core_lesson13.task1;

import java.util.Scanner;

public class Deputat extends Human {
	private String surname;
	private String name;
	private boolean habarnik; // хабарник
	private int sizeOfHabar;
	public Deputat(String surname, String name, boolean habarnik,int weight, int height) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.habarnik = habarnik;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHabarnik() {
		return habarnik;
	}
	public void setHabarnik(boolean habarnik) {
		this.habarnik = habarnik;
	}
	public int getSizeOfHabar() {
		return sizeOfHabar;
	}
	public void setSizeOfHabar(int sizeOfHabar) {
		this.sizeOfHabar = sizeOfHabar;
	}
	
	
	@Override
	public String toString() {
		return "Deputat [surname=" + surname + ", name=" + name + ", habarnik=" + habarnik + ", sizeOfHabar="
				+ sizeOfHabar + ", toString()=" + super.toString() + "]";
	}
	void giveHabar() {
		if(habarnik==false) {
			System.out.println("This deputat is not habarnik");
		}
		else {
			Scanner sc=new Scanner(System.in);
			System.out.println("Input size of habar:");
			int habar=sc.nextInt();
			if(sizeOfHabar>5000) {
				System.out.println("the police will imprison the deputata");}
			else {
				sizeOfHabar=habar;
			}
			sc.close();
		}
	}
	
}
