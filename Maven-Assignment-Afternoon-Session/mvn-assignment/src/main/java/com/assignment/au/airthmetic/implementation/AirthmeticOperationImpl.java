package com.assignment.au.airthmetic.implementation;
import com.assignment.au.airthmetic.interfaces.*;
public class AirthmeticOperationImpl implements AirthmeticOperationInterface{

    
	@Override
	public int add(int a, int b) {
		
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
	
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
	
		return a * b;
	}

	@Override
	public double divide(int a, int b) {
		if(b == 0)
			throw new ArithmeticException();
		else
			return a / b;
	}

}
