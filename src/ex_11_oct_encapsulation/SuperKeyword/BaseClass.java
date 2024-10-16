package ex_11_oct_encapsulation.SuperKeyword;

public class BaseClass {

    private String browser;
    public BaseClass() {

        System.out.println("DC of baseclass");
    }

    public BaseClass(String a) {
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String name,boolean Isadmin)
    {
        if(Isadmin) {
            this.browser = name;

        }

        else
            System.out.println("not allowed");
    }



    void OPenBrowser()
    {
        System.out.println("Chrome browser starting");
    }

    void OPenBrowser(String browsername)
    {
        System.out.println("Browser name  "+browsername );
    }
    void CloseBrowser()
    {
        System.out.println("Close browser");
    }
}
