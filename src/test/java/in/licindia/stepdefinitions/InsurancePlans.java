package in.licindia.stepdefinitions;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.github.dockerjava.api.model.Driver;

import in.licindia.baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LicLocators;

public class InsurancePlans extends BaseClass {
	//static WebDriver driver;
	//static Actions action;
	//static WebDriverWait wait;
	
	BaseClass base = new BaseClass();
	LicLocators locators = new LicLocators();
	
	@Given("Launch the LicIndia application {string}")
	public void launch_the_lic_india_application(String url) {
		try {
	    base.launchApplication(url);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@When("Validates the LicIndia application {string}")
	public void validates_the_lic_india_application(String url) {
		try {
		String currentUrl = base.currentUrl();
		System.out.println(currentUrl);
		if(currentUrl.equals(url)) {
			System.out.println("Application launched successfully");
		}
		else {
			System.out.println("Application not launched");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	   
	}
	
//------------------------------------------------------------------------------------------------>
	
	@When("User clicks the products")
	public void user_clicks_the_products() {
		try {
	    //WebElement products = driver.findElement(By.xpath("//span[text()=' Products']"));
	    base.mouseOver(locators.getProducts());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("Mouseover Insurance plans")
	public void mouseover_insurance_plans() {
		try {
		//WebElement insuranceplans = driver.findElement(By.xpath("//a[text()='Insurance Plans']"));
	    base.mouseOver(locators.getInsuranceplans());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("Mouseover and clicks wholelife plans")
	public void mouseover_and_clicks_wholelife_plans() {
		try {
	    //WebElement wholelifeplans = driver.findElement(By.xpath("//a[text()='Whole Life Plans']"));
	    base.button(locators.getWholelifeplans());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("User clicks LICs Jeevan Umang plan")
	public void user_clicks_li_cs_jeevan_umang_plan() {
		try {
	    //WebElement jeevanumang = driver.findElement(By.xpath("//table/thead//following-sibling::tbody//tr/td//following-sibling::td/a[@href='/en/web/guest/lic-sjeevanumang-745%09512n312v03']"));
	    base.button(locators.getJeevanumang());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("User selects Policy Document")
	public void user_selects_policy_document() {
		try {
	    //WebElement policydocument = driver.findElement(By.xpath("//a[@href='/documents/20121/1240315/Policy_doc_Jeevan_Umang_290924-withlogo.pdf/5f44c0f9-821e-0a98-afb6-51b343ae71e9?t=1727867404715']"));
	    base.button(locators.getPolicydocument());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	//------------------------------------------------------------------------------------------------>
	
	@When("User click the products")
	public void user_click_the_products() {
		try {
		//WebElement products = driver.findElement(By.xpath("//span[text()=' Products']"));
	    base.mouseOver(locators.getProducts());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("Mouseover to Insurance plans")
	public void mouseover_to_insurance_plans() {
		try {
		//WebElement insuranceplans = driver.findElement(By.xpath("//a[text()='Insurance Plans']"));
		base.mouseOver(locators.getInsuranceplans());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("Mouseover and click wholelife plans")
	public void mouseover_and_click_wholelife_plans() {
		try {
		//WebElement wholelifeplans = driver.findElement(By.xpath("//a[text()='Whole Life Plans']"));
	    base.button(locators.getWholelifeplans());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("User clicks LICs Jeevan Utsav plan")
	public void user_clicks_li_cs_jeevan_utsav_plan() {
		try {
	    //WebElement jeevanutsav = driver.findElement(By.xpath("//a[@href='/en/web/guest/lic-s-jeevan-utsav2']"));
	    base.button(locators.getJeevanutsav());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("User selects Sales brochures")
	public void user_selects_sales_brochures() {
		try {
	    //WebElement brochure = driver.findElement(By.xpath("//a[@href='/documents/20121/1248984/102268-+Jeevan+Utsav+Sales+Brochure_WEB+PDF.pdf/077eba57-b22a-a01a-b4e0-b3d1f565e298?t=1728377714383']"));
	    base.button(locators.getBrochure());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//------------------------------------------------------------------------------------------------>
	
	@When("User clicks pay premium")
	public void user_clicks_pay_premium() {
		try {
	    //WebElement paypremium = driver.findElement(By.xpath("//a[text()=' Pay Premium ']"));
	    base.button(locators.getPaypremium());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("User clicks view\\/download receipt")
	public void user_clicks_view_download_receipt() {
		try {
	    //WebElement download = driver.findElement(By.xpath("//div[text()='View/Download Receipt']"));
	    base.waits(locators.getDownload());
	    base.button(locators.getDownload());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("User enters Policynumber {string} Date of Transaction and Transaction type")
	public void user_enters_policynumber_date_of_transaction_and_transaction_type(String policynumber) {
		try {
	    //WebElement policy = driver.findElement(By.name("policyNumber"));
	    base.sendText(locators.getPolicy(), policynumber);
	    
	    //WebElement datePicker = driver.findElement(By.id("da_datefield-1118-trigger-picker"));
	    base.button(locators.getDatePicker());
	    //WebElement date = driver.findElement(By.xpath("//div[text()='19']"));
	    base.button(locators.getDate());
	    //WebElement type = driver.findElement(By.name("transactionType"));
	    base.button(locators.getType());
	    //WebElement renewal = driver.findElement(By.xpath("//li[text()='Renewal Premium/ Revival']"));
	    base.button(locators.getRenewal());}
		catch(Exception e) {
			e.printStackTrace();
		}
	    
	}

	@Then("User clicks submit button")
	public void user_clicks_submit_button() {
		try {
		//WebElement submit = driver.findElement(By.xpath("//span[text()='Submit']"));
	    base.button(locators.getSubmit());}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	//------------------------------------------------------------------------------------------------>
	
	@When("User clicks Customer Services")
	public void user_clicks_customer_services() {
		try {
	    base.mouseOver(locators.getCustomerservices());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("Mouseover to Update your contact details - offline")
	public void mouseover_to_update_your_contact_details_offline() {
		try {
	    base.waits(locators.getUpdate());
	    base.button(locators.getUpdate());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("User clicks update your contact details - offline form")
	public void user_clicks_update_your_contact_details_offline_form() {
		try {
	    base.button(locators.getPdf());}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
