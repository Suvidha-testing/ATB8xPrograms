package Exceptions;

public class Exceptions {
    public static void main(String[] args) {

        System.out.println("start of the program");

        //taking arguments from command line

        String ip=args[0];
        String ip1=args[1];


        //10 value stored from configuration
        System.out.println(ip);
        System.out.println(ip1);

        //parsing the int

        int a =Integer.parseInt(ip);
        int a2=a;
        System.out.println(a);
        int b=1000/a;
        System.out.println(b);

        String c="suvidha";
        int c1=Integer.parseInt(c); //not pissible as c is a string
                                   //number fromat exception






    }
}
