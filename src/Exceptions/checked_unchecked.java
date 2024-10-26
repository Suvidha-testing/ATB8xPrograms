package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class checked_unchecked {

    public static void main(String[] args) {

        //unchecked -arithmetic
        try {
            int a = 0;
            int b = 20 / a;
            System.out.println(b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("unchecked - devide by zero");
        }


        //checked exceptions

        try
        {

            FileInputStream f=new FileInputStream("C://in.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
