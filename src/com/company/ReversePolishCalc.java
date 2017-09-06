package com.company;
import java.util.Stack;



public class ReversePolishCalc {


    Stack calcStack = new Stack();

    public double calculate(String input) {

        double numOne;
        double numTwo;
        double tempAnswer;

        String[] tokens = input.split(",");


        for (String token : tokens) {


            if (operand(token)) {


                numOne = Double.parseDouble(calcStack.pop().toString());
                numTwo = Double.parseDouble(calcStack.pop().toString());

                switch (token) {
                    case "+":

                        System.out.println(numOne);
                        System.out.println(numTwo);
                        tempAnswer = numOne + numTwo;
                        calcStack.push(tempAnswer);
                        break;
                                                        //  Java Stack class
                    case "-":                           ///   take in a token

                        System.out.println(numOne);
                        System.out.println(numTwo);
                                                         //     if number push onto the calcStack
                        tempAnswer = numTwo - numOne;
                        calcStack.push(tempAnswer);
                        break;
                                                         //     when an opearand comes up pop it from the tokens and evaluate and
                                                         //      then push answer back onto the calcStack
                    case "*":

                        System.out.println(numOne);
                        System.out.println(numTwo);
                        tempAnswer = numOne * numTwo;
                        calcStack.push(tempAnswer);
                        break;

                    case "/":

                        System.out.println(numOne);
                        System.out.println(numTwo);
                        tempAnswer = numOne / numTwo;
                        calcStack.push(tempAnswer);
                        break;
                }


            } else {

                calcStack.push(token);
            }
        }
            System.out.println(calcStack);
            return Double.parseDouble(calcStack.peek().toString());

    }


    private boolean operand(String input) {

        boolean operator;

        switch (input) {
            case "+":
                operator = true;
                break;
            case "-":
                operator = true;
                break;
            case "*":
                operator = true;
                break;
            case "/":
                operator = true;
                break;
            default:
                operator = false;
        }
        return operator;
    }
}


