package pract3;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pract3 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");   
driver.manage().window().maximize();
List lists = driver.findElements(By.xpath("//select/option"));
System.out.println("Total no. of lists: " + lists.size());
}
}