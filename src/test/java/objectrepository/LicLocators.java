package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.licindia.baseclass.BaseClass;

public class LicLocators {
	public LicLocators() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(xpath = "//span[text()=' Products']")
	private WebElement products;
	
	@FindBy(xpath = "//a[text()='Insurance Plans']")
	private WebElement insuranceplans;
	
	@FindBy(xpath = "//a[text()='Whole Life Plans']")
	private WebElement wholelifeplans;
	
	@FindBy(xpath = "//table/thead//following-sibling::tbody//tr/td//following-sibling::td/a[@href='/en/web/guest/lic-sjeevanumang-745%09512n312v03']")
	private WebElement jeevanumang;
	
	@FindBy(xpath = "//a[@href='/documents/20121/1240315/Policy_doc_Jeevan_Umang_290924-withlogo.pdf/5f44c0f9-821e-0a98-afb6-51b343ae71e9?t=1727867404715']")
	private WebElement policydocument;
	
	@FindBy(xpath = "//a[@href='/en/web/guest/lic-s-jeevan-utsav2']")
	private WebElement jeevanutsav;
	
	@FindBy(xpath = "//a[@href='/documents/20121/1248984/102268-+Jeevan+Utsav+Sales+Brochure_WEB+PDF.pdf/077eba57-b22a-a01a-b4e0-b3d1f565e298?t=1728377714383']")
	private WebElement brochure;
	
	@FindBy(xpath = "//a[text()=' Pay Premium ']")
	private WebElement paypremium;
	
	@FindBy(xpath = "//div[text()='View/Download Receipt']")
	private WebElement download;
	 
	@FindBy(id = "da_datefield-1118-trigger-picker")
	private WebElement datePicker;
	
	@FindBy(xpath = "//div[text()='19']")
	private WebElement date;
	
	@FindBy(name = "transactionType")
	private WebElement type;
	
	@FindBy(xpath = "//li[text()='Renewal Premium/ Revival']")
	private WebElement renewal;
	
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement submit;
	
	@FindBy(name = "policyNumber")
	private WebElement policy;
	
	@FindBy(xpath = "//span[text()=' Customer Services']")
	private WebElement customerservices;
	
	@FindBy(xpath = "//a[text()='Update Your Contact details – Offline']")
	private WebElement update;
	
	@FindBy(xpath = "//a[text()=' Update Your Contact details – Offline ']")
	private WebElement pdf;

	public WebElement getCustomerservices() {
		return customerservices;
	}

	public WebElement getUpdate() {
		return update;
	}

	public WebElement getPdf() {
		return pdf;
	}

	public WebElement getPolicy() {
		return policy;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getInsuranceplans() {
		return insuranceplans;
	}

	public WebElement getWholelifeplans() {
		return wholelifeplans;
	}

	public WebElement getJeevanumang() {
		return jeevanumang;
	}

	public WebElement getPolicydocument() {
		return policydocument;
	}

	public WebElement getJeevanutsav() {
		return jeevanutsav;
	}

	public WebElement getBrochure() {
		return brochure;
	}

	public WebElement getPaypremium() {
		return paypremium;
	}

	public WebElement getDownload() {
		return download;
	}

	public WebElement getDatePicker() {
		return datePicker;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getRenewal() {
		return renewal;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	

}
