package ex_23_09_2024;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {


        int num1=20, num2=10;
        char operation='*';
        int result;
        switch(operation) {
            case '+':
                result = num1+num2;
                System.out.println("Result of addition is " +result);
                break;

            case '-':
                result = num1-num2;
                System.out.println("Result of Subtraction is " +result);
                break;

            case '*':
                result = num1*num2;
                System.out.println("Result of Multiplication is " +result);
                break;

            case '/':
                result = num1/num2;
                System.out.println("Result of division is " +result);
                break;

            case '%':
                result = num1%num2;
                System.out.println("Result of modulus is " +result);
                break;

            default:
                System.out.println("Operation is not valid");
                break;
        }

    }
}
