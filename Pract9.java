package pract9;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Pract9 {
public static void main(String[] args) {
// TODO code application logic here]
System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
driver.get("C:\\Users\\pract9.html");
driver.manage().window().maximize();
List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
System.out.println("Total no of checkboxes : " + check.size());
int checked_Count=0,unchecked_Count=0;
for(int i=0;i<check.size();i++)
{
if(check.get(i).isSelected())
{
checked_Count++;
 }
else
{
unchecked_Count++;
}
}
System.out.println("Number of selected checkboxes are : "+checked_Count);
System.out.println("Number of unselected checkboxes are : "+unchecked_Count);
}}


//html
<html>
<head>
    <title>Checkbox Example</title>
</head>
<body>
    <input type="checkbox" checked> Checkbox 1<br>
    <input type="checkbox"> Checkbox 2<br>
    <input type="checkbox" checked> Checkbox 3<br>
    <input type="checkbox"> Checkbox 4<br>
    <input type="checkbox" checked> Checkbox 5<br>
    <input type="checkbox"> Checkbox 6<br>
</body>
</html>