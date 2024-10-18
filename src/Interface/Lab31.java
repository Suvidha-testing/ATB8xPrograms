package Interface;

public class Lab31 {

    public static void main(String[] args) {

        p p=new p();
        p.f1();

    }

}
class p implements I
{

    @Override
    public void f1() {

        System.out.println("p is implemented");

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}


interface I
{

    void f1();
    void f2();
    void f3();



}
