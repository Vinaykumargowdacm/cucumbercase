package cucusel;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class step {
	WebDriver driver;
	@Given("tester creates webdriver instance")
public void tester_creates_webdriver_instance() {
	
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");


	 driver = new ChromeDriver();


	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@And("open the url")
public void open_the_url() {
	 driver.get("http://10.232.237.143:443/TestMeApp/");


	 driver.manage().window().maximize();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@And("enters the credentials and login")
public void enters_the_credentials_and_login(io.cucumber.datatable.DataTable dt) {
	  List<Map<String,String>> list=dt.asMaps(String.class,String.class);
	    
	  driver.findElement(By.xpath("//a[@href='login.htm']")).click();


	   
	    	String s =list.get(0).get("username");
	    	String r= list.get(0).get("password");
	   

	  	  driver.findElement(By.id("userName")).sendKeys(s);


	  	  driver.findElement(By.id("password")).sendKeys(r);
	  	  driver.findElement(By.name("Login")).click();
	
	
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    //throw new cucumber.api.PendingException();
	
}

@And("enter avlue in search and click find button")
public void enter_avlue_in_search_and_click_find_button() {
	
	  driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Hand bag");
	
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@And("add the product to cart and check out")
public void add_the_product_to_cart_and_check_out() {
	
	  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();


	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();


	  String message=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();


	  Assert.assertEquals(message,"Shopping Cart");
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@And("proceed to payment")
public void proceed_to_payment() {
	



	 driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();


	


	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


	 WebElement radio=driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label"));


	 radio.click();


	 driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();





	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


	 String message2=driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/h2")).getText();
   
	 Assert.assertEquals(message2,"Login to continue");
	 driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");


	 driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");


	 driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();


	 String message3=driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/h2")).getText();


	 Assert.assertEquals(message3,"Amount - 1500");


	


	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


	// driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
	 driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");

	 //driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	 //driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	 driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	 String message4=driver.findElement(By.xpath("/html/body/b/section/div/div/div/div[2]/p")).getText();


	 Assert.assertEquals(message4,"Your order has been confirmed");





	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
  
}

@And("signout from testmeapp")
public void signout_from_testmeapp() {
	 driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[1]")).click();


	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();


	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


	 driver.close();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

}
