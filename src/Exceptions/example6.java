package Exceptions;

public class example6
{
    public static void main(String[] args) {


        int a =0;
        try {
            int c =10/a;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {

            System.out.println("always executed");
        }


    }



}
