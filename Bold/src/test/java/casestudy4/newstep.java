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

public class newstep {
	WebDriver driver;
	@Given("open webbrowsers")
	public void open_webbrowsers() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");


		 driver = new ChromeDriver();

	}

	@And("open exacts url")
	public void open_exacts_url() {
		 driver.get("http://10.232.237.143:443/TestMeApp/");


		 driver.manage().window().maximize();
	    
	}

	@And("login with adminn usernam and password")
	public void login_with_adminn_usernam_and_password(io.cucumber.datatable.DataTable dt) {
		 List<Map<String,String>> list=dt.asMaps(String.class,String.class);
		    
		  driver.findElement(By.xpath("//a[@href='login.htm']")).click();


		   
		    	String s =list.get(0).get("username");
		    	String r= list.get(0).get("password");
		   

		  	  driver.findElement(By.id("userName")).sendKeys(s);


		  	  driver.findElement(By.id("password")).sendKeys(r);
		  	  driver.findElement(By.name("Login")).click();
	   
	  
	}

	@And("enter category")
	public void enter_category(io.cucumber.datatable.DataTable data) {
		List<Map<String,String>> list=data.asMaps(String.class,String.class);
		String s1 =list.get(0).get("value");
    	String s2= list.get(1).get("value");
	  
	}

	@And("enter subcategory")
	public void enter_subcategory(io.cucumber.datatable.DataTable data1) {
		List<Map<String,String>> list=data1.asMaps(String.class,String.class);
		String s3 =list.get(0).get("variable");
    	String s4= list.get(1).get("variable");
	}

	@And("Add product")
	public void add_product(io.cucumber.datatable.DataTable data2) {
		//List<Map<String,String>> list=data2.asMaps(String.class,String.class);
		//String s5 =list.get(0).get("name");
    	//String s6= list.get(1).get("name");
    	
    	
 	   
 	   List<Map<String,String>> list=data2.asMaps(String.class,String.class);
 for(int i=0;i<list.size();i++)
 {
    	String v=list.get(i).get("name");

   
     driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button")).click();
 	
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
 }
 	   
    	
    	
	}

	@And("add image")
	public void add_image(io.cucumber.datatable.DataTable data3) {
		List<Map<String,String>> list=data3.asMaps(String.class,String.class);
		String s7 =list.get(0).get("img");
    	String s8= list.get(1).get("img");
	}

	@And("sign out from appp")
	public void sign_out_from_appp() {
	   
	}


}
