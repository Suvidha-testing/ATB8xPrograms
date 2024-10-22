package Strings.ex_October_18;

public class StringReverse {

    public static void main(String[] args) {

        String s1="Suvidha";
        String rev="";
        char ch;
        int i=0;


        for (i=s1.length()-1;i>=0;i--)
        {

            ch=s1.charAt(i);
            rev=rev+ch;

        }


        System.out.println("revrse of the string is "+rev);


    }





}
