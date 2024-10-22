package Task_October14;

public class PrintMyBook1 extends Book1{


    public PrintMyBook1(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    void getdetails() {


        System.out.println(name+" "+author+" "+price);

    }
}
