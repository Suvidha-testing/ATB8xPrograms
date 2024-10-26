package Exceptions;

public class CustomException
{

    public static void main(String[] args) throws Exception {


        Bank sbi=new Bank(100,"INR");
        Bank icici=new Bank(200,"icici");

        Bank jpmc=new Bank(123,"jpmc");

        System.out.println(sbi.add(jpmc));



    }


}
