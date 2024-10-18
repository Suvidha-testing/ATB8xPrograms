package Abstraction;

public class FirefoxBrowser extends BaseClass{


    @Override
    void openBrowser() {
        System.out.println("Opening the firefox browser");
    }

    @Override
    void closeBrowser() {
        System.out.println("Closing the firefox browser");
    }
}
