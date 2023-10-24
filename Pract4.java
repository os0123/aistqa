package pract4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pract4 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://localhost/login_net.php");
driver.manage().window().maximize();
driver.findElement(By.id("user")).sendKeys("Admin");
driver.findElement(By.id("pass")).sendKeys("1234");
driver.findElement(By.id("login")).click();
if(driver.getTitle().contains("welcome")){
System.out.print("Login Successful!");
}
else{
System.out.print("Login Failed!");
}
}
}