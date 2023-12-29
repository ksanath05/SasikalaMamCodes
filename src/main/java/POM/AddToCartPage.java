package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	// Declaration
	// address of plus icon
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement plusIcon;
	// address of addto acrt

	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addtoCart;

//initilization
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// utilization

	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public void addToCart() {
		addtoCart.click();
	}

}
