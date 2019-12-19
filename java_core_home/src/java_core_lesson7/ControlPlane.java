package java_core_lesson7;

import java.util.Random;

public class ControlPlane {
	public int moveUp() {
		Random r = new Random();
		return r.nextInt(100);
	}
	public int moveDown() {
		Random r = new Random();
		return r.nextInt(100);
	}
	public int moveLeft() {
		Random r = new Random();
		return r.nextInt(100);
	}
	public int movieRigth() {
		Random r = new Random();
		return r.nextInt(100);
	}
}
