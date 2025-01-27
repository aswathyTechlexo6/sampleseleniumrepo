package browsersample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableExampleProgram extends BaseClass{
	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void tablerow()
	{

		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println(tableRow.getText());
	}
	public void tableRowdata()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableRowdata=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[1]"));
		System.out.println(tableRowdata.getText());
	}
	public void tableColumns()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tblCols=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		System.out.println(tblCols.getText());
			
	}
	public void search()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Javascript Developer";
		List<WebElement> serchCol=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		
		for(WebElement element:serchCol)
		{
			if(element.getText().equals(input))
			{
				System.out.println(element.getText());
			}
				
		}
		
	}

	public static void main(String[] args) {
		TableExampleProgram tbl=new TableExampleProgram();
		tbl.initializebrowser();
		//tbl.fullTable();
		//tbl.tablerow();
		//tbl.tableRowdata();
		//tbl.tableColumns();
		tbl.search();
	}
	
	

}
