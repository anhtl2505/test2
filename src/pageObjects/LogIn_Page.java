 package pageObjects;

import org.openqa.selenium.*;

public class LogIn_Page {

        private static WebElement element = null;

    public static WebElement txtbx_EmailOrPhone(WebDriver driver){

         element = driver.findElement(By.id("identifierId"));

         return element;

         }
// ZFr60d
    public static WebElement Button_Next(WebDriver driver){

     element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span"));
      return element;

        }
    
 
     public static WebElement txtbx_Password(WebDriver driver){
    	element = driver.findElement(By.className("whsOnd"));
        return element;}    
     
     public static WebElement btn_LogIn(WebDriver driver){
element = driver.findElement(By.cssSelector("#passwordNext > content > span"));
         return element;
         }

}