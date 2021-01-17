package sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WebLinkFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Amita\\Downloads\\chromedriver_win32\\chromedriver.exe")	;
        
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://wikipedia.com");	
		WebElement dropdown= driver.findElement(By.name("language")) ;
		Select sel= new Select(dropdown);
		sel.selectByIndex(7);
System.out.println(sel.getFirstSelectedOption().getText());
	
	List <WebElement>	values=driver.findElements(By.tagName("option"));
	System.out.println("total values are"+values.size());
}
}