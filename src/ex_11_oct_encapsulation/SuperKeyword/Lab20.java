package ex_11_oct_encapsulation.SuperKeyword;

public class Lab20 {


    //reference variable allows a subclass (child class to reference parent class)

    //use variables
    //use methods
    //use constructors

    public static void main(String[] args) {
        car c = new car();


    }
}


         class car extends vehicle {
            private int maxspeed = 90;


            void display()
            {
                System.out.println("car display");

            }
            car() {
                super();
                System.out.println("DC of car");
                System.out.println(this.maxspeed);
                System.out.println(super.maxspeed);
                this.display();//child display
                super.display();//parent display






            }
        }


        class vehicle {

            public int maxspeed = 100;

            public vehicle() {

                System.out.println("parent vehicle DC");
            }

            void display()
            {
                System.out.println("parent display");

            }
            public vehicle(int maxspeed) {
                this.maxspeed = maxspeed;
                System.out.println("parent vehicle PC");
            }


            void message() {
                System.out.println("hello vehicle");
            }

            void message(int a) {
                System.out.println("hello vehicle");
            }

        }


