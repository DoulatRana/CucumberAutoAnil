package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Then;

public class InternetExplorer {
	public WebDriver driver;
	
	@Then("^user selects male$")
	public void user_selects_male() throws Throwable {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\sharathcg\\Downloads\\Selenium\\SeleniumJarAndDrivers - DONOTDELETE\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		try{
			if( driver.findElement(By.xpath(".//*[@id='u_0_9']")).isDisplayed()){
				driver.findElement(By.xpath(".//*[@id='u_0_9']")).click();
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys("lala");
				
			}
			}
			catch(Exception e){
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				//"document.getElementsByTagName(\\\"Log In to Existing Account\\\");";
			
					WebElement element = driver.findElement(By.xpath(".//*[@id='u_0_9']"));
					//((JavascriptExecutor) driver).executeScript("arguments[0].click()", )
					js.executeScript("attributes[0].click()",element);
					System.out.println("is not displayed");
			}
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Lala");
			driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
			
			driver.get("https://www.icicibank.com/");
			try{
				if(driver.findElement(By.xpath("//div[contains(text(),'Later')]")).isDisplayed()){
			driver.findElement(By.xpath("//div[contains(text(),'Later')]")).click();
				}else
					driver.findElement(By.xpath("//a[@class='closeVisit']")).click();
			}
			catch(Exception e){
			System.out.println("nothing clicked");
			}
			driver.get("https://www.ksrtc.in");
			driver.findElement(By.name("fromPlaceName")).sendKeys("BENG");
			driver.findElement(By.name("fromPlaceName")).sendKeys(Keys.DOWN);
			driver.findElement(By.name("fromPlaceName")).sendKeys(Keys.DOWN);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			String script = "return document.getElementById(\"fromPlaceName\").value;";
			String text = (String)js.executeScript(script);
			int i=0;
			System.out.println(script);
			while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")){
				driver.findElement(By.name("fromPlaceName")).sendKeys(Keys.DOWN);
				text = (String)js.executeScript(script);
				System.out.println(text);
				
				i++;
				if(i>10){
					System.out.println("Element not found");
					break;
				}};
			
			driver.findElement(By.cssSelector("input#toPlaceName")).sendKeys("MYS");
			driver.findElement(By.cssSelector("#toPlaceName")).sendKeys(Keys.DOWN);
		script ="return document.getElementById(\"toPlaceName\").value;";
		text =(String)js.executeScript(script);
			while(!text.equalsIgnoreCase("MYSORE PALACE")){
				driver.findElement(By.cssSelector("#toPlaceName")).sendKeys(Keys.DOWN);
				text=(String)js.executeScript(script);
			}
			
	
			driver.close();
	}
}
