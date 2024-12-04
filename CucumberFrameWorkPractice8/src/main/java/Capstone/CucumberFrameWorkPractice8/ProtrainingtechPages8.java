package Capstone.CucumberFrameWorkPractice8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProtrainingtechPages8 {
	WebDriver driver;
	@FindBy(linkText = "Contact") WebElement contactlink;
	@FindBy(xpath = "//*[text()='Join us !']") WebElement joinus;
	@FindBy(id = "form-field-name") WebElement fname;
	@FindBy(id = "form-field-field_6c5f814") WebElement lname;
	@FindBy(id = "form-field-email") WebElement email;
	@FindBy(id = "form-field-field_694d8a5") WebElement phonefield;
	@FindBy(xpath = "//*[text()='REGISTER']") WebElement register;
	@FindBy(xpath = "//*[text()='The form was sent successfully.']") WebElement confirmation;
	public ProtrainingtechPages8(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void contactClick() {
		contactlink.click();
	}
	public WebElement joinusClick() {
		return joinus;
	}
	public void fname(String name) {
		fname.sendKeys(name);
	}
	public void lname(String name) {
		lname.sendKeys(name);
	}
	public void email(String name) {
		email.sendKeys(name);
	}
	public void phonefield(String name) {
		phonefield.sendKeys(name);
	}
	public void registerbutton() {
		register.click();
	}
	public WebElement confiramtionText() {
		return confirmation;
		
		
		
	}

}
