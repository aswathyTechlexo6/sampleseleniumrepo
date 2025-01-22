package browsersample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;//Global declaration, 
	
	public void initializebrowser()
	{
		driver=new ChromeDriver();//launch chrome
		driver.get("https://selenium.qabible.in/index.php");//launch URL
		driver.manage().window().maximize();//abstract methods within Webdriver Interface, maximize window
	}
	public void quitAndClose()
	{
		// to close all windows after launching URL
		driver.quit();//to close multiple windows,to close all windows after launching URL
		//driver.close();//To close only current window which is launched
	}


	public static void main(String[] args) {
		BaseClass obj=new BaseClass();
		obj.initializebrowser();
		obj.quitAndClose();

	}

}
