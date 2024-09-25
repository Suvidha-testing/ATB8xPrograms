package ex_20_09_2024;

public class Traingleclassifier {
    public static void main(String[] args) {

        int side1=10, side2=20, side3=30;

        if(side1==side2 && side2==side3 && side1==side3)
        {
            System.out.println("triagle is equilateral ");
        }
        else if (side1==side2 || side2== side3 || side1==side3)
        {
            System.out.println("triagnle is isosceles");
        }
        else
            System.out.println("scalene");
    }
}
