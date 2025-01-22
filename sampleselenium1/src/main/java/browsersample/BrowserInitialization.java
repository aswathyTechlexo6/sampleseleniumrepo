package browsersample;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class BrowserInitialization {
		
		public void initializebrowser()
		{
			WebDriver driver=new ChromeDriver();
			//WebDriver driver=new EdgeDriver();
			//WebDriver driver=new FirefoxDriver();
		}

		public static void main(String[] args) {
			
			BrowserInitialization obj=new BrowserInitialization();
			obj.initializebrowser();

		}

	}