package stepdefinition;

import cucumber.api.java.en.Then;
import objectrepository.validationpage;

public class validationstep {
	@Then("^The customer should see the Source and destination$")
	public void the_customer_should_see_the_Source_and_destination() throws Throwable {
	
	validationpage val=new validationpage();
	//Assert.assertEquals("Chennai → Coimbatore", val.getValidatepage().getAttribute("value"));
	System.out.println(val.getValidatepage().getText());
			
	}
	@Then("^The customer should see the Source and destination and return$")
	public void the_customer_should_see_the_Source_and_destination_and_return() throws Throwable {

		validationpage val=new validationpage();
		System.out.println(val.getValidatepage().getText());
		System.out.println(val.getValidatereturnpage().getText());
	}
}
