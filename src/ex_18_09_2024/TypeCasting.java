package ex_18_09_2024;

public class TypeCasting {
    public static void main(String[] args) {
        //Give some another example of Widening with Implicit and Explicit,
        // Narrowing with implicit and explicit.


        //Widening  - Implicit casting

        int a=10;
        long b=a;
        System.out.println("Widening - Implicit casting " + b);

        //Widening  - Explicit  casting

        int a1=10;
        long b1=(long)a;
        System.out.println("Widening - Explicit casting " + b);


        //Narrowing  - Implicit casting

           //int c=10;
        //byte d=c;   //invalid casting- shows error

        //Widening  - Explicit casting, eg-1

           float percentage =78.78f;
           int i1=(int)percentage;
        System.out.println("Narrowing - Implicit casting " + i1);

        //Widening  - Explicit casting, loss of data

        int price_gold =6500;
        byte i2=(byte)price_gold;
        System.out.println("Narrowing - Implicit casting " + i2);



    }




}
