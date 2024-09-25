package ex_25_09_2024;

public class FactorialofNumber {
    public static void main(String[] args) {
        int num=6;
        int factorial=1;
        for(int i=1;i<=num;i++)
        {
            factorial=factorial*i;

        }

        System.out.println("Factorial of "+num+ " is " +factorial);
    }
}
