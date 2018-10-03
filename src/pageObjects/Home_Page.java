package pageObjects;


    import org.openqa.selenium.By;

    import org.openqa.selenium.WebDriver;

    import org.openqa.selenium.WebElement;

 public class Home_Page {

    private static WebElement element = null;

 public static WebElement lnk_Signin(WebDriver driver){

    element = driver.findElement(By.id("gb_70"));
    return element;

    }
 
 public static WebElement txtbox_Search(WebDriver driver){

	    element = driver.findElement(By.className("lst-ib"));
	    return element;
	    }
 
 //btnK 
 public static WebElement Button_Search(WebDriver driver){

	    element = driver.findElement(By.name("btnK"));
	    return element;
	    }
 
 
 
 

 public static WebElement lnk_LogOut(WebDriver driver){

    element = driver.findElement(By.id("account_logout"));

 return element;

    }

}