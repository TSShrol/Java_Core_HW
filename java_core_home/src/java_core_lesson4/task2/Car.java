package java_core_lesson4.task2;

public class Car {
    private String brandOfcar;
	private Helm helm;
	
	public Car(String brandOfcar, Helm helm) {
		super();
		this.brandOfcar = brandOfcar;
		this.helm = helm;
	}

	public String getBrandOfcar() {
		return brandOfcar;
	}

	public void setBrandOfcar(String brandOfcar) {
		this.brandOfcar = brandOfcar;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	@Override
	public String toString() {
		return "Car [brandOfcar=" + brandOfcar + ", helm=[" + helm.getDiametr()+", "+helm.getSeason() + "]]";
	}
	
	
	
}
