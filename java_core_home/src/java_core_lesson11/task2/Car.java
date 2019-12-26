package java_core_lesson11.task2;

public class Car {
	private int numberOfHorsepower;
	private int year;
	private Helm helm;
	private Engine engine;

	public Car(int numberOfHorsepower, int year, Helm helm, Engine engine) {
		this.numberOfHorsepower = numberOfHorsepower;
		this.year = year;
		this.helm = helm;
		this.engine = engine;
	}

	public int getNumberOfHorsepower() {
		return numberOfHorsepower;
	}

	public void setNumberOfHorsepower(int numberOfHorsepower) {
		this.numberOfHorsepower = numberOfHorsepower;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [numberOfHorsepower=" + numberOfHorsepower + ", year=" + year + ", helm=" + helm + ", engine="
				+ engine + "]";
	}

}
