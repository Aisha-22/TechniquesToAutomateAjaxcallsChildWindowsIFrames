import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FrameTest {
    public void handleFrameTest() {

        //Set System Property to Chrom .exe file to invoke the browser below
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        //Chrome Driver to Invoke the test = creating an object for my driver
        WebDriver driver = new ChromeDriver();

        //Implicit Wait Machine - When your code/test executes faster than your browser, test works with elements that are not there.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/droppable/");

        //How many frames are present in the execution. All the counts in my web drive application
        System.out.println(driver.findElements(By.tagName("iframe")).size());//If you dont have the code this process can help you
        //Switch frame with index
        driver.switchTo().frame(0);
                //Tell Selenium -> go into Frame and handle it
        //How to switch into frame with string index/ frameId / web element
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); //By Web Element
        //After the above step execution
//        driver.findElement(By.id("draggable")).click();

        //To have a proper validation -> Drag and Drop concept on here of action -> Can be achievable with the the cations class
        Actions actions = new Actions(driver);
        /*Drag and Drop takes in two arguments (From source you need to drag into target) -> How selenium knows 'what is source and what is target' you need to provide this in the
        fom of web elements
         */
        //Declare Web Elements before the Test
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        //With action class you need to build > the class then > execute
        actions.dragAndDrop(source, target).build().perform();

        //Telling driver to go back to the default content
        driver.switchTo().defaultContent();//goes back to the normal window

    }
}
