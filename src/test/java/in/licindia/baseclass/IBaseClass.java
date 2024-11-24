package in.licindia.baseclass;

import org.openqa.selenium.WebElement;

public interface IBaseClass {
	public void browserLaunch();
	public void launchApplication(String url);
	public String currentUrl();
	public void mouseOver(WebElement ele);
	public void sendText(WebElement ele,String input);
	public void button(WebElement ele);
	public void waits(WebElement ele);
	public void browserClose();
	
	
}
