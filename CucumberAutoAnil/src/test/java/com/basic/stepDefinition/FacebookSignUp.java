package com.basic.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSignUp {
	
	WebDriver driver;
	
	@Given("^User need to be on facbook login page$")
	public void user_need_to_be_on_facbook_login_page() throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sharathcg\\Downloads\\Selenium\\SeleniumJarAndDrivers - DONOTDELETE\\MicrosoftWebDriver.exe");
	driver = new EdgeDriver();
	driver.get("http://www.qaclickacademy.com/interview.php");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//li[@id='tablist1-tab2']/following-sibling::li[1]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//li[@id='tablist1-tab3']/following-sibling::li[1]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//li[@id='tablist1-tab3']/preceding-sibling::li[@id='tablist1-tab2']")).click();
	System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
	driver.findElement(By.xpath("//*[contains(text(),' Selenium ')]")).click();
    driver.get("https://www.facebook.com/r.php");
	
	}

	@When("^user enters their \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void user_enters_their(String fn, String ln, String email) throws Throwable {
		
	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fn);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(ln);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
			
	}
	@Then("^user sets a \"([^\"]*)\"$")
	public void user_sets_a(String pwd) throws Throwable {
	  driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pwd);
	  	  	  
	}

	@Then("^user enters a \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" of their birth$")
	public void user_enters_a_and_of_their_birth(String day, String month, String year) throws Throwable {
		new Select(driver.findElement(By.name("birthday_day"))).selectByValue(day);
		WebElement birthMonth = new Select(driver.findElement(By.name("birthday_month"))).getFirstSelectedOption();
		if(birthMonth.getText().equals("Apr")){
				new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText(month);
		}
		WebElement birthYear = new Select(driver.findElement(By.name("birthday_year"))).getFirstSelectedOption();
		if(birthYear.getText().equals("1993")){
			new Select(driver.findElement(By.name("birthday_year"))).selectByValue(year);
		}
		driver.get("https://www.google.com/");
		//parent to child
		  driver.findElement(By.xpath("//div[@class='gstl_0 sbib_a']/div[2]/div/input")).sendKeys("hello", Keys.RETURN);
		driver.close();
	}

	

	

}
