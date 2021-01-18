import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args) {

        //Set System Property to Chrom .exe file to invoke the browser below
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        //Invoke the test in Chrome Driver
        WebDriver driver = new ChromeDriver();
        //Maximize screen
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        //Create Actions Class to handle the MouseOver & keyboard interactions
        Actions a = new Actions(driver); //Passing driver capabilities into the Actions

        //Defined a Variable
        WebElement move = driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"));

        //To enter upperCase letters Keys.SHIFT Holding down the sift button, then select the upperCase word (How to select in Selenium)
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("princes").doubleClick().build().perform();

        //Moves to specific element
        //Right click on specific element, with the help og contextClick() ou can right click on specific element
        a.moveToElement(move).contextClick().build().perform(); //Passing web element into the 'moveToElement()' argument
        //Drag and Drop Buttons (When talking about frame)

    }
}
