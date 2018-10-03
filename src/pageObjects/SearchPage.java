//Chua cac thuoc tinh can thiet cho testcase
package pageObjects;


    import org.openqa.selenium.By;

    import org.openqa.selenium.WebDriver;

    import org.openqa.selenium.WebElement;

 public class SearchPage {

    private static WebElement element = null;

 public static WebElement Search_Input(WebDriver driver){

    element = driver.findElement(By.id("lst-ib"));
    
    return element;

    }

 public static WebElement Button_Search(WebDriver driver){

    element = driver.findElement(By.name("btnK")); //thuoc tinh cua nut search

 return element;
  }
 
 public static WebElement Hyperlink_Click1(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3")); //link gia tri tim kiem dau tien 

	 return element;
	  }
 
 public static String Verify_Tiltle(WebDriver driver) {
	 
	String element = driver.getTitle();  // lay tiltle cua page
	 
	 return element;
 }

}