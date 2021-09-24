import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OC_Yahoo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "SeleniumProjects/BrowserDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com/");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(3000);

        driver.close();
    }

}