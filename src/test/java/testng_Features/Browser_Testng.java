package testng_Features;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.New_Maven_Project.Base_Class;

public class Browser_Testng extends Base_Class{
	 public static WebDriver driver;
     
	public static void main(String[] args) {
		
		
		driver=get_browser("chrome");

		
	}
	

}
