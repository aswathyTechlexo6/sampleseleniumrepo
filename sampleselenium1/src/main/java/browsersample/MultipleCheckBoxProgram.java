package browsersample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleCheckBoxProgram extends BaseClass {

	public void checkBoxSelect()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> chkElmnt=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement checkbox:chkElmnt)
		{
			checkbox.click();
		}
	}
	public static void main(String[] args) {
		MultipleCheckBoxProgram chckbox=new MultipleCheckBoxProgram();
		chckbox.initializebrowser();
		chckbox.checkBoxSelect();

	}

}
