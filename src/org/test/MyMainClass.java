package org.test;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyMainClass {
	 WebDriver driver;
	 @Given("^The user is in guru homepage$")
	 public void the_user_is_in_guru_homepage() {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABANA\\Desktop\\ProjectWorkspace\\JavaCucuProject\\drivers\\chromedriver.exe");
		     driver=new ChromeDriver();
		     driver.get("http://demo.guru99.com/v4/");
		}
	 
	@When("^The user enters userId and password$")
	public void the_user_enters_userId_and_password(DataTable Credentials) {
		//List<String> myList=Credentials.asList(String.class);
		//driver.findElement(By.name("uid")).sendKeys(myList.get(0));
		//driver.findElement(By.name("password")).sendKeys(myList.get(1));
		
		//Map<String,String> myMap=Credentials.asMap(String.class, String.class);
		//driver.findElement(By.name("uid")).sendKeys(myMap.get("username"));
		//driver.findElement(By.name("password")).sendKeys(myMap.get("password"));
		
	//List<List<String>> myList=Credentials.asLists(String.class);
	//driver.findElement(By.name("uid")).sendKeys(myList.get(3).get(0));
	//driver.findElement(By.name("password")).sendKeys(myList.get(3).get(1));
	
	List<Map<String,String>> myMap=Credentials.asMaps(String.class, String.class);
	driver.findElement(By.name("uid")).sendKeys(myMap.get(2).get("username"));
	driver.findElement(By.name("password")).sendKeys(myMap.get(2).get("password"));
	
	}
	
	@When("^The user click reset button$")
	public void the_user_click_reset_button() {
		driver.findElement(By.name("btnReset")).click();
	}

	@Then("^The user should see the fields empty$")
	public void the_user_should_see_the_fields_empty() {
		System.out.println("The fields are empty");
		
	}


}
