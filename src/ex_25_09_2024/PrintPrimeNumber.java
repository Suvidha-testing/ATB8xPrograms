package ex_25_09_2024;

public class PrintPrimeNumber {
    public static void main(String[] args) {

        System.out.println("prime numbers between 1 to 100 are below");
        for(int i=1;i<=100;i++)
        {

            boolean primeNUmber=true;

            if(i>1)
            {
              for(int j=2;j<i;j++)
              {
                  if(i%j==0)
                      primeNUmber=false;
              }
            }
            else primeNUmber=false;

            if(primeNUmber)
                System.out.println(i);

        }


    }
}
