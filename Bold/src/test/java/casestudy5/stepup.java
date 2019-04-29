package casestudy5;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class stepup {
	WebDriver driver;
	@Given("open proper web browser")
	public void open_proper_web_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");


		 driver = new ChromeDriver();
	   
	}

	@And("open  url")
	public void open_url() {
		driver.get("http://10.232.237.143:443/TestMeApp/");


		 driver.manage().window().maximize();
	    
	    
	   
	}

	@And("enter  username and password")
	public void enter_username_and_password(io.cucumber.datatable.DataTable dt) {
		 List<Map<String,String>> list=dt.asMaps(String.class,String.class);
		    
		  driver.findElement(By.xpath("//a[@href='login.htm']")).click();


		   
		    	String s =list.get(0).get("username");
		    	String r= list.get(0).get("password");
		   

		  	  driver.findElement(By.id("userName")).sendKeys(s);


		  	  driver.findElement(By.id("password")).sendKeys(r);
		  	  driver.findElement(By.name("Login")).click();
	    
	   
	}

	@And("enter {string} , {string} , {string} , {string} , {string} , {string} and {string}")
	public void enter_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button")).click();
		
		
		
		
		driver.findElement(By.xpath("//*[@id='categorydropid']")).sendKeys(string);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='subcategorydropid']")).sendKeys(string2);
		driver.findElement(By.xpath("//*[@id='prodid']")).sendKeys(string3);
		driver.findElement(By.xpath("//*[@id='priceid']")).sendKeys(string4);
		driver.findElement(By.xpath("//*[@id='quantityid']")).sendKeys(string5);
		driver.findElement(By.xpath("//*[@id='brandid']")).sendKeys(string6);
		driver.findElement(By.xpath("//*[@id='description']")).sendKeys(string7);
	
		WebElement element= driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/span/div/div/div/input"));
		element.sendKeys("C:\\Users\\training_c2a.05.01\\Pictures\\Screenshots\\Screenshot (3).png");
		driver.manage().timeouts().implicitlyWait(23, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
		
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();

	}

	@And("close app")
	public void close_app() {
	  
	}


}
