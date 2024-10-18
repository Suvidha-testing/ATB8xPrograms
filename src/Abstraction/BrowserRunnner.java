package Abstraction;

public class BrowserRunnner {
    public static void main(String[] args) {


        ChromeBrowser c=new ChromeBrowser();
        c.openBrowser();
        c.closeBrowser();
        c.takescreenshot();
        c.whereamIpresent();


        FirefoxBrowser f=new FirefoxBrowser();
        f.openBrowser();
        f.closeBrowser();


    }
}
