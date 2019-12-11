package java_core_lesson4.task1;

public class Main {

	public static void main(String[] args) {
		Robot r=new Robot();
		r.work();
		Robot cr=new CoffeRobot();
		cr.work();
		RobotDancer rD=new RobotDancer();
		rD.work();
		RobotCoocker rC=new RobotCoocker();
		rC.work();
		Robot []mas_robot=new Robot[] {new CoffeRobot(),new RobotDancer(), new RobotCoocker()};
		for(int i=0; i<mas_robot.length;i++) {
			mas_robot[i].work();
		}
  
	}

}
