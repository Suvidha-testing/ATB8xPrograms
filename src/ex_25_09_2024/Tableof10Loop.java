package ex_25_09_2024;

public class Tableof10Loop {

    public static void main(String[] args) {

        int num=10;
        System.out.println("Table of "+num +" as below");
        for(int i=1;i<=10;i++)
        {
            int result=num*i;
            System.out.println(num + "*" + i + "=" + result);
        }

    }
}
