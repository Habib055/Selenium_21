package Automationpractice.com_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S8_TestPriceChange {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\API or Server or Browser Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationpractice.com/");
        driver.manage().window().maximize();
    }
}
