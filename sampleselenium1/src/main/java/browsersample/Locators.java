package browsersample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BaseClass {
	public void idLocator()
	{
		WebElement msgfield =driver.findElement(By.id("single-input-field"));
		WebElement totBtn =driver.findElement(By.id("button-two"));
		
	}
	public void nameLocator()
	{
		WebElement descriptn=driver.findElement(By.name("description"));
	}
	public void classNameLocator()
	{
		WebElement navbar=driver.findElement(By.className("navbar navbar-expand-md navbar-dark"));
		WebElement listgrp=driver.findElement(By.className("list-group list-group-flush"));
	}
	public void linkTextLocator()
	{
		WebElement simplform=driver.findElement(By.linkText("simple-form-demo.php"));
	}
	public void partialLinkTextLocator()
	{
		WebElement radioBtn = driver.findElement(By.partialLinkText("radio-button-"));
	}
	public void cssSelectors()
	{
		//tag#id
		WebElement msgfield1=driver.findElement(By.cssSelector("input#single-input-field"));
		//tag.class
		WebElement msgfield2=driver.findElement(By.cssSelector("ul.navbar-nav"));
		//tag[attribute=value]
		WebElement msgfield3=driver.findElement(By.cssSelector("input[id=single-input-field]"));
		//tag.class[attribute=value]
		WebElement msgfield4 = driver.findElement(By.cssSelector("div.my-2[id=message-one]"));
	}
	public void absoluteXpath()
	{
		
		WebElement msgfield5=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[2]"));
	}
	public void relativeXpath()
	{
		//tagname[@attribute='value']
		WebElement msgfield6=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	}
	public void dynamiccontains()
	{
		WebElement msgfield7=driver.findElement(By.xpath("//div[contains(@id,'message-one')]"));
		WebElement msgfield8=driver.findElement(By.xpath("//button[text()='Show Message']"));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
