package browsersample;

public class BrowserCommands extends BaseClass {
	public void browsercommands()
	{
		String title=driver.getTitle();//to get the title of the web page
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);	
		
	}

	public static void main(String[] args) {
		
		BrowserCommands bcmnd=new BrowserCommands();
		bcmnd.initializebrowser();
		bcmnd.browsercommands();
		bcmnd.quitAndClose();
	}

}
