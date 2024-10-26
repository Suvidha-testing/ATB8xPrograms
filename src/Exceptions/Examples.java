package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Examples {

    //checked exception

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream f=new FileInputStream("C\f");


        //unchecked exceptions
        //jvm will not know abput it during compilation

        int c =10/0; //arithmentic expression

    }

}
