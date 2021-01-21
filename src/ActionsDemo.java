import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Import the Action and Action classes
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args) throws InterruptedException {

        //Set System Property to Chrom .exe file to invoke the browser below
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        //Invoke the test in Chrome Driver
        WebDriver driver = new ChromeDriver();
        //Maximize screen
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        //Create Actions Class to handle the MouseOver & keyboard interactions (Instantiate a new Actions Object)
        Actions a = new Actions(driver); //Passing driver capabilities into the Actions

        //Defined a Variable
        WebElement move = driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"));

        //To enter upperCase letters Keys.SHIFT Holding down the sift button, then select the upperCase word (How to select in Selenium)
        //Instantiate an Action using the Actions object
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("princes").doubleClick().build().perform();

        //Moves to specific element
        //Right click on specific element, with the help of contextClick() you can right click on specific element
        /*moveToElement() method simply go to mouse-over the link. The build() method is always the final method used so that
        listed actions will be complied into a single step Use the perform() method when executing the Action object
         */
        a.moveToElement(move).contextClick().build().perform(); //Passing web element into the 'moveToElement()' argument
        //Drag and Drop Buttons (When talking about Frames)


        //Window Handling concepts: Implementation of a class
        WindowHandlingConcepts windowhandling = new WindowHandlingConcepts();
        windowhandling.switchWindows();

        //How to handle Frame
        FrameTest frametest = new FrameTest();
        frametest.handleFrameTest();

    }
}
