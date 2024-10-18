package Abstraction.realex2;

public class Wagnr extends Engine{


    void drive()
    {

        StartEngine();
        StopEngine();

    }




    @Override
    void StartEngine() {

        System.out.println("starting car");

    }

    @Override
    void StopEngine() {

        System.out.println("stopping car");
    }
}
