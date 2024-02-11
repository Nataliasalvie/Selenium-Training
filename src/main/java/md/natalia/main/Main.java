package md.natalia.main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static void main(String[] args) {
		
		//ChromeDriver driverChrome = new ChromeDriver();
		
		/** Open darwin.md */
		//driverChrome.get("https://darwin.md/");
		//driverChrome.manage().window().maximize();
		
		/** Find elements by css selector */
		//driverChrome.findElement(By.cssSelector("body > div.container > div.fixed-top-header > div > header > div.form-wrapper.mainmenu.w-100.rounded-0.d-flex.align-items-center > a")).click();
		//driverChrome.findElement(By.cssSelector("#main > section.blogs > div > div > div:nth-child(6) > div > a > img")).click();
		//driverChrome.findElement(By.cssSelector("body > div.container > div.fixed-top-header > div > header > div.form-wrapper.mainmenu.w-100.rounded-0.d-flex.align-items-center > a")).click();
		//driverChrome.findElement(By.cssSelector("#main > section.blogs > div > div > div:nth-child(7) > div > a > img")).click();
		
		/** Find elements by ID Locator */
		
		//driverChrome.get("https://www.enter.online/");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.id("search")).click();
       // driverChrome.findElement(By.id("search")).sendKeys("aparat");
		//driverChrome.findElement(By.cssSelector("#search-icon > svg")).click();
		
		
		/** Find elements by Class Name Locator */
		
		//driverChrome.findElement(By.className("block-header")).click();
		//driverChrome.findElement(By.className("content")).click();
		//driverChrome.findElement(By.className("footer")).click();
		
		
		//XPath 
		//TagName[@atribute='value']
		//driverChrome.get("https://www.samsung.com/uk/");
		//driverChrome.manage().window().maximize();
				//driverChrome.findElement(By.xpath("//*[@id=\"truste-consent-button\"]")).click();
				//driverChrome.findElement(By.xpath("//*[@id=\"component-id\"]/div[1]/div[5]/ul[1]/li[6]/button")).click();
				//driverChrome.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div[5]/ul[1]/li[6]/div/div[1]/ul/li[3]/a")).click();
				
		//XPath Relativ	
		
		//driverChrome.get("https://apple.com");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.xpath("//span[@Class='globalnav-link-text-container']")).click();
				
		//XPath Absolute
		
		//driverChrome.get("https://apple.com");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.xpath("/html/body/div/nav/div/ul/li/div/div/div/ul/li/a/span")).click();		
		
		//XPath starts-with
		//formula: tagName[starts-with(@atribute,'value')]
		
		//driverChrome.get("https://www.lamborghini.com/en-en");
		//driverChrome.manage().window().maximize();
	    //driverChrome.findElement(By.xpath("//li[starts-with(@id,'lev')]")).click();
	    
		
	    
		//XPath ends-with trebuie de corectat
	    //formula: tagName[ends-with(@atribute,'value')]
	    //driverChrome.get("https://www.lamborghini.com/en-en");
		//driverChrome.manage().window().maximize();
		
	    //driverChrome.findElement(By.xpath("//li[ends-with(@id,'-1-0')]")).click();
	    
	    
	    //XPath contains-with
	    //formula: tagName[ends-with(@atribute,'value')]
	    //driverChrome.get("https://www.lamborghini.com/en-en");
		//driverChrome.manage().window().maximize();
		//diver  id
	    //driverChrome.findElement(By.xpath("//li[contains-with(@id,'-1-0')]")).click();	
		
		//XPath text
		
		
		//formula: tagName[starts-with(@atribute,'value')]
		
		//driverChrome.get("https://www.lamborghini.com/en-en");
		//driverChrome.manage().window().maximize();
	    //driverChrome.findElement(By.xpath("//li[starts-with(@id,'lev')]")).click();
	    
		//XPATH  text()
//		//tagname[text()='actual text']
		
		//driverChrome.get("www.darwin.md");
	    //driverChrome.manage().window().maximize();
	    //driverChrome.findElement(By.xpath("[//span[text()='toate categoriile']")).click();
		
		
	 // XPath AND comulativ
	 	// XPATH=//tagname[@Attribute=’Value’ and @Attribute=’Value’]
	    
	    
	    
	 // XPath OR 
	 		// XPATH=//tagname[@Attribute=’Value’ or @Attribute=’Value’] (edited) 
		//driverChrome.get("https://www.darwin.md");
 		//driverChrome.manage().window().maximize();
 		//driverChrome.findElement(By.xpath("//img[@alt='Ceasuri și brățări' and @width='104']")).click();
    
		
	    
	 // XPATH=//tagname[@Attribute=’Value’ or @Attribute=’Value’]
		
	 		
	 		//driverChrome.get("https://www.darwin.md");
	 		//driverChrome.manage().window().maximize();
	 		//driverChrome.findElement(By.xpath("//img[@alt='Ceasuri și brățări' or @width='104']")).click();
	    
		//8.02.2024
		//Css selector Id
		//tagName[AttributeName=’AttributeValue’] 
		
		
		//ChromeDriver driverChrome = new ChromeDriver();
		//driverChrome.get("https://www.lamborghini.com/en-en");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		
		
		//tagName#elementID
		//ChromeDriver driverChrome = new ChromeDriver();
		//driverChrome.get("https://www.lamborghini.com/en-en");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).click();
		
		
		//#elementID
		
		//ChromeDriver driverChrome = new ChromeDriver();
		//driverChrome.get("https://www.lamborghini.com/en-en");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
				
		
		//Css Class
		//tagName.Attribute_Value (valoarea clasei)
		
		//ChromeDriver driverChrome = new ChromeDriver();
		//driverChrome.get("https://www.olx.ro/");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		//driverChrome.findElement(By.cssSelector("a.css-1gpccxq")).click();
		
		
		
		//Css alte atribute
		//tagName[AttributeName=’AttributeValue’] formula generala
				
	    //ChromeDriver driverChrome = new ChromeDriver();
	    //driverChrome.get("https://www.olx.ro/");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		//driverChrome.findElement(By.cssSelector("input[data-testid='search-input']")).click();
		
		//exercitiu
		
		//ChromeDriver driverChrome = new ChromeDriver();
	    //driverChrome.get("https://www.olx.ro/");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		//driverChrome.findElement(By.cssSelector("input[data-testid='search-input']")).sendKeys("cosmetica");
		
		
		//tagName[AttributeName=’AttributeValue’][ AttributeName=’AttributeValue’]
		
				
				//ChromeDriver driverChrome = new ChromeDriver();
	    //driverChrome.get("https://www.olx.ro/");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		//driverChrome.findElement(By.cssSelector("input[data-cy='search-bar-input'][placeholder='Ce anume cauți?']")).click();
		
		//Dupa prefix, dupa sufix]
				//input[name^=’fixed_d’]
		
		//ChromeDriver driverChrome = new ChromeDriver();
	    //driverChrome.get("https://www.olx.ro/");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		//driverChrome.findElement(By.cssSelector("input[data-cy^='search-']")).click();
		
		//dupa suffix]
		//suffix tagname[name$=’d_fixed’]
		
		//ChromeDriver driverChrome = new ChromeDriver();
	    //driverChrome.get("https://www.olx.ro/");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		//driverChrome.findElement(By.cssSelector("input[data-cy$='-input']")).click();
		
		//css matching substring 
		
		//ChromeDriver driverChrome = new ChromeDriver();
	    //driverChrome.get("https://www.olx.ro/");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		//driverChrome.findElement(By.cssSelector("input[data-cy*='-bar-']")).click()
		
		//Dupa copil
		
		//ChromeDriver driverChrome = new ChromeDriver();
	    //driverChrome.get("https://www.olx.ro/");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		//driverChrome.findElement(By.cssSelector("div[class='css-1rwzo2t']>a[class='css-1gpccxq']")).click();
		
		//
		
		//ChromeDriver driverChrome = new ChromeDriver();
	    //driverChrome.get("https://www.olx.ro/");
		//driverChrome.manage().window().maximize();
		//driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		//driverChrome.findElement(By.cssSelector("div[class='css-1rwzo2t']>a[class='css-1gpccxq']")).click();
		
		
		
	    
	  //Tema pentru acasa Locator CSS
		
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.olx.ro/");
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		
			//1 ID, 
			//2 Class,
			//4 Other attribute, 
			//1 format din doua atribute, 
			//1 prefix substring, 
			//1 matching substring, 
			//1 direct child, 
			//1 next sibling
		
		
	}
	

}
