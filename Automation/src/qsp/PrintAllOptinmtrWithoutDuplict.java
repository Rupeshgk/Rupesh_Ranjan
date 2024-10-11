package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptinmtrWithoutDuplict {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Hp/Desktop/mtr.html");
	WebElement mtrlistbox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrlistbox);
	List<WebElement> allOpt = s.getOptions();
	int count=allOpt.size();
	System.out.println(count);
	HashSet<String> hs=new HashSet<String>();
	for(int i=0;i<count;i++)
	{
		String text=allOpt.get(i).getText();
		hs.add(text);
		System.out.println(hs);
	}
		driver.quit();
	
	
}
}
