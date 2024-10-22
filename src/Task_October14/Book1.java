package Task_October14;

abstract class Book1 {

    abstract void getdetails();

    String name;
    String author;
    int price;

    public Book1(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }


}
