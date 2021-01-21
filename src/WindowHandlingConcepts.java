import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandlingConcepts {
    //Creating a Method
    public void switchWindows() throws InterruptedException {

        //Set System Property to Chrom .exe file to invoke the browser below
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        //Invoke the test in Chrome Driver = creating an object for my driver
        WebDriver driver = new ChromeDriver();

        //Implicit Wait Machine - When your code/test executes faster than your browser, test works with elements that are not there.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        Thread.sleep(3000);
        //Clicking on the link, to open a separate tab
        driver.findElement(By.cssSelector(".blinkingText")).click();

        //How to Switch from Parent to Child Browser?(New tab / New window it is treated as New Window only in Selenium) Getting the WindowHandles
        //We have two windows IDs are sitting in the windows object - In this case we have Parent String & Child String
        Set<String> windows = driver.getWindowHandles(); //[parentid, childid]

        //Goal is to pull ids from the 'windows' witch is called the set data structure - you can do this by using a Method call iterator()
        Iterator<String> it = windows.iterator();//This variable can go and extract the values present in your set collection

        //This Method can help you get the Next index of you set
        String parentId = it.next();//Control will go to the [0] index
        String childId = it.next();//Controller will with switchTo from [0] to [1] index

        //To Switch to Child Window
        driver.switchTo().window(childId); //You have to pass a string ID of the window you want to switch into as an argument in this cae you want to switch from parent to child ID.

        //Extract to Paragraph and used getText() to print it in the output
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

        //Apply Java string Methods to extract the email address - Methods such as 'Split & Trim' = Code to pass and extract email id
        //Inspect you code at run time by debugging by break point right click
        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

        //Switch back to parent window
        driver.switchTo().window(parentId);

        //You got emailId = Past in the parent window emailId
        driver.findElement(By.id("username")).sendKeys(emailId);

    }
}
