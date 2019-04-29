package Casestudy3;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class steppp {
	WebDriver driver;
	@Given("open web browser")
	public void open_web_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");


		 driver = new ChromeDriver();
	    
	}

	@And("open specific url")
	public void open_specific_url() {
		driver.get("http://10.232.237.143:443/TestMeApp/");


		 driver.manage().window().maximize();
	    
	   
	}

	@And("login with proper credential username and password")
	public void login_with_proper_credential_username_and_password(io.cucumber.datatable.DataTable dt) {
		 List<Map<String,String>> list=dt.asMaps(String.class,String.class);
		    
		  driver.findElement(By.xpath("//a[@href='login.htm']")).click();


		   
		    	String s =list.get(0).get("username");
		    	String r= list.get(0).get("password");
		   

		  	  driver.findElement(By.id("userName")).sendKeys(s);


		  	  driver.findElement(By.id("password")).sendKeys(r);
		  	  driver.findElement(By.name("Login")).click();
		
	    
	}

	@And("add new product")
	public void add_new_product(io.cucumber.datatable.DataTable dt) {
driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button")).click();
		
		
		
		//driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/span")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<Map<String,String>> list=dt.asMaps(String.class,String.class);
		String s3=list.get(0).get("category name");
		String s4=list.get(0).get(" Sub category name");
		String s5=list.get(0).get("roduct Name ");
		String s6=list.get(0).get("Price");
		String s7=list.get(0).get("Quantity");
		String s8=list.get(0).get("Brand");
		String s9=list.get(0).get("Description");
		driver.findElement(By.xpath("//*[@id='categorydropid']")).sendKeys(s3);

		
		driver.findElement(By.xpath("//*[@id='subcategorydropid']")).sendKeys(s4);
		driver.findElement(By.xpath("//*[@id='prodid']")).sendKeys(s5);
		driver.findElement(By.xpath("//*[@id='priceid']")).sendKeys(s6);
		driver.findElement(By.xpath("//*[@id='quantityid']")).sendKeys(s7);
		driver.findElement(By.xpath("//*[@id='brandid']")).sendKeys(s8);
		driver.findElement(By.xpath("//*[@id='description']")).sendKeys(s9);
		//driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/span/div/div/div/input")).click();
		//driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/input")).sendKeys("Screenshot(6).png");
		WebElement element= driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/span/div/div/div/input"));
		element.sendKeys("C:\\Users\\training_c2a.05.01\\Pictures\\Screenshots\\Screenshot (3).png");
		driver.manage().timeouts().implicitlyWait(23, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
		//driver.findElement(By.xpath("/html/body/header/div/b/c:if/a[1]")).click();
		//driver.findElement(By.xpath("/html/body/main/div/div/div/div[4]/button/span")).click();
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	    
	}

	@And("sign out")
	public void sign_out() {
	    
	}

}
