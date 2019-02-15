package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class HomepageObject {
	
	public HomepageObject() {
		
		PageFactory.initElements(Hook.driver, this);
		
	}
	@FindBy(id="source")
	private WebElement SrcLocation;
	@FindBy(id="destination")
	private WebElement DesLocation;
	@FindBy(id="datepicker1")
	private WebElement PickDate;
	@FindBy(xpath="//div[@id=\"tomorrowdiv\"]")
	private WebElement selectDate;
	
	public WebElement getSrcLocation() {
		return SrcLocation;
	}
	public WebElement getDesLocation() {
		return DesLocation;
	}
	public WebElement getPickDate() {
		return PickDate;
	}
	public WebElement getselectDate() {
		return selectDate;
	}
	@FindBy(xpath="//a[@title=\"Search Buses\"]")
	private WebElement Search_buses;
	
	@FindBy(id="datepicker2")
	private WebElement ReturnDate;
	
	@FindBy(xpath="//a[text()='21']")
	private WebElement ReturnTmrDate;

	public WebElement getSearch_buses() {
		return Search_buses;
	}
	public WebElement getReturnDate() {
		return ReturnDate;
	}
	public WebElement getReturnTmrDate() {
		return ReturnTmrDate;
	}
}
