package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BasicMethod;




public class RegistrationPage_PF  {
	
	WebDriver driver;
	public RegistrationPage_PF(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy( xpath="//input[@placeholder='First Name']")
	public WebElement FirstName;
	@FindBy (xpath="//input[@placeholder='Last Name']")
	public	 WebElement LastName;
	@FindBy (xpath="//textarea[@ng-model='Adress']")    public WebElement Address;
	@FindBy (xpath="//input[@type='email']")			public WebElement Email;
	@FindBy (xpath="//input[@type='tel']")				 public WebElement MobileNo;
	@FindBy (xpath="//input[@type='radio']")			public List<WebElement> Gender;
	@FindBy (xpath="//input[@type='checkbox']")			public List<WebElement> Hobby;
	@FindBy (id = "msdd")                               public WebElement Language;
	@FindBy (xpath = "//a[@class='ui-corner-all']")    public  List<WebElement> Lang;
	@FindBy (id="Skills")							public	 WebElement Skill;
	@FindBy (id="country")							public	 WebElement Country;
	@FindBy (id="yearbox")							public	 WebElement Year;
	@FindBy (xpath="//select[@placeholder='Month']")	public WebElement Month;
	@FindBy (id="daybox")								public WebElement Date;
	@FindBy (id="firstpassword")					public	 WebElement Password;
	@FindBy (id="secondpassword")						public WebElement Conpass;
	@FindBy (id="submitbtn")							public WebElement Submit;
	
	BasicMethod bm = new BasicMethod();
	
	public void enterFirstName(String firstName) {
		FirstName.sendKeys(firstName);
	} 
	public void enterLastName(String lastName) {
		LastName.sendKeys(lastName);
	}
	public void enterAddress(String address) {
		Address.sendKeys(address);
	}
	public void enterEmailID(String emailID) {
		Email.sendKeys(emailID);
	}
	public void enterMobileNO(String mobileNO) {
		MobileNo.sendKeys(mobileNO);
	}
	public void selectGender(String gender) {
		bm.radioType(Gender, gender);
	}
	public void selectHobby(List<String> hobby) {
		bm.checkBox(Hobby, hobby);
	}
	public void selectLanguage(List<String> lang) {
		Language.click();
		bm.selectLanguage(Lang, lang);
	}
	public void selectSkill(String skill) {
		bm.selectSelect(Skill, skill);
	}
	public void selectCountry(String country) {
		bm.selectSelect(Country, country);
		
	}
	public void selectDOB(String input) {
		bm.selectSelect(Year, input);
		bm.selectSelect(Month, input);
		bm.selectSelect(Date, input);
		
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	public void enterConpass(String conpass) {
		Conpass.sendKeys(conpass);
	}
	public void clickOnSubmit() {
		Submit.click();
	}
}
