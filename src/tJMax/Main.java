package tJMax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/alidurhan/Documents/Selenium/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=Z74QQiSpFfM&list=RD-N_NCiy5xyo&index=27");
	}

}
