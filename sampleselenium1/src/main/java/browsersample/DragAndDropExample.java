package browsersample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample extends BaseClass {
	public void dragDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		//actions class to mouse over
		Actions actions=new Actions(driver);
		actions.moveToElement(drag).click();//moveToElement - Method to mouse over an element
		actions.doubleClick(drag).perform();//incase if needed to be double click
		//actions.contextClick(drag).perform();//to right click an element
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(drag, drop).build().perform();
		
	}
	
	public static void main(String[] args) {
		DragAndDropExample drgDrop = new DragAndDropExample();
		drgDrop.initializebrowser();
		drgDrop.dragDrop();

	}

}
