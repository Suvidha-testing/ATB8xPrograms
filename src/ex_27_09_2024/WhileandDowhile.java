package ex_27_09_2024;

import java.util.Scanner;

public class WhileandDowhile {
    public static void main(String[] args) {

        //example for while loop
        //print factorial of a number

        //System.out.println("enter a number");
        //Scanner sc=new Scanner(System.in);
        int num=5;
        int fact=1;
        int i=1;
        //using while loop
             while(i<=num)
             {
                 fact=fact*i;
                 i++;
             }


        System.out.println("while loop =factorial of a number is "+fact);


             //using do while loop

        int num2=5;
        int j=1;
        int fact1=1;
        do
        {
            fact1=fact1*j;
            j++;
        }  while(j<=num2);

        System.out.println("do while - factorial of a number is "+fact1);
    }

}
