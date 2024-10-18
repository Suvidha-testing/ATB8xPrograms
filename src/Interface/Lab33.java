package Interface;

public class Lab33 {


}


interface I3
{

    void f1(); //cannot have a body inside function

    static void f2()
    {
         //can have a body with static method
    }


    default void f3()
    {
        //can have a body with default

    }
}


abstract class I4
{
    //abstarct class can have both abstarct method and normal method

    void f5()
    {
        //can have a body with void function
    }

    abstract void f6(); //cannot have a body inside function


}


