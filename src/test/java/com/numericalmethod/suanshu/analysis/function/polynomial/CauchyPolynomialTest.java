package com.numericalmethod.suanshu.analysis.function.polynomial;

import org.junit.Test;

import static org.junit.Assert.*;

public class CauchyPolynomialTest {

    @Test
    public void test()
    {
            double d = new CauchyPolynomial().lowerBound();
            HornerScheme horner = new HornerScheme();
            assertEquals(horner.remainder(), -2, 1e-15);
    }

}