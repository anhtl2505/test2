

package automationFramework;

    import java.util.concurrent.TimeUnit;

	import javax.print.attribute.standard.PrinterMessageFromOperator;
	import org.testng.Assert;
	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

//Import cac class de lay thuoc tinh 

     import pageObjects.Home_Page;

     import pageObjects.LogIn_Page;
     
     import pageObjects.SearchPage;
     

     // Cac phuong thuc de su dung thuoc tinh do
public class PageObjectModel  {

     private static WebDriver driver = null;

     public static void main(String[] args) throws InterruptedException {
    	  	 
    	 System.setProperty("webdriver.gecko.driver","C:\\Users\\anhtl\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
    	 System.setProperty("webdriver.chrome.driver","F:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
    	 
    	 WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Wait time

     driver.get("https://www.google.com");  // Navigate Google
     
     Home_Page.lnk_Signin(driver).click(); // Click Sign In
     
     
     LogIn_Page.txtbx_EmailOrPhone(driver).sendKeys("mindy.kenz@gmail.com"); // Fill textbox Email
     
     LogIn_Page.Button_Next(driver).click(); //Click Next
 		
     Thread.sleep(2000);
            
     LogIn_Page.txtbx_Password(driver).sendKeys("753869123"); // Fill pw
     
     LogIn_Page.btn_LogIn(driver).click(); // Click LogIn
          
     Thread.sleep(2000);
     
     SearchPage.Search_Input(driver).sendKeys("Eclipse"); // Fill keyword "Eclipse"
     
     Thread.sleep(1000);
     
     SearchPage.Button_Search(driver).sendKeys(Keys.ENTER);; //Enter

     Thread.sleep(2000);

     SearchPage.Hyperlink_Click1(driver).click(); // Click 1st link 
     // Check tiltle
     Assert.assertEquals("Enabling Open Innovation & Collaboration | The Eclipse Foundation", SearchPage.Verify_Tiltle(driver));    

     System.out.println("quá trình xong");

     driver.quit();

     }

}