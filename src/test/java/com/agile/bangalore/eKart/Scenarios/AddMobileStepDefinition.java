package com.agile.bangalore.eKart.Scenarios;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.agile.bangalore.ekart.config.AppInitializer;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddMobileStepDefinition {	
	
	@Given("^I have (\\d+) mobiles in eKart$")	
	public void i_have_mobiles_in_eKart(int arg1) throws Throwable {
		
		// call application to test
	}

	@When("^I add a mobile$")
	public void i_add_a_mobile(DataTable arg1) throws Throwable 
	{
		
	}

	@Then("^the eKart should have (\\d+) mobile$")
	public void the_eKart_should_have_mobile(int arg1, DataTable arg2) throws Throwable {
	    
	}

}
