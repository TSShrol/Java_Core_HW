package java_core_lesson4.task2;

public class Helm {//кермо
	private int diametr;
	private String season;
	
	public Helm(int diametr, String season) {
		//super();
		this.diametr = diametr;
		this.season = season;
	}
	
	public void changeDiametr(int diametr) {
		this.diametr=diametr;
	}
	
	public int getDiametr() {
		return diametr;
	}
	
	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}
	
	public String getSeason() {
		return season;
	}
	
	public void setSeason(String season) {
		this.season = season;
	}
	
	@Override
	public String toString() {
		return "Helm [ Diametr="+diametr+". Season="+season+"]";
	}

}
