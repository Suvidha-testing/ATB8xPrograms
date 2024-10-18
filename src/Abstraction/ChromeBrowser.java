package Abstraction;

public class ChromeBrowser extends BaseClass{

    @Override
    void openBrowser() {
        System.out.println("Opening the chrome browser");
    }

    @Override
    void closeBrowser() {
        System.out.println("Closing the chrome browser");
    }
}
