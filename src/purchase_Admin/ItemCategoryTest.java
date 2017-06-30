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

public class ItemCategoryTest extends WebDriverPass{


	protected ExtentReports report;
	protected ExtentTest test;
	
	ItemCategory w = new ItemCategory();
	

   @Test(priority=34)
  public void ItemCategory() throws Exception {
	   test=report.startTest("Item Category");	  
	   w.ItemCategorys(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Purchase-->Admin-->Item Category"); 
	  System.out.println("Item Category URL open successfully");
  }
   @Test(priority=35)
   public void NegativeTestAddNewCategory() throws Exception {
 	   test=report.startTest("Negative Test Add New Category");	  
 	   w.NegativeTestAddNewCategory(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Negative Test Add New Category"); 
 	 System.out.println("Negative Test Case for Add New Category is executed successfully ");
   }
    
   
   @Test(priority=36)
   public void AddNewCategory() throws Exception {
 	   test=report.startTest("Add New Category");	  
 	   w.AddNewCategory(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Add New Category"); 
 	 System.out.println("Positive Test Case for Add New Category is executed successfully ");
 	
   }
    
   
   @Test(priority=37)
   public void EditNewCategory() throws Exception {
 	   test=report.startTest("Edit New Category");	  
 	   w.EditNewCategory(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Edit New Category"); 
 	 System.out.println("Edit New Category is executed successfully ");
 	 
   }
   
   @Test(priority=38)
   public void DeleteCategory() throws Exception {
 	   test=report.startTest("Delete Category");	  
 	   w.DeleteCategory(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Delete Category"); 
 	 System.out.println("Delete Category is executed successfully ");
 	 
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
	   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 }
  
/*  @AfterSuite
 public void afterSu() {
      report.close();
  }*/
}
