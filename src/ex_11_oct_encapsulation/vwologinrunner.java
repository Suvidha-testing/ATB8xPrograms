package ex_11_oct_encapsulation;

public class vwologinrunner {

    public static void main(String[] args) {


        //in vwologin class username and password is public
        vwologin vwologin = new vwologin("admin", "password123");
        System.out.println(vwologin.username);
        System.out.println(vwologin.password);
        //class parameters are accessible by others as it is not private
        vwologin.password="newpassword";



        //encapsulation

        //Goodvwologin class parameters are defined as private hence
        // they are not accessible by other class
        GoodVwologin goodVwologin=new GoodVwologin("admin","password123");

             goodVwologin.getPassword();
             goodVwologin.setPassword("password1",false);





    }
}
