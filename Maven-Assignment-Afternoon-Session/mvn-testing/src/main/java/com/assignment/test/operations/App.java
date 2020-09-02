package com.assignment.test.operations;

import java.util.Scanner;

import com.assignment.au.airthmetic.implementation.AirthmeticOperationImpl;
import com.assignment.au.airthmetic.interfaces.AirthmeticOperationInterface;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
    	AirthmeticOperationInterface airthmeticResults = new AirthmeticOperationImpl();
    	System.out.println("Enter value of a & b :");
    	int a = s.nextInt();
    	int b = s.nextInt();
        System.out.println("a + b : " + airthmeticResults.add(a, b));
        System.out.println("a - b : " + airthmeticResults.subtract(a, b));
        System.out.println("a * b : " + airthmeticResults.multiply(a, b));
        System.out.println("a / b : " + airthmeticResults.divide(a, b));
        s.close();
        
    }
}
