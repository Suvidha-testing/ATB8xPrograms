package Task_October14;

public class PrintMyBook extends Book
{

 PrintMyBook(String name,String author,int price)
 {

     this.name=name;
     this.author=author;
     this.price=price;

 }


    @Override
    void getDetails() {

        System.out.println(name+" "+author+ " " +price);


    }
}