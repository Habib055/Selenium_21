import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OC_Walmart {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "BrowserDriver/Chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.walmart.com/");

        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());

        Thread.sleep(5000);

        driver.close();

    }
}