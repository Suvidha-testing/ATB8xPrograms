package Exceptions;

public class example4 {
    public static void main(String[] args) {
        try
        {
            String s1="suvidha";
          String a1=args[0];
            int a=10/0;
            s1=null;
            System.out.println(s1.trim());


        }
        catch (Exception e)
        {
            System.out.println("prob with code");
            System.out.println(e.getMessage());
        }


        System.out.println("end of program");

    }
}
