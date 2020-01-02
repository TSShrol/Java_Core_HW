package com.lgs.lab.interface2;

public class TestMain {

	public static void main(String[] args) {
		MyCalculator mycalculator=new MyCalculator();
		System.out.println(mycalculator.add(3,4));
		System.out.println(mycalculator.minus(3,4));
		System.out.println(mycalculator.devide(3,4));
		System.out.println(mycalculator.multiply(3,4));
	}

}
