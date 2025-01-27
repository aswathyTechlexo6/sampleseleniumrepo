package browsersample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends BaseClass {
	
	public void javaScriptAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMeBtn=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMeBtn.click();
		//Alert inspect 
		driver.switchTo().alert().accept();//to click OK Button inside alert
		WebElement clickMeBtn1=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMeBtn1.click();
		driver.switchTo().alert().dismiss();//to click on Cancel Button
		WebElement promptBox=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		promptBox.click();
		driver.switchTo().alert().sendKeys("Aswathy");//to pass message
		driver.switchTo().alert().accept();
		//we can use IsDisplayed to check whether an alert is displayed
	}

	public static void main(String[] args) {
		AlertHandling alert=new AlertHandling();
		alert.initializebrowser();
		alert.javaScriptAlert();

	}

}
