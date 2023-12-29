package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryAppPage {
	//Declaration
	//address of course web element
	@FindBy(id="course")
	private WebElement Coursebtn;
	//address of feedback wweb element
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedBackBtn;
	//addresss of select catagery drop down
	@FindBy(name="addresstype")
	private WebElement selectDd;
	//initilization
		public DemoSkillraryAppPage(WebDriver driver){
	     PageFactory.initElements(driver,this);
	     }
		//Utilization
		public WebElement getCoursebtn() {
			return Coursebtn;
		}
		public WebElement getSelectDd() {
			return selectDd;
		}
		public void feedBackButton() {
			feedBackBtn.click();
		}
		

		
		
	

}
