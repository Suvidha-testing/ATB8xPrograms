package ex_11_oct_encapsulation;

public class GoodVwologin {
private String username;
private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isadmin) {

        if(isadmin)
        {
            System.out.println("allowed");
        }
        else
            System.out.println("notallowed");
       this.password = password;
       System.out.println(password);
    }

    public GoodVwologin(String username, String password) {
        this.username = username;
        this.password=password;





    }
}
