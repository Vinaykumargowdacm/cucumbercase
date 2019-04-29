package Datatypes;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepp {
	@Given("enter user id {int}")
	public void enter_user_id(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(int1);
	}

	@And("enter password {string}")
	public void enter_password(String str1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(str1);
	}

	@And("enter amount {double}")
	public void enter_amount(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println(double1);
	}

	@Then("proceed payment")
	public void proceed_payment() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("logout")
	public void logout() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}


}
