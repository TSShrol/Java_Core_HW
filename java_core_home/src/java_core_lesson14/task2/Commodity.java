package java_core_lesson14.task2;

import java.util.ArrayList;
import java.util.Iterator;

import java_core_lesson13.task1.Deputat;

public class Commodity {
	private String nameCommodity;
	private double length;
	private double width;
	private double weight;
	public Commodity(String nameCommodity, double length, double width, double weight) {
		this.nameCommodity = nameCommodity;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	public String getnameCommodity() {
		return nameCommodity;
	}
	public void setnameCommodity(String nameCommodity) {
		this.nameCommodity = nameCommodity;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Commodity: " + nameCommodity + ", length=" + length + ", width=" + width + ", weight="
				+ weight + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nameCommodity == null) ? 0 : nameCommodity.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (nameCommodity == null) {
			if (other.nameCommodity != null)
				return false;
		} else if (!nameCommodity.equals(other.nameCommodity))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	



		
}
