import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OC_CNN {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "SeleniumProjects/BrowserDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cnn.com/");

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(3500);

        driver.close();
    }

}
