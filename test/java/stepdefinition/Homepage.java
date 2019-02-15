package stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import objectrepository.HomepageObject;

public class Homepage {
static WebDriver driver;

	@Given("^The user is in Abhibus home pag$")
	public void the_user_is_in_Abhibus_home_pag() throws Throwable {
			Hook.driver.get("https://www.abhibus.com/");
	
	}
	
	@When("^The user fill in the journey details \"([^\"]*)\",\"([^\"]*)\"$")
	public void the_user_fill_in_the_journey_details(String arg1, String arg2) throws Throwable {
		Robot r=new Robot();
		HomepageObject fill=new HomepageObject();
		fill.getSrcLocation().sendKeys(arg1);
		//r.keyPress(KeyEvent.KEY_PRESSED);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		fill.getDesLocation().sendKeys(arg2);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		fill.getPickDate().click();

		fill.getselectDate().click();
	
	}
	@When("^The user search the buses$")
	public void the_user_search_the_buses() throws Throwable {
		HomepageObject fill=new HomepageObject();
		Thread.sleep(3000);
fill.getSearch_buses().click();
		
	}

	@When("^Select return date$")
	public void select_return_date() throws Throwable {
		
		HomepageObject fill=new HomepageObject();
		Thread.sleep(3000);
		fill.getReturnDate().click();
		fill.getReturnTmrDate().click();
	}

	


}
