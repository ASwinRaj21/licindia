package in.licindia.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import in.licindia.baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	BaseClass base = new BaseClass();
	
	@Before
	public void browserLaunch(Scenario scenario) {
		base.browserLaunch();
		
		final byte[] src = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(src,"img/png");
	}
	
//	@After
//	public void browserClose(Scenario scenario) {
//		final byte[] desc = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
//		scenario.embed(desc,"img/png");
//	}

}
