package browsersample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxAndRadioButton extends BaseClass {
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement chkBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));//single checkbox
		chkBox.click();
		System.out.println(chkBox.isSelected());//to check whether checkbox is selected or not
	}
	
	public static void main(String[] args) {
		CheckBoxAndRadioButton btn=new CheckBoxAndRadioButton();
		btn.initializebrowser();
		btn.checkBox();

	}

}
