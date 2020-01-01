package java_core_lesson11.task2;

public class Engine {
private int numberOfCylinders;

public Engine(int numberOfCylinders) {
	
	this.numberOfCylinders = numberOfCylinders;
}

public int getNumberOfCylinders() {
	return numberOfCylinders;
}

public void setNumberOfCylinders(int numberOfCylinders) {
	this.numberOfCylinders = numberOfCylinders;
}

@Override
public String toString() {
	return "Engine (numberOfCylinders=" + numberOfCylinders + ")";
}


}
