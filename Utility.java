package utl;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Utility extends WebDriverUtl{
	public static WebDriver driver;
	
    @Test(enabled= true,priority=1)
	public void UrlCheck() {
	    String myurl="https://www.saucedemo.com/";
    	String applicationurl =driver.getCurrentUrl();
		
		Assert.assertEquals(applicationurl,myurl);
		
      }
    
  @Test(enabled= true,priority=2)
  public void test1() throws InterruptedException {
	  
      sendkeys(By.id("user-name"),"standard_user");
      sendkeys(By.id("password"),"secret_sauce");
      click(By.id("login-button")); 
	  click(By.xpath("//*[@id=\"item_4_img_link\"]/img"));
	  click(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
	  click(By.id("back-to-products"));
	  click(By.xpath("//*[@id=\"item_1_img_link\"]/img"));
	  click(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
	  click(By.xpath("//*[@id=\"back-to-products\"]"));
	  click(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	  click(By.xpath("//*[@id=\"checkout\"]"));
	  sendkeys(By.id("first-name"),"Sabeeha");
	  sendkeys(By.id("last-name"),"Rahman");
	  sendkeys(By.id("postal-code"),"682555");
	  click(By.xpath("//*[@id=\"continue\"]"));
	  click(By.xpath("//*[@id=\"finish\"]"));
	  Thread.sleep(4000);
	  
  }

    @Test(enabled= true,priority=3)
    public void mainPage() {
    	String title="Swag Labs";
    	String validate=driver.getTitle();
    	
    	Assert.assertEquals(validate,title);
    	
    }

  @BeforeTest
  public void beforeTest() {
	  String url="https://www.saucedemo.com/";
	  String driverpath="D:\\Techmindz\\chromedriver_win32\\chromedriver.exe";
	  launchBrowser(driverpath,url);
	  
	  driver=WebDriverUtl.driver;
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
