package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InslvPrintAllOpt {


public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Hp/Desktop/mtr.html");
	 WebElement slvListbox = driver.findElement(By.id("slv"));
	 Select s=new Select(slvListbox);
	 List<WebElement> allSelectOpt = s.getAllSelectedOptions();
	 int count=allSelectOpt.size();
	 System.out.println(count);
	 for(int i=0;i<count;i++)
	 {
		 String text=allSelectOpt.get(i).getText();
		 System.out.println(text);
		 
	 }
	 driver.close();
}
}
