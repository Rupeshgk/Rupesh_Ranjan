package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/91551/gt-vs-rcb-45th-match-indian-premier-league-2024");
	List<WebElement> allplayerlist=driver.findElements(By.xpath("//span[.='Royal Challengers Bengaluru Innings']/../..//a[@class='cb-text-link']"));
	List<WebElement> allrunlist=driver.findElements(By.xpath("//span[.='Royal Challengers Bengaluru Innings']/../../div/div[1]/a/../../div[3]"));
	for(int i=0;i<allplayerlist.size();i++)
	{
	String playerlist=allplayerlist.get(i).getText();
	String playerrunlist=allrunlist.get(i).getText();
	System.out.println("playernames:"+playerlist+"scored:"+playerrunlist+"runs");
	}
	
}
}

