package Casestudy1;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class stepdef {
	WebDriver driver;
	@Given("call the web browser")
	public void call_the_web_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");


		 driver = new ChromeDriver();

	   
	}

	@And("enter the url")
	public void enter_the_url() {
		 driver.get("http://10.232.237.143:443/TestMeApp/");


		 driver.manage().window().maximize();
	    
	}

	@And("enter the valid password and username")
	public void enter_the_valid_password_and_username(io.cucumber.datatable.DataTable dt) {
		  List<Map<String,String>> list=dt.asMaps(String.class,String.class);
		    
		  driver.findElement(By.xpath("//a[@href='login.htm']")).click();


		   
		    	String s =list.get(0).get("username");
		    	String r= list.get(0).get("password");
		   

		  	  driver.findElement(By.id("userName")).sendKeys(s);


		  	  driver.findElement(By.id("password")).sendKeys(r);
		  	  driver.findElement(By.name("Login")).click();
		
	   
	}

	@And("ADd new product")
	public void add_new_product() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/button/span")).click();
		driver.findElement(By.xpath("//*[@id='catgName']")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id='catgDesc']")).sendKeys("apple");
		driver.navigate().back();
		//driver.navigate().back();
		
		//driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[3]/button")).click();
		//driver.findElement(By.xpath("/html/body/main/div/div/div/div[3]/button/h4")).click();
		driver.findElement(By.xpath("//*[@id='subCatgId']")).sendKeys("iphone)");
	    driver.findElement(By.xpath("//*[@id='subCatgName']")).sendKeys("apple");
		driver.findElement(By.xpath("//*[@id='subCatgDesc']")).sendKeys("i7");
		driver.navigate().back();
		//driver.navigate().back();
						
		//driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
		

	}

	@And("Fill all mandatory fields")
	public void fill_all_mandatory_fields() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button")).click();
		
		
		
		//driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/span")).click();
		driver.findElement(By.xpath("//*[@id='categorydropid']")).sendKeys("iphone");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='subcategorydropid']")).sendKeys("apple");
		driver.findElement(By.xpath("//*[@id='prodid']")).sendKeys("imac");
		driver.findElement(By.xpath("//*[@id='priceid']")).sendKeys("50000");
		driver.findElement(By.xpath("//*[@id='quantityid']")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id='brandid']")).sendKeys("i7");
		driver.findElement(By.xpath("//*[@id='description']")).sendKeys("best features");
		//driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/span/div/div/div/input")).click();
		//driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/input")).sendKeys("Screenshot(6).png");
		WebElement element= driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/span/div/div/div/input"));
		element.sendKeys("C:\\Users\\training_c2a.05.01\\Pictures\\Screenshots\\Screenshot (2).png");
		driver.manage().timeouts().implicitlyWait(23, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
		//driver.findElement(By.xpath("/html/body/header/div/b/c:if/a[1]")).click();
		//driver.findElement(By.xpath("/html/body/main/div/div/div/div[4]/button/span")).click();
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();


	}

	@And("click add product")
	public void click_add_product() {
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();

		  driver.findElement(By.id("userName")).sendKeys("lalitha");


		  driver.findElement(By.id("password")).sendKeys("password123");
		  driver.findElement(By.name("Login")).click();


		driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys("imac");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		driver.manage().timeouts().implicitlyWait(23, TimeUnit.SECONDS);
			
	 
	}


}
