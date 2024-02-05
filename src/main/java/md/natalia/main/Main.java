package md.natalia.main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static void main(String[] args) {
		
		ChromeDriver driverChrome = new ChromeDriver();
		
		/** Open darwin.md */
		//driverChrome.get("https://darwin.md/");
		//driverChrome.manage().window().maximize();
		
		/** Find elements by css selector */
		//driverChrome.findElement(By.cssSelector("body > div.container > div.fixed-top-header > div > header > div.form-wrapper.mainmenu.w-100.rounded-0.d-flex.align-items-center > a")).click();
		//driverChrome.findElement(By.cssSelector("#main > section.blogs > div > div > div:nth-child(6) > div > a > img")).click();
		//driverChrome.findElement(By.cssSelector("body > div.container > div.fixed-top-header > div > header > div.form-wrapper.mainmenu.w-100.rounded-0.d-flex.align-items-center > a")).click();
		//driverChrome.findElement(By.cssSelector("#main > section.blogs > div > div > div:nth-child(7) > div > a > img")).click();
		
		/** Find elements by ID Locator */
		
		driverChrome.get("https://www.enter.online/");
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.id("search")).click();
        driverChrome.findElement(By.id("search")).sendKeys("aparat");
		driverChrome.findElement(By.cssSelector("#search-icon > svg")).click();
		
		
		/** Find elements by Class Name Locator */
		
		driverChrome.findElement(By.className("block-header")).click();
		driverChrome.findElement(By.className("content")).click();
		driverChrome.findElement(By.className("footer")).click();
		
        
		
	}

}
