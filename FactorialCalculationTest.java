package com.yang.warrior.com.yang.warrior.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by richardyang on 4/16/17.
 */
class FactorialCalculationTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void recursiveFactorial() {
        System.out.println("Entering recursiveFactorial()");
        int fNumb = 5;
        FactorialCalculation fr = new FactorialCalculation();
        int result = fr.recursiveFactorial(fNumb);
        System.out.println("Factorial: " + fNumb + " Result: " + result);

    }

    @Test
    void recursiveUpFactorial() {
        System.out.println("Entering recursiveUpFactorial()");
        int fNumb = 5;
        FactorialCalculation fr = new FactorialCalculation();
        int result = fr.recursiveFactorial(fNumb);
        System.out.println("Factorial: " + fNumb + " Result: " + result);

    }

    @Test
    void loopFactorial() {
        System.out.println("Entering loopFactorial()");
        int fNumb = 5;
        FactorialCalculation fr = new FactorialCalculation();
        int result = fr.loopFactorial(fNumb);
        System.out.println("loopFactorial: " + fNumb + " Result: " + result);
    }

    @Test
    void whileLoopFactorial() {
        System.out.println("Entering loopFactorial()");
        int fNumb = 5;
        FactorialCalculation fr = new FactorialCalculation();
        int result = fr.whileLoopFactorial(fNumb);
        System.out.println("whileLoopFactorial: " + fNumb + " Result: " + result);
    }

    @Test
    void doWhileLoopFactorial() {
        System.out.println("Entering doWhileloopFactorial()");
        int fNumb = 5;
        FactorialCalculation fr = new FactorialCalculation();
        int result = fr.doWhileLoopFactorial(fNumb);
        System.out.println("doWhileLoopFactorial: " + fNumb + " Result: " + result);
    }



}