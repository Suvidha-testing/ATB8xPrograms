package ex_27_09_2024;

public class EvenNumbers_doWhile {
    public static void main(String[] args) {

        int i=1;
        int even_number=0;
        System.out.println("First 5 even numbers");
        do {

            if(i%2==0) {
                System.out.println(i);
                even_number++;
                if(even_number==5) break;
            }
            i++;
        } while(i<=20);



        /*
        do
        {
        sout(numner);
        number +=2;
        count ++;
        } while (count<=5;


         */

    }
}
