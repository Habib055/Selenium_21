package Automationpractice.com_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1_TestSearch {

    public static void main(String[] args)  throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\API or Server or Browser Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("search_query_top")).sendKeys("Women");
        driver.findElement(By.name("submit_search")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("search_query_top")).clear();
        driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");
        driver.findElement(By.name("submit_search")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("search_query_top")).clear();
        driver.findElement(By.id("search_query_top")).sendKeys("Dress");
        driver.findElement(By.name("submit_search")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
