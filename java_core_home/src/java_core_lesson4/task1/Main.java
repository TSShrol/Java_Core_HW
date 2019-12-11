package java_core_lesson4.task1;

public class Main {

	public static void main(String[] args) {
		Robot r = new Robot();
		r.work("Я Robot - я просто працюю!");
		Robot cr = new CoffeRobot();
		cr.work("Я CoffeRobot - я варю каву!");
		RobotDancer rD = new RobotDancer();
		rD.work("Я RobotDancer - я просто танцюю!");
		RobotCoocker rC = new RobotCoocker();
		rC.work("Я RobotCoocker - я  просто готую!");
		Robot[] mas_robot = new Robot[] { new CoffeRobot(), new RobotDancer(), new RobotCoocker(), new Robot() };
		for (int i = 0; i < mas_robot.length; i++) {
			if (i == 0) {
				mas_robot[i].work("Я CoffeRobot - я варю каву!");
			} else if (i == 1) {
				mas_robot[i].work("Я RobotDancer - я просто танцюю!");
			} else if (i == 2) {
				mas_robot[i].work("Я RobotCoocker - я просто готую!");
			} else {
				mas_robot[i].work("Я Robot - я просто працюю!");
			}

		}

	}

}
