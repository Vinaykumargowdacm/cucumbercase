package casestudy4;

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


public class defff {
	WebDriver driver;
	@Given("open webbrowser")
	public void open_webbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");


		 driver = new ChromeDriver();

	    
	}
    @And("open exact url")
	public void open_exact_url() {
    	 driver.get("http://10.232.237.143:443/TestMeApp/");


		 driver.manage().window().maximize();
	    
	  
	}

	@And("login with admin usernam and password")
	public void login_with_admin_usernam_and_password(io.cucumber.datatable.DataTable dt) {
		 List<Map<String,String>> list=dt.asMaps(String.class,String.class);
		    
		  driver.findElement(By.xpath("//a[@href='login.htm']")).click();


		   
		    	String s =list.get(0).get("username");
		    	String r= list.get(0).get("password");
		   

		  	  driver.findElement(By.id("userName")).sendKeys(s);


		  	  driver.findElement(By.id("password")).sendKeys(r);
		  	  driver.findElement(By.name("Login")).click();
	   
	}

	@And("Add products")
	public void add_products(io.cucumber.datatable.DataTable data) {
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/button/h4")).click();
	WebElement ss=driver.findElement(By.xpath("//*[@id='catgName']"));
		ss.sendKeys("bangalore");
		driver.findElement(By.id("catgDesc")).sendKeys("gardencity");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
		driver.navigate().back();
		driver.navigate().back();
	    driver.findElement(By.xpath("/html/body/main/div/div/div/div[3]/button")).click();
	    driver.findElement(By.xpath("//*[@id='subCatgId']")).sendKeys("bangalore");
	   driver.findElement(By.xpath("//*[@id='subCatgName']")).sendKeys("traffic");
	   driver.findElement(By.xpath("//*[@id='subCatgDesc']")).sendKeys("beauty");
	   driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
	   driver.navigate().back();
	   driver.navigate().back();
	  
	   
	   List<Map<String,String>> list=data.asMaps(String.class,String.class);
for(int i=0;i<list.size();i++)
{
   	String v=list.get(i).get("name");

  
    driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button")).click();
	   
	   
	   
		
		
		
		//driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/span")).click();
		//driver.findElement(By.xpath("//*[@id='categorydropid']")).sendKeys("rcb");

		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='subcategorydropid']")).sendKeys("batting");
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//*[@id='prodid']")).sendKeys(v);
		System.out.println(v);

		driver.findElement(By.xpath("//*[@id='priceid']")).sendKeys("2500");
		driver.findElement(By.xpath("//*[@id='quantityid']")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id='brandid']")).sendKeys("software");
		driver.findElement(By.xpath("//*[@id='description']")).sendKeys("requirement");
		//driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/span/div/div/div/input")).click();
		//driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/input")).sendKeys("Screenshot(6).png");
		WebElement element= driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/span/div/div/div/input"));
		element.sendKeys("C:\\Users\\training_c2a.05.01\\Pictures\\Screenshots\\Screenshot (5).png");
		driver.manage().timeouts().implicitlyWait(23, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String t=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).getText();
		Assert.assertEquals(t, "Product : saf is added Succesfully !!!");
		 driver.navigate().back();
		 
		 
		 
		 
		 
		 
		 
		//driver.findElement(By.xpath("/html/body/header/div/b/c:if/a[1]")).click();
		//driver.findElement(By.xpath("/html/body/main/div/div/div/div[4]/button/span")).click();
	   
	   
		 //List<Map<String,String>> list=data.asMaps(String.class,String.class);
		    
}

	    
	}

	@And("sign out from app")
	public void sign_out_from_app() {
	   
	}


}
