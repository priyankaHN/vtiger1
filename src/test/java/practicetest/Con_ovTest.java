package practicetest;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.vtiger1.comcast.genericutility.BaseClass;
import com.vtiger1.comcast.pomrepository.ConvertLeadPage;
import com.vtiger1.comcast.pomrepository.CreateLeadPage;
import com.vtiger1.comcast.pomrepository.HomePage;
import com.vtiger1.comcast.pomrepository.LeadsInfoPage;
import com.vtiger1.comcast.pomrepository.LeadsPage;



public class Con_ovTest extends BaseClass 
{
	@Test(groups ={"regressionTest"})
	public void ConverLeadToBySelectingOnlyOrganisation1Test() throws Throwable
	{
				
		int randomInt = jLib.getRanDomNumber();
		
		
		/*test script Data*/
		String lastName = eLib.getDataFromExcel("Sheet1", 1, 2) + randomInt;
		String companyName = eLib.getDataFromExcel("Sheet1", 1, 3) + randomInt;
		
        /*step 2 : navigate to leads*/
        HomePage homePage = new HomePage(driver);
        homePage.getLeadsLink().click();

        /*step 3 : navigate to "create new lead"page by click on "+" image */
		LeadsPage leadsPage = new LeadsPage(driver);
		leadsPage.getCreateLeadImg().click();
		
        /*step 4 : create lead*/
		CreateLeadPage createLeadsPage = new CreateLeadPage(driver);
		createLeadsPage.createLead(lastName,companyName);
		
		/*step 5: to verify successfull message in leads info page after creating new lead*/
		LeadsInfoPage leadsInfo= new LeadsInfoPage(driver);
		String successMsg = leadsInfo.getSuccessMsg().getText();
		
		
		boolean succMsg1=(successMsg.contains(lastName));
		softAssert.assertTrue(true);
		
		/*step4 : navigate to convert lead page*/
		homePage.getLeadsLink().click();
		leadsPage.getchkBx().click();
		leadsPage.getLastnameLnk().click();
		
		
		leadsInfo.getConvertLeadLnk().click();
		
		/*step5 : convertlead by selecting only organisation*/ 
		ConvertLeadPage convertLead = new ConvertLeadPage(driver);
		convertLead.getHidDivPop().click();
		convertLead.getContactChkBx().click();
		convertLead.getSaveBtn().click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		String expectedAlertText = "Contact should be selected to transfer related records ";
		String actualAlerText= alert.getText();
		
		Thread.sleep(2000);
		
		System.out.println("expectedAlertText="+expectedAlertText);
		System.out.println("actualAlerText="+actualAlerText);
		
		softAssert.assertEquals(expectedAlertText, actualAlerText);
		
		alert.accept();
		softAssert.assertAll();
		
	}

	@Test//(groups ={"regressionTest"})
	public void ConverLeadToBySelectingOnlyOrganisationTest() throws Throwable
	{
				
		int randomInt = jLib.getRanDomNumber();
		
		
		/*test script Data*/
		String lastName = eLib.getDataFromExcel("Sheet1", 1, 2) + randomInt;
		String companyName = eLib.getDataFromExcel("Sheet1", 1, 3) + randomInt;
		
        /*step 2 : navigate to leads*/
        HomePage homePage = new HomePage(driver);
        homePage.getLeadsLink().click();

        /*step 3 : navigate to "create new lead"page by click on "+" image */
		LeadsPage leadsPage = new LeadsPage(driver);
		leadsPage.getCreateLeadImg().click();
		
        /*step 4 : create lead*/
		CreateLeadPage createLeadsPage = new CreateLeadPage(driver);
		createLeadsPage.createLead(lastName,companyName);
		
		/*step 5: to verify successfull message in leads info page after creating new lead*/
		LeadsInfoPage leadsInfo= new LeadsInfoPage(driver);
		String successMsg = leadsInfo.getSuccessMsg().getText();
		
		
		boolean succMsg1=(successMsg.contains(lastName));
		softAssert.assertTrue(true);
		
		/*step4 : navigate to convert lead page*/
		homePage.getLeadsLink().click();
		leadsPage.getchkBx().click();
		leadsPage.getLastnameLnk().click();
		
		
		leadsInfo.getConvertLeadLnk().click();
		
		/*step5 : convertlead by selecting only organisation*/ 
		ConvertLeadPage convertLead = new ConvertLeadPage(driver);
		convertLead.getHidDivPop().click();
		convertLead.getContactChkBx().click();
		convertLead.getSaveBtn().click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		String expectedAlertText = "Contact should be selected to transfer related records ";
		String actualAlerText= alert.getText();
		
		Thread.sleep(2000);
		
		System.out.println("expectedAlertText="+expectedAlertText);
		System.out.println("actualAlerText="+actualAlerText);
		
		softAssert.assertEquals(expectedAlertText, actualAlerText);
		
		alert.accept();
		softAssert.assertAll();///
		
		
	}
	@Test(groups ={"regressionTest"})
	public void ConverLeadToBySelectingOnlyOrganisation2Test() throws Throwable
	{
				
		int randomInt = jLib.getRanDomNumber();
		
		
		/*test script Data*/
		String lastName = eLib.getDataFromExcel("Sheet1", 1, 2) + randomInt;
		String companyName = eLib.getDataFromExcel("Sheet1", 1, 3) + randomInt;
		
        /*step 2 : navigate to leads*/
        HomePage homePage = new HomePage(driver);
        homePage.getLeadsLink().click();

        /*step 3 : navigate to "create new lead"page by click on "+" image */
		LeadsPage leadsPage = new LeadsPage(driver);
		leadsPage.getCreateLeadImg().click();
		
        /*step 4 : create lead*/
		CreateLeadPage createLeadsPage = new CreateLeadPage(driver);
		createLeadsPage.createLead(lastName,companyName);
		
		/*step 5: to verify successfull message in leads info page after creating new lead*/
		LeadsInfoPage leadsInfo= new LeadsInfoPage(driver);
		String successMsg = leadsInfo.getSuccessMsg().getText();
		
		
		boolean succMsg1=(successMsg.contains(lastName));
		softAssert.assertTrue(true);
		
		/*step4 : navigate to convert lead page*/
		homePage.getLeadsLink().click();
		leadsPage.getchkBx().click();
		leadsPage.getLastnameLnk().click();
		
		
		leadsInfo.getConvertLeadLnk().click();
		
		/*step5 : convertlead by selecting only organisation*/ 
		ConvertLeadPage convertLead = new ConvertLeadPage(driver);
		convertLead.getHidDivPop().click();
		convertLead.getContactChkBx().click();
		convertLead.getSaveBtn().click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		String expectedAlertText = "Contact should be selected to transfer related records ";
		String actualAlerText= alert.getText();
		
		Thread.sleep(2000);
		
		System.out.println("expectedAlertText="+expectedAlertText);
		System.out.println("actualAlerText="+actualAlerText);
		
		softAssert.assertEquals(expectedAlertText, actualAlerText);
		
		alert.accept();
		softAssert.assertAll();///
	}

}
