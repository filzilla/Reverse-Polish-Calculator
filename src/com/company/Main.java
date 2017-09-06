/**
 * Test Driven Development (TDD)
 * Write your tests first and watch them fail.
 * Then write the algorithm and watch the tests pass.
 */
package com.company;

public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

//         Write tests for the other operators (-, *, /)

        String rpnExpression1 = "5.0,2.5,-";
        double expectedResult1 = 2.5;
        double actualResult1 = rpc.calculate(rpnExpression1);
        checkResult(rpnExpression1, expectedResult1, actualResult1);

        String rpnExpression2 = "2.5,5.0,*";
        double expectedResult2 = 12.5;
        double actualResult2 = rpc.calculate(rpnExpression2);
        checkResult(rpnExpression2, expectedResult2, actualResult2);


        String rpnExpression3 = "3.0,12.0,/";
        double expectedResult3 = 4.0;
        double actualResult3 = rpc.calculate(rpnExpression3);
        checkResult(rpnExpression3, expectedResult3, actualResult3);

        
    //     Uncomment this test which has many operators
        String rpnExpression4 = "5,1,2,+,4,*,+,3,-";
        double expectedResult4 = 14.0;
        double actualResult4 = rpc.calculate(rpnExpression4);
        checkResult(rpnExpression4, expectedResult4, actualResult4);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
