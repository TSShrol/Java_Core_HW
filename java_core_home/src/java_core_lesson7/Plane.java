package java_core_lesson7;

public class Plane {
	private double length;
	private double width;
	private double weight;
	
	public Plane(double length, double width, double weight) {
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	void startingTheEngine() {//������ �������
		System.out.println("The plane was choking before the "+(int)(Math.random() * (88 - 19) + 19)+"minutes");
	}

	void takeOffPlane() {//���� �����
		System.out.println("The plane will pass "+(int)(Math.random() * 1000)+"km");
	}

	void landingOfThePlane() {//������� �����
		System.out.println("Plane plane is landing");
	}


}
