package Exceptions;

public class example3 {

    public static void main(String[] args) {

        int c=10;
        try {
            c=10/c;
            String s1=null;
            s1.trim();
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("end");


    }
}
