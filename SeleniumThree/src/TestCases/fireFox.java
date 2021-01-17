package TestCases;

   //  import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.geckodriver","C:\\Users\\Amita\\geckodriver-v0.28.0-win64-2\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://facebook.com");
	
			
	}

}
