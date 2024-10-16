package Task_October11;

import javax.swing.plaf.IconUIResource;

public class BaseTestAPI {


    //Data encapsulation using getters and setters for private variables
    private String name;
    private int id=12;

    public BaseTestAPI() {

        System.out.println("This is a default constructor of BaseTestAPI class");
    }

    public BaseTestAPI(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("this is a parameterised constructor of BaseTest API");

    }

    public String getName() {
        return name;
    }

    public void setName(String name,boolean Isadmin)
    {
        if(Isadmin)
        {
            System.out.println("Name update is allowed" + name);
        }
        else
        {
            System.out.println("name update is not allowed");
        }
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void performGET()
    {
        System.out.println("Function to perform Get operation ");

    }

    void display()
    {
        System.out.println("this is a parent class");
    }

//method overloading
    public void performPOST()
    {

        System.out.println("Function to perform POST operation ");
    }

    //method overloading
    public void performPOST(String Httpmethod)
    {

        System.out.println("Performing Post operation for  " +Httpmethod);
    }

    public void performPATCH()
    {
        System.out.println("Function to perform PATCH operation ");
    }

   public void performPUT()
   {
       System.out.println("Function to perform PUT operation ");
   }

   public void performDELETE()
   {
       System.out.println("Function to perform DELETE operation ");
   }


}
