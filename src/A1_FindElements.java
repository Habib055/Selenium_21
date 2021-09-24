import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A1_FindElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\API or Server or Browser Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        driver.findElement(By.id("search_query_top")).sendKeys("Printed Dress");
        driver.findElement(By.name("submit_search")).click();

        Thread.sleep(1000);

        // This is for simulating mouse actions
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]"))).perform();

        Thread.sleep(5000);

        //If you dont find anything use XPATH FROM
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/div[2]/a[1]/span[1]")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}
