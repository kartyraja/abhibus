package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class validationpage {
	
	public validationpage() {

		PageFactory.initElements(Hook.driver, this);
	
	}

	@FindBy(id="SubHeadJrney")
	private WebElement validatepage;
	
	@FindBy(id="SubHead2way")
	private WebElement validatereturnpage;

	public WebElement getValidatereturnpage() {
		return validatereturnpage;
	}

	public WebElement getValidatepage() {
		return validatepage;
	}

	

		
	
	
}
