package ex_20_09_2024;

public class Max3Numbers {

    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c =45;

        int max= a>b ? (a>c ? a: c ) : (b>c? b:c) ;
        System.out.println("max of 3 numbers " +max);






    }
}
