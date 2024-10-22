package Static;

public class Lab36 {

    public static void main(String[] args) {

        ATB a =new ATB("suvidha",30);
        ATB b=new ATB("sam",31);
        a.getName();
        ATB.doassignment();

    }
}


class ATB
{

    private String name;
    private int number;
    static  String batch;


    {
        System.out.println("IIB");

        //here you can write the code, related to start a website or anything
        //before starting the web automation


        System.out.println("Reading the file from csv");

    }


    static
    {

        System.out.println("load the class,");
    }


    public ATB(String name, int number) {
        this.name = name;
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    static void doassignment()
    {
        System.out.println("do assignment");
    }
}