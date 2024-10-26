package Exceptions;

public class example7
{
    public static void main(String[] args) {

        try {
            String ip=args[0];
            int c=Integer.parseInt(ip);
            int a=10/c;
        }

        //catch (ArrayIndexOutOfBoundsException | NumberFormatException  |ArithmeticException e) {
           // System.out.println(e.getMessage());
       // }

        catch(Throwable e)
        {
            System.out.println(e.getMessage());
        }


    }


}
