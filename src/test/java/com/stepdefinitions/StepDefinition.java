package com.stepdefinitions;

import org.openqa.selenium.interactions.Actions;

import com.objectrepository.Homepage;
import com.resources.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base {
	Homepage h=new Homepage();
	
	@Given("In homepage")
	public void in_homepage() {
	   System.out.println("homepage");
	}

	@When("enter the from and to place")
	public void enter_the_from_and_to_place() throws InterruptedException {

	
		
fill(h.getFrom(), getData().get(1).get("from"));
fill(h.getTo(), getData().get(1).get("to"));
//btnClick(h.getOnewaybtn());
//fill(h.getDate(),"12/12/12");
//btnClick(h.getSearchBtn());

	
	
	
	}

	@Then("the user see the flights")
	public void the_user_see_the_flights() {
		
		System.out.println("success");
	}

}
