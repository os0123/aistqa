package pract8;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pract8 {
public static void main(String[] args) {
// TODO code application logic here
System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("C:\\Users\\index.html");
driver.manage().window().maximize();
List list1 = driver.findElements(By.xpath("//select/option"));
List list2 = driver.findElements(By.xpath("//ul/li"));
System.out.println("Total no. of Subjects: " +list2.size());
System.out.println("Total no. of Characters: " +list1.size());
}
}