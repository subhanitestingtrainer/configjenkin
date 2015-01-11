package com.jenkin.test.jenkintest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JenkinSteps {
	
	InteractionsPage interactionsPage;
	
	@Given("^open the interaction groups page$")
	public void open_the_interaction_groups_page() throws Throwable {
		interactionsPage = new InteractionsPage();
		interactionsPage.openInteractionPage();
	}

	@When("^i drag and drop the items$")
	public void i_drag_and_drop_the_items() throws Throwable {
		interactionsPage.dragAndDropItem("pt1", "t1");
	}

	@Then("^items are dropped$")
	public void items_are_dropped() throws Throwable {	 
		interactionsPage.itemNotDisplayed("t1");
	}

}
