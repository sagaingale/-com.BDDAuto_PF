package com.stepdefs;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageFactory.RegistrationPage_PF;

public class RegistrationPageStepdef_PF {

	RegistrationPage_PF rg;
	WebDriver driver;
	
	@Before
	public void openDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver103.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
	
	




	@Given("^User on registration page$")
	public void user_on_registration_page()  {
	
		
		driver.get("http://demo.automationtesting.in/Register.html");
	
	
	    
	}

	@Then("^User type first name \"([^\"]*)\" and last name \"([^\"]*)\"$")
	public void user_type_first_name_and_last_name(String fisrtName, String lastName)  {
	rg = new RegistrationPage_PF(driver);
	rg.enterFirstName(fisrtName);
	rg.enterLastName(lastName);
	}

	@Then("^User type Address \"([^\"]*)\" and EmailID \"([^\"]*)\" and MobileNo \"([^\"]*)\"$")
	public void user_type_Address_and_EmailID_and_MobileNo(String address, String email, String mobile)  {
		rg = new RegistrationPage_PF(driver);

		rg.enterAddress(address);
	    rg.enterEmailID(email);
	    rg.enterMobileNO(mobile);
	}

	@Then("^User select Gender \"([^\"]*)\" and Hobby \"([^\"]*)\"$")
	public void user_select_Gender_and_Hobby(String gender, List<String> hobby)  {
		rg = new RegistrationPage_PF(driver);

		rg.selectGender(gender);
		rg.selectHobby(hobby);
	}

	@Then("^User select Language \"([^\"]*)\"$")
	public void user_select_Language(List<String> input)  {
		rg = new RegistrationPage_PF(driver);

		rg.selectLanguage(input);
	}

	@Then("^User select Skill \"([^\"]*)\"$")
	public void user_select_Skill(String skill)  {
		rg = new RegistrationPage_PF(driver);

		rg.selectSkill(skill);    
	}

	@Then("^User select Country \"([^\"]*)\"$")
	public void user_select_Country(String input)  {
		rg = new RegistrationPage_PF(driver);

		rg.selectCountry(input);
	}

	@Then("^User select date of birth \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_date_of_birth_and_and(String year, String month, String day)  {
		rg = new RegistrationPage_PF(driver);

		rg.selectDOB(year);
	rg.selectDOB(month);
	rg.selectDOB(day);
	}

	@Then("^User enter the password \"([^\"]*)\"$")
	public void user_enter_the_password(String input)  {
		rg = new RegistrationPage_PF(driver);

		rg.enterPassword(input);
	}

	@Then("^User enter the confirmation password \"([^\"]*)\"$")
	public void user_enter_the_confirmation_password(String input)  {
		rg = new RegistrationPage_PF(driver);

		rg.enterConpass(input);    
	}

	@Then("^User click on submit button$")
	public void user_click_on_submit_button()  {
		rg = new RegistrationPage_PF(driver);

		rg.clickOnSubmit();
	}


}
