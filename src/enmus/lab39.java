package enmus;

public class lab39 {

    public static void main(String[] args) {


        System.out.println(APIConstant.BASE_URL);
    }


}

enum APIConstant {


    BASE_URL("app.base"),
    loginpage("loginpage"),
    dashboard("dashboard")
    ;



    private String name;

    APIConstant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}