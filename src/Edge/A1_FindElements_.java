package Edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class A1_FindElements_ {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "D:\\Downloads\\API or Server or Browser Drivers\\Edge\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

     driver.get("https://automationpractice.com");
    }

}

