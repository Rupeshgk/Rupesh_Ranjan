package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptInmtr {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Hp/Desktop/mtr.html");
	WebElement mtrListbox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListbox);
	List<WebElement> allOpt = s.getOptions();
	for(WebElement option:allOpt)
	{
		String text=option.getText();
		System.out.println(text);
	}
	driver.close();
}
}
