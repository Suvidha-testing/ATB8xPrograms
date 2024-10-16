package ex_11_oct_encapsulation.SuperKeyword;

public class Testcase1 extends BaseClass{

    Testcase1()
    {
        super(); //super calls default constructor of parent class

    }

    @Override
    public void setBrowser(String name, boolean Isadmin) {
        super.setBrowser(name, Isadmin);
    }
}
