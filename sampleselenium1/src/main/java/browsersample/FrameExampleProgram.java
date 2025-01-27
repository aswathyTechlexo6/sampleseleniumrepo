package browsersample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameExampleProgram extends BaseClass {
	public void framesMethod()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frame);
		WebElement jMtr=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jMtr.click();
		////iframe[@id='a077aa5e']
		
		
	}

	public static void main(String[] args) {
		FrameExampleProgram frm=new FrameExampleProgram();
		frm.initializebrowser();
		frm.framesMethod();

	}

}
