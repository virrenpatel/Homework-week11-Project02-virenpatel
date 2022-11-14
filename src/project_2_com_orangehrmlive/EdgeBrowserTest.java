package project_2_com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        //Set Property
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        //Create Object
        WebDriver driver = new EdgeDriver();

        //Launch URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Maximise window
        driver.manage().window().maximize();

        //Give implicit time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        System.out.println("the Page title is :" + driver.getTitle());

        //Get current URL
        System.out.println("The Current URL is :" + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("The Page source is " + driver.getPageSource());

        //Find User aname field and enter username
        WebElement enterUser = driver.findElement(By.name("username"));
        enterUser.sendKeys("javateam@gmail.com");
        //Find Password Field and enter password
        WebElement enterPass = driver.findElement(By.name("password"));
        enterPass.sendKeys("javateam7789");

        //Close the browser
        //driver.quit();
    }
}