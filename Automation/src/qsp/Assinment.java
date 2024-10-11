package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assinment {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.cricbuzz.com/live-cricket-scores/82836/gg-vs-adkr-16th-match-international-league-t20-2024");
	List<WebElement> allplayer = driver.findElements(By.xpath("//span[contains(text(),'Innings')])[1]/../../div/div[1]/a"));
	List<WebElement> allrun = driver.findElements(By.xpath("//span[contains(text(),Inning')])/../../div/div[1]/a/../../div[3]"));
	for(int i=0;i<allplayer.size();i++)
	{
		String player= allplayer.get(i).getText();
		String runs= allrun.get(i).getText();
		System.out.println("The run scored by"+player+":"+runs);
	}
}
}
