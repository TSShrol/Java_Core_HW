package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
    
	@Override
	public double add(double first, double second) {
		
		return first+second;
	}

	@Override
	public double minus(double first, double second) {
		
		return first-second;
	}

	@Override
	public double multiply(double first, double second) {
		
		return first*second;
	}

	@Override
	public double devide(double first, double second) {
		
		return first/second;
	}
	

}
