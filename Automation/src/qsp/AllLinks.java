package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the website name");
	String url = sc.next();
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	int count = allLinks.size();
	System.out.println(count);
	for(WebElement ele :allLinks)
	{
		String text = ele.getText();
		System.out.println(text);
	}
	
}
}
