package java_core_lesson4.task1;

public class Main {

	public static void main(String[] args) {
		Robot r = new Robot();
		r.work("� Robot - � ������ ������!");
		Robot cr = new CoffeRobot();
		cr.work("� CoffeRobot - � ���� ����!");
		RobotDancer rD = new RobotDancer();
		rD.work("� RobotDancer - � ������ ������!");
		RobotCoocker rC = new RobotCoocker();
		rC.work("� RobotCoocker - �  ������ �����!");
		Robot[] mas_robot = new Robot[] { new CoffeRobot(), new RobotDancer(), new RobotCoocker(), new Robot() };
		for (int i = 0; i < mas_robot.length; i++) {
			if (i == 0) {
				mas_robot[i].work("� CoffeRobot - � ���� ����!");
			} else if (i == 1) {
				mas_robot[i].work("� RobotDancer - � ������ ������!");
			} else if (i == 2) {
				mas_robot[i].work("� RobotCoocker - � ������ �����!");
			} else {
				mas_robot[i].work("� Robot - � ������ ������!");
			}

		}

	}

}
