package com.accolite.au.arithmetic.executor.com.accolite.au.arithmetic.executor;

import com.accolite.au.arithmetics.base.implementors.ArithmeticOperationsImplementor;
import com.accolite.au.arithmetics.base.interfaces.ArithmeticOperations;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.print("Enter 2 numbers to perform +,-,*,/ : ");
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        ArithmeticOperations arith = new ArithmeticOperationsImplementor();

        System.out.println( x + " + " + y + " is " + arith.add(x,y));
        System.out.println( x + " - " + y + " is " + arith.sub(x,y));
        System.out.println( x + " * " + y + " is " + arith.mul(x,y));
        System.out.println( x + " / " + y + " is " + arith.div(x,y));
    }
}
