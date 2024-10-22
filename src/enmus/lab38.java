package enmus;

public class lab38 {

    public static void main(String[] args) {

        System.out.println(color.GREEN);
    }


}


enum color
{
    RED("#1245"),
    GREEN("#456"),
        BLUE("#456");

    private String hexcode;

private color(String hexcode)
{
    this.hexcode=hexcode;
}


}