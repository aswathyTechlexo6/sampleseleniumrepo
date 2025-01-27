package browsersample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsProgram extends BaseClass {
	
	public void simpleFormPage()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> inputfield=driver.findElements(By.xpath("//input[@type='text']"));//common xpath for 3 fields
		for(WebElement element:inputfield)
		{
			element.sendKeys("Hello");//if it is a checkbox, use click method
		}
	}
	
////input[@type='checkbox']--multiple checkbox assignment
	public static void main(String[] args) {
		FindElementsProgram elmnt=new FindElementsProgram();
		elmnt.initializebrowser();
		elmnt.simpleFormPage();
	}

}
