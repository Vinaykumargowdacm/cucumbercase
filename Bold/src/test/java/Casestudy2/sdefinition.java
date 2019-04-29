package Casestudy2;

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

public class sdefinition {
	WebDriver driver;
	@Given("open webdriver")
	public void open_webdriver() {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");


		 driver = new ChromeDriver();
	   
	}

	@And("open url")
	public void open_url() {
		 driver.get("http://10.232.237.143:443/TestMeApp/");


		 driver.manage().window().maximize();
	}

	@And("enter user credential username and password")
	public void enter_user_credential_username_and_password(io.cucumber.datatable.DataTable dt) {
		 List<Map<String,String>> list=dt.asMaps(String.class,String.class);
		    
		  driver.findElement(By.xpath("//a[@href='login.htm']")).click();


		   
		    	String s =list.get(0).get("username");
		    	String r= list.get(0).get("password");
		   

		  	  driver.findElement(By.id("userName")).sendKeys(s);


		  	  driver.findElement(By.id("password")).sendKeys(r);
		  	  driver.findElement(By.name("Login")).click();
	}

	@And("search product")
	public void search_product() {

		  driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Hand bag");
		
		  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();


		  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();


		  String message=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();


		  Assert.assertEquals(message,"Shopping Cart");
		  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	   
	}

	@And("make payment")
	public void make_payment() {

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


		
		 driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");

		
		 driver.findElement(By.xpath("//input[@value='PayNow']")).click();
		 String message4=driver.findElement(By.xpath("/html/body/b/section/div/div/div/div[2]/p")).getText();


		 Assert.assertEquals(message4,"Your order has been confirmed");





		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
	  
	    
	}

	@And("do logout")
	public void do_logout() {
		 driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[1]")).click();


		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();


		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		 driver.close();
	   
	}


}
