package browsersample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectInputPage extends BaseClass {
	
	public void selectInput()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selctColor=driver.findElement(By.id("single-input-field"));
		Select select=new Select(selctColor);
		//select.selectByIndex(2);
		//select.selectByVisibleText("Red");
		select.selectByValue("Green");
		
	}

	public static void main(String[] args) {
		SelectInputPage inpt=new SelectInputPage();
		inpt.initializebrowser();
		inpt.selectInput();

	}

}
