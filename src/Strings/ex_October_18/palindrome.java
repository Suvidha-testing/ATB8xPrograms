package Strings.ex_October_18;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        //String s1="madam";
        String rev="";

        System.out.println("Input the String ");
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();



        for(int i=s1.length()-1;i>=0;i--)
        {

             rev=rev+s1.charAt(i);

        }


        System.out.println("Revrerse of thr string is  "+rev);
        if(s1.equals(rev))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");


sc.close();
    }

}
