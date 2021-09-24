package Automationpractice.com_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S4_TestClickBox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\API or Server or Browser Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();

        //we are creating a variables called Womentab, so we dont have to write long xpath
        WebElement womenTab = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]"));

        Actions action = new Actions(driver);
        action.moveToElement(womenTab).perform();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[@title='Tops']")).click();
        Thread.sleep(3000);
        
        //driver.findElement(By.id("uniform-layered_id_attribute_group_1")).click();
        driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_1']")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
