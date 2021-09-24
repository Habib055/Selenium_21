import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_N_Close_Browser {

    public static void main(String[] args) throws InterruptedException {

        //Test Scripts = Clients/Users Actions'

        // 1st, ADD Selenium Library
        // press F4 = Module settings

        //maven = dependencies = jar files = external libraries

        //2nd, PUT location/path of the API
        System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver.exe");

        WebDriver obj = new ChromeDriver();

        //object.variables
        //object.methods

        obj.get("https://www.youtube.com/");

        //this is to maximize the browser window
        obj.manage().window().maximize();

        //this will wait 5 sec
        Thread.sleep(3000);
       // psvm
                

       // System.out.println(obj.getTitle());
        System.out.println(obj.getCurrentUrl());


        //this will close browser
        obj.close();

    }
}