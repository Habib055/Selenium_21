import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A3_DemoQa {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\API or Server or Browser Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("item-0")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("userName")).sendKeys("Habib");
        driver.findElement(By.id("userEmail")).sendKeys("Habib@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("314 s Kenmore CA 90020");
        driver.findElement(By.id("permanentAddress")).sendKeys("314 S kenmore CA 90020");

        Thread.sleep(3000);

    driver.quit();
    }
}
