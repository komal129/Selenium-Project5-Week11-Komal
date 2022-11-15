package comUtimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.msedgedriver.driver","drivers/msedgedriver.exe");

        //Creating object for the Edge browser
        WebDriver driver = new EdgeDriver();

        //Launching the URL
        driver.get(baseUrl);

        // Maximise the browser window
        driver.manage().window().maximize();

        // Giving implicit wait time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Getting the page title
        String title = driver.getTitle();
        System.out.println("The page title is: " +title);

        // Getting current URL
        System.out.println("Current URL is: " +driver.getCurrentUrl());

        // Getting page source
        System.out.println("Page source is: " +driver.getPageSource());

        // Find the Email field and enter the email id
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("user123@xyz.com");

        //Find the password field element and enter the password
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("user123");

        // Closing the browser
        driver.quit();
    }
}
