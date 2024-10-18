package Interface;

public class Lab32 {


    public static void main(String[] args) {

        p1 p=new p1();
        p.f3();


    }
}


class abc{

    void display()
    {



    }




}


class p1 implements I1,I2{


    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {


        System.out.println("f3");

    }

    @Override
    public void f4() {

    }
}




interface I1
{

    void f1();
    void f2();

}

interface I2
{
    void f3();
    void f4();


}