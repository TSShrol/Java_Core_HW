package java_core_lesson7;

public class Cy27 extends Plane implements ÑapabilitiesOfPlane{
	private int maxSpeed;
	private String colorPlane;
	private ControlPlane controlplane = new ControlPlane();

	public Cy27(double length, double width, double weight, int maxSpeed, String colorPlane) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.colorPlane = colorPlane;
	}

	public void moveUp() {
		System.out.println("Plane is moving UP on: " + controlplane.moveUp() + " km");
	}

	public void moveDown() {
		System.out.println("Plane is moving DOWN on: " + controlplane.moveDown() + " km");
	}

	public void moveLeft() {
		System.out.println("Plane is moving LEFT on: " + controlplane.moveLeft() + " km");
	}

	public void moveRigth() {
		System.out.println("Plane is moving RIGTH on: " + controlplane.movieRigth() + " km");
	}

	public void TurboAcceleration() {
		System.out.println("MaxSpeed "+maxSpeed+" increased after use TurboAcceleration and equals "+(int)(Math.random() * (100+maxSpeed) - maxSpeed) + maxSpeed);		
	}

	public void StealthTechnology() {
		System.out.println("Plane is not visiable for "+(int)(Math.random() *100)+" minutes");
	}

	public void NuclearStrike() {
		System.out.println((int)(Math.random()*10)+" nuclear warheads was to dump");
	}

	
}
