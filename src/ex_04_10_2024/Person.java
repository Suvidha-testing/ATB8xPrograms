package ex_04_10_2024;

public class Person {

    String name;
    int age;
    String occupation;
    String location;
    String marital_status;
    long phone_number;
    int salary;
    long adhaar_number;
    String hobby;
    String gender;
    float weight;


    // function with no return type and no arguments
     Person()
    {
        System.out.println("Constructor called: I am a defeault constructor");
    }

    //function with return type and no arguments
      float excerise()
      {
          return weight;
      }

      //parameterised constructor
   //function with arguments and no return type
    Person(String name,int age,String occupation,String hobby, String gender)
   {
       System.out.println("Parameterised constructor is called");
       System.out.println("Name of the person is " + name);

   }


// //function with return type and arguments
    static int Job_details(String occupation, int salary)
    {

              return salary;

    }



 static  void personal_details()
 {

 }


}
