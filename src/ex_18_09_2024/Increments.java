package ex_18_09_2024;

public class Increments {

    public static void main(String[] args) {
        //expression 1

        int a =10;
        int result =--a + a --  + a--;
        System.out.println("value of expression is  " +result);
        System.out.println("value of a is " +a);


        //expression 2
        int a1=10;
        int result1 = --a1 + a1++ + a1--;
        System.out.println("value of expression is  " +result1);
        System.out.println("value of a is " +a1);


        //expression 3

        int a2=10;
        int result2 = a2-- + a2 --  + a2 --;
        System.out.println("value of expression is  " +result2);
        System.out.println("value of a is " +a2);

    }

}
