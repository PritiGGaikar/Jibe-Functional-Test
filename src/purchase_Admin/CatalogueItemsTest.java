package purchase_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;

public class CatalogueItemsTest extends WebDriverPass {

	ExtentReports report;
	ExtentTest test;
	CatalogueItems m = new CatalogueItems();
	
  @Test(priority=39)
  public void ManageSystem() throws Exception {
	  test=report.startTest("CatalogueItems");
	  m.ManageSystems(driver);
	  Assert.assertTrue(true);
	  System.out.println("CatalogueItems URL Opened Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->ManageSystem"); 
  }

@Test(priority=40)
  public void NegativeTestCaseAddCatalogue() throws Exception {
	 test=report.startTest("Negative TestCase Add Catalogue");
	  m.NegativeTestCaseAddCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Negative Test Case for Add Catalogue is Executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->Negative TestCase Add Catalogue"); 
}


@Test(priority=41)
public void PositiveTestCaseAddCatalogue() throws Exception {
	 test=report.startTest("PositiveTestCaseAddCatalogue");
	  m.PositiveTestCaseAddCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Positive Test Case for Add Catalogue is Executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->Positive TestCase Add Catalogue"); 
}
@Test(priority=42)
  public void EditCatalogue() throws Exception {
	 test=report.startTest("EditCatalogue");
	  m.EditCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Edit Catalogue is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->Edit Catalogue"); 
}
  
 @Test(priority=43)
  public void NegativeTestCaseAddSubCatalogue() throws Exception {
	  test=report.startTest("NegativeTestCaseAddSubCatalogue");
	  m.NegativeTestCaseAddSubCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Negative Test Case for Add SubCatalogue is Executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->NegativeTestCaseAddSubCatalogue"); 
}
 
 @Test(priority=44)
 public void PositiveTestCaseAddSubCatalogue() throws Exception {
	  test=report.startTest("PositiveTestCaseAddSubCatalogue");
	  m.PositiveTestCaseAddSubCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Positive Test Case for Add SubCatalogue is Executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->PositiveTestCaseAddSubCatalogue"); 
}


 @Test(priority=45)
  public void EditSubCatalogue() throws Exception {
	  test=report.startTest("EditSubCatalogue");
	  m.EditSubCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Edit SubCatalogue is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->EditSubCatalogue"); 
}

  
  @Test(priority=46)
  public void NegativeTestCaseAddStoresItems() throws Exception {
	  test=report.startTest("NegativeTestCaseAddStoresItems");
	  m.NegativeTestCaseAddStoresItems(driver);
	  Assert.assertTrue(true);
	  System.out.println("Negative Test Case for Add Stores Items is Executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->Negative TestCase Add Stores Items"); 
}
  
  @Test(priority=47)
  public void PositiveTestCaseAddStoresItems() throws Exception {
	  test=report.startTest("PositiveTestCaseAddStoresItems");
	  m.PositiveTestCaseAddStoresItems(driver);
	  Assert.assertTrue(true);
	  System.out.println("Positive Test Case for Add Stores Items is Executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->Positive TestCase Add Stores Items"); 
}
 
   @Test(priority=48)
  public void EditStoresItem() throws Exception {
	  test=report.startTest("EditStoresItem");
	  m.EditStoresItem(driver);
	  Assert.assertTrue(true);
	  System.out.println("Edit Stores Item is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->EditStoresItem"); 
}

  @Test(priority=49)
  public void DeleteStoresItem() throws Exception {
	  test=report.startTest("DeleteStoresItem");
	  m.DeleteStoresItem(driver);
	  Assert.assertTrue(true);
	  System.out.println("Delete Stores Item is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->DeleteStoresItem"); 
}
  @Test(priority=40)
  public void DeleteSubCatalogue() throws Exception {
	  test=report.startTest("DeleteSubCatalogue");
	  m.DeleteSubCatalogue(driver);
	  Assert.assertTrue(true); 
	  System.out.println("Delete SubCatalogue is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->DeleteSubCatalogue"); 
}
  
  
  @Test(priority=51)
  public void DeleteCatalogue() throws Exception {
	  test=report.startTest("DeleteCatalogue");
	  m.DeleteCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Delete Catalogue is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->DeleteCatalogue"); 
}
 
  
  @AfterMethod
 	public void afterMethod(ITestResult result) {
 	    if (result.getStatus() == ITestResult.FAILURE) {
 	        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
 	    } else if (result.getStatus() == ITestResult.SKIP) {
 	        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
 	    } else {
 	        test.log(LogStatus.PASS, "Test passed");
 	    }
 	    report.endTest(test);
 	    report.flush();
 }
  @BeforeSuite
  public void beforeSu() {
	  report = LOTestingLabList.getReporter(path.concat("Report.html"));	  }
 /*
  @AfterSuite
 public void afterSu() {
      report.close();*/
  }







	 
