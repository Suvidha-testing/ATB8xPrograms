package Task_October11;

public class APIAutomation {

    public static void main(String[] args) {


    BaseTestAPI b1=new TestCaseAPI(); //dynamic dispatch
        b1.performPOST();
        b1.performPOST("getusername");
        b1.setName("Suvidha",false);



    }
}
