package browsersample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputClass extends BaseClass {
	
	public void inputMessageField()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgfield=driver.findElement(By.id("single-input-field"));
		System.out.println(msgfield.isEnabled());//field is enabled
		msgfield.sendKeys("Hello");//integer also we need to pass as string
		WebElement showmsgBtn=driver.findElement(By.id("button-one"));
		showmsgBtn.click();//SendKeys is an abstract method inside WebElement Interface
		System.out.println(showmsgBtn.isDisplayed());
		
	}
	//create another method to pass 2 integer value and sum
	public void twoInputFieldsAdd()
	{
		WebElement value1=driver.findElement(By.id("value-a"));
		value1.sendKeys("10");
		WebElement value2=driver.findElement(By.id("value-b"));
		value2.sendKeys("20");
		WebElement getTot=driver.findElement(By.id("button-two"));
		getTot.click();
		WebElement Msg=driver.findElement(By.xpath("//div[contains(@id,'message-two')]"));
		System.out.println(Msg.isDisplayed());
	}


	public static void main(String[] args) {
		
		InputClass inp=new InputClass();
		inp.initializebrowser();
		inp.inputMessageField();
		inp.twoInputFieldsAdd();
	}

}
