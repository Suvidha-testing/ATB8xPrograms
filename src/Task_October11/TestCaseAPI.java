package Task_October11;

import ex_11_oct_encapsulation.SuperKeyword.Testcase1;

//
public class TestCaseAPI extends BaseTestAPI{

    private int id=123;

   void display()
   {
       System.out.println("this is a child class");
   }
     TestCaseAPI()
     {
         super(); //super keyword
         System.out.println("this is a test case API default constructor");


         //use of this keyword
         System.out.println("When used this keyword -ID value of current class  " +this.id);

         //use of super keyword
        super.display();

     }


    public TestCaseAPI(String name, int id) {
        super(name, id);
    }




    //method overriding
    @Override
    public void performGET() {
        super.performGET();
    }
}
