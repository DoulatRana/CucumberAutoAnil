package com.basic.stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;



public class TableGrid {
	
	WebDriver driver;
	
	@Then("^closes the browser$")
	public void closes_the_browser() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathcg\\Downloads\\Selenium\\SeleniumJarAndDrivers - DONOTDELETE\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@title='IPL 2018 schedule']")).click();
		driver.findElement(By.linkText("Kolkata Knight Riders won by 6 wkts")).click();
		driver.findElement(By.linkText("Scorecard")).click();
	    WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	    //int rowCount= table.findElements(By.cssSelector("div.cb-col cb-col-100 cb-scrd-itms")).size();
	    int runCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	    Integer totalScore=0;
	   for(int i=0;i<runCount-2;i++){
		   
		   	    totalScore += Integer.parseInt(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		   	    System.out.println(totalScore);
		   	
		   	    
	    }
	   
	   /*String s = valueOf(totalScore));
	   Assert.assertEquals(165, valueOf(totalScore);*/
	   System.out.println(totalScore);
	   driver.close();
	}
}
