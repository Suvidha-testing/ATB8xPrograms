package Polymorphism_overloading;

public class Runner_mathop {

    public static void main(String[] args) {

        Mathoperations m=new Mathoperations();

        int result= m.add(3,5);

        String result1=m.add("suvidha","hegde");

        System.out.println("result is " +result);
        System.out.println("concat is" +result1);
    }
}
