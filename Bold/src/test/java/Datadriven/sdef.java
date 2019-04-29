package Datadriven;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sdef {
	@Given("i enter url")
	public void i_enter_url() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("i enter username and password")
	public void i_enter_username_and_password(io.cucumber.datatable.DataTable dt) {
	    List<Map<String,String>> list=dt.asMaps(String.class,String.class);
	    
	    
	    for(int i=0; i<list.size();i++){
	    	System.out.println(list.get(i).get("username"));
	    	System.out.println(list.get(i).get("password"));
	    }
		
		
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}

	@When("i click on login")
	public void i_click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
	 
	}



}
