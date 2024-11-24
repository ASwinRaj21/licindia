package in.licindia.baseclass;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IBaseClass {
	public static WebDriver driver;
	public static Actions action;
	public static WebDriverWait wait;

	@Override
	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--disable-popups");
		option.addArguments("--disable-notifications");
		
		driver = new EdgeDriver(option);
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	@Override
	public void launchApplication(String url) {
		driver.get(url);
		
	}

	@Override
	public String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}


	@Override
	public void sendText(WebElement ele, String input) {
		ele.sendKeys(input);
		
	}

	@Override
	public void button(WebElement ele) {
		ele.click();
		
	}

	@Override
	public void waits(WebElement ele) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

	@Override
	public void browserClose() {
		//driver.close();
		
	}

	@Override
	public void mouseOver(WebElement ele) {
		action.moveToElement(ele).build().perform();
		
	}

	
		
	}


