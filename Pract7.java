package pract7;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pract7 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
driver.manage().window().maximize();
List<WebElement> links = driver.findElements(By.tagName("a"));
List<WebElement> buttons = driver.findElements(By.tagName("button"));
List<WebElement> fields = driver.findElements(By.tagName("input"));
System.out.println("Total No. of links = " +links.size());
System.out.println("Total No. of buttons = " +buttons.size());
System.out.println("Total No. of fields = " +fields.size());
driver.quit();
}
}