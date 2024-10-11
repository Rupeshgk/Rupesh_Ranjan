package qsp;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handalframe {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	WebElement f1 = driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']"));
	driver.switchTo().frame(f1);
	driver.switchTo().frame(0);
	driver.findElement(By.tagName("input")).sendKeys("hello world");
}

}

