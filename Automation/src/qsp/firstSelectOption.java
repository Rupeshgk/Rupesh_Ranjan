package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstSelectOption {
public static void main(String[] args) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	// enter the url
	driver.get("file:///C:/Users/Hp/Desktop/mtr.html");
	//find slv list
	WebElement slvList=driver.findElement(By.id("slv"));
	Select s=new Select(slvList);
	WebElement firstopt=s.getFirstSelectedOption();
	String text=firstopt.getText();
	System.out.println(text);
	driver.close();
	
}
}
