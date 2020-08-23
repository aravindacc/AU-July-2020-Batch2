package com.accolite.au.arithmetics.base.implementors;

import com.accolite.au.arithmetics.base.interfaces.ArithmeticOperations;

public class ArithmeticOperationsImplementor implements ArithmeticOperations {
    public int add(int no1, int no2) {
        return no1+no2;
    }

    public int sub(int no1, int no2) {
        return no1-no2;
    }

    public int mul(int no1, int no2) {
        return no1*no2;
    }

    public int div(int no1, int no2) {
        return no1/no2;
    }
}
