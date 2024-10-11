package qsp;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigatepibgov {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("__disable_notifiction");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://pib.gov.in/indexd.aspx");
	driver.switchTo().alert().accept();
	List<WebElement> alllinks=driver.findElements(By.partialLinkText("Ministry of"));
	ListIterator<WebElement> li=alllinks.listIterator();
	while(li.hasPrevious())
	{
		WebElement ele=li.previous();
		ele.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	Set<String> allwid=driver.getWindowHandles();
	Iterator<String>i=allwid.iterator();
	System.out.println(allwid.size());
	while(i.hasNext())
	{
		String wid =i.next();
		driver.switchTo().window(wid);
		System.out.println(driver.getTitle());
		driver.close();
	}
	}
}
