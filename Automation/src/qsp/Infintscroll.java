package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class Infintscroll {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/ui/scroll/newInfinite");
	driver.findElement(By.linkText("Open In New Tab")).click();
	Set<String> allwid=driver.getWindowHandles();
	for(String wid:allwid)
	{
		driver.switchTo().window(wid);
	}
	Actions a=new Actions(driver);
	JavascriptExecutor js= (JavascriptExecutor)driver;

	for(;;)
	{
		 a.scrollByAmount(0,10000);
	}
	
}
}
