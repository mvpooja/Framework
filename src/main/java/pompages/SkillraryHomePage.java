package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage 
{
 //Declaration
	@FindBy(xpath="//img[@alt='SkillRary']") 
	private WebElement logo;
	@FindBy(name="q") 
	private WebElement searchTF;
	@FindBy(xpath="//input[@value='go']") 
	private WebElement searchButton;
	@FindBy(xpath="//a[text()=' GEARS ']") 
	private WebElement gearsTab;
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP']") 
	private WebElement skillraryDemoAppLink;
	
	//Initialization
	public SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getlogo()
	{
		return logo;
	}
	public void searchCourse(String text)
	{
		searchTF.sendKeys(text);
		searchButton.click();
	}
	public void clickgearsTab()
	{
		gearsTab.click();
	}
	public void clickskillraryDemoAppLink()
	{
		skillraryDemoAppLink.click();
	}
}
