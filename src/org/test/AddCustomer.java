package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer {
	WebDriver driver;
	 @Given("^The user is in guru homepage$")
	 public void the_user_is_in_guru_homepage() {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABANA\\Desktop\\ProjectWorkspace\\JavaCucuProject\\drivers\\chromedriver.exe");
		     driver=new ChromeDriver();
		     driver.get("http://demo.guru99.com/v4/");
		}
	@Given("^The user logged in as manager \"([^\"]*)\"and\"([^\"]*)\"$")
	public void the_user_logged_in_as_manager_and(String managerId, String managerPass) {
		driver.findElement(By.name("uid")).sendKeys(managerId);
		driver.findElement(By.name("password")).sendKeys(managerPass);
		driver.findElement(By.name("btnLogin")).click();
	}

	@Given("^The user navigate to new customer page$")
	public void the_user_navigate_to_new_customer_page() {
	    driver.findElement(By.xpath("//a[text()='New Customer']")).click();   
	}

	@When("^The user enters the customer details\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void the_user_enters_the_customer_details_and(String name, String gender, String dob, String address, String city, String state, String pin, String phone, String email, String pass) {
		driver.findElement(By.name("name")).sendKeys(name);
		/*if(this.gender="male")
		{
			driver.findElement(By.xpath("//input[@name='rad1' and @value='m']")).click();	
		}else*/
		driver.findElement(By.xpath("//input[@name='rad1' and @value='f']")).click(); 
		//driver.findElement(By.name("uid")).sendKeys(dob);
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("pinno")).sendKeys(pin);
		driver.findElement(By.name("telephoneno")).sendKeys(phone);
		driver.findElement(By.name("emailid")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

	@When("^The user submits the form$")
	public void the_user_submits_the_form() {
	   driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

	@Then("^The user should see success page$")
	public void the_user_should_see_success_page() {
		String output=driver.findElement(By.xpath("//p[text()='Customer Registered Successfully!!!']")).getText();
		Assert.assertEquals("Customer Registered Successfully!!!",output);
	}
		}
	
	



