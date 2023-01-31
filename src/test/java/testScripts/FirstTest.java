package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstTest extends BaseClass
{
	//first test script
 @Test
 public void firstTest() throws InterruptedException
 {
	 SoftAssert soft=new SoftAssert();
	 home.clickgearsTab();
	 home.clickskillraryDemoAppLink();
	 web.handleChildBrowser();
	 soft.assertTrue(demoApp.getpageheader().isDisplayed());
     demoApp.mouseHoverTocourseTab(web);
     demoApp.clickSeleniumTraining();
     soft.assertTrue(selenium.getpageheader().isDisplayed());
     selenium.doubleClickPlusButton(web);
     selenium.clickAddToCart();
     web.handlesAlert();
     Thread.sleep(3000);
     web.screenshot();
     soft.assertAll();
 
 }
	
}
