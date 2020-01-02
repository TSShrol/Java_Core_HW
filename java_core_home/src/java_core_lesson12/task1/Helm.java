package java_core_lesson12.task1;

public class Helm {
	int diametrHelm;
	String material;
	
	public Helm(int diametrHelm, String material) {
		this.diametrHelm = diametrHelm;
		this.material = material;
	}

	public int getDiametrHelm() {
		return diametrHelm;
	}

	public void setDiametrHelm(int diametrHelm) {
		this.diametrHelm = diametrHelm;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Helm (diametrHelm=" + diametrHelm + ", material=" + material + ")";
	}

	enum Material {
		SKIN, ALCATOR
	}
}
