package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Capstone.CucumberFrameWorkPractice8.ProtrainingtechPages8;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class JoinusForm {
	public WebDriver driver;
	@Before
	public void setup() throws InterruptedException {
		ProtrainingtechPages8 ob = new ProtrainingtechPages8(driver);
		String Path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Path +"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://protrainingtech.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		
	}
	@Given("^Already opened the protrainingtech\\.com website$")
	public void already_opened_the_protrainingtech_com_website() throws Throwable {
		String id = driver.getCurrentUrl();
		Assert.assertEquals(id, "https://protrainingtech.com/");
		Thread.sleep(6000);
	    
	
	    }

	@When("^user clicks contact link$")
	public void user_clicks_contact_link() throws Throwable {
		ProtrainingtechPages8 ob = new ProtrainingtechPages8(driver);
		ob.contactClick();
	    }

	@Then("^Join us form opens$")
	public void join_us_form_opens() throws Throwable {
		ProtrainingtechPages8 ob = new ProtrainingtechPages8(driver);
		ob.joinusClick();
	   }
	@When("^user enters the value of first name \"([^\"]*)\"$")
	public void user_enters_the_value_of_first_name(String arg1) throws Throwable {
		ProtrainingtechPages8 ob = new ProtrainingtechPages8(driver);
		ob.fname(arg1);
	    }

	@When("^user enters the value of last name \"([^\"]*)\"$")
	public void user_enters_the_value_of_last_name(String arg1) throws Throwable {
		ProtrainingtechPages8 ob = new ProtrainingtechPages8(driver);
		ob.lname(arg1);
	    }

	@When("^user enters the value of email \"([^\"]*)\"$")
	public void user_enters_the_value_of_email(String arg1) throws Throwable {
		ProtrainingtechPages8 ob = new ProtrainingtechPages8(driver);
		ob.email(arg1);
	    }

	@When("^user enters the value of phone \"([^\"]*)\"$")
	public void user_enters_the_value_of_phone(String name) throws Throwable {
		ProtrainingtechPages8 ob = new ProtrainingtechPages8(driver);
		ob.phonefield(name);
		Thread.sleep(6000);
	    }


	 @When("^user clicks the register button$")
	public void user_clicks_the_register_button() throws Throwable {
		 Thread.sleep(10000);
		 ProtrainingtechPages8 ob = new ProtrainingtechPages8(driver);
		 ob.registerbutton();
		 
	    }

	@Then("^user able to see confirmation message$")
	public void user_able_to_see_confirmation_message() throws Throwable {
		Thread.sleep(6000);
		ProtrainingtechPages8 ob = new ProtrainingtechPages8(driver);
		WebElement Confirm = ob.confiramtionText();
		String tx = Confirm.getText();
		System.out.println(tx);
		
	    }


}
