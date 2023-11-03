package stepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	public ChromeDriver driver;

	@Given("lauch browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Given("enter url")
	public void getURL() {
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Given("enter user name as {string}") // string should be in small letter
	public void enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);

	}

	@Given("enter password as {string}")
	public void enterPassword(String pswd) {
		driver.findElement(By.id("password")).sendKeys(pswd);

	}

	@When("click login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.getTitle();

	}

	@When("verify welcome page")
	public void welcomePage() {
		
		driver.getTitle();

	}

	@But("verify error message")
	public void errorPage() {
		driver.getTitle();
		String errorText = driver
				.findElement(By.xpath("//p[text()='following error occurred during login: User not found.']"))
				.getText();
		System.out.println(errorText);

	}

	@When("click on {string}")
	public void click_on_link(String link) {
		driver.findElement(By.linkText(link)).click();

	}

	@When("enter company name as {string}")
	public void enter_company_name(String cname1) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname1);
	}

	@When("enter first name as {string}")
	public void enter_first_name(String fname1) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname1);
	}

	@When("enter last name as {string}")
	public void enter_last_name(String lname1) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname1);
	}

	@When("enter phone number as {string}")
	public void enter_phone_number(String pnum1) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum1);
	}

	@Then("click submitbutton")
	public void click_submitbutton() {
		driver.findElement(By.name("submitButton")).click();
	}

}
