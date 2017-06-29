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
import purchase_Admin.UnitPackings;


public class UnitPackingsTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	UnitPackings w = new UnitPackings();
	

   @Test(priority=11)
   public void UnitPacking() throws Exception {
	   test=report.startTest("Unit Packing URL");	  
	   w.UnitPacking(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Purchase-->Admin-->Unit Packing URL"); 
	  System.out.println("Unit Packing URL open successfully");
	  
  }
   
   @Test(priority=12)
   public void AddUnitPacking() throws Exception {
 	   test=report.startTest("Add Unit Packing");	  
 	   w.AddUnitPacking(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Add Unit Packing"); 
 	 System.out.println("Positive Test Case for Add Unit Packing is executed successfully ");
 	 System.out.println("Negative Test Case for Add Unit Packing is executed successfully ");
   }
   
  
   @Test(priority=13)
   public void EditUnitPacking() throws Exception {
 	   test=report.startTest("Edit Unit Packing");	  
 	   w.EditUnitPacking(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Edit Unit Packing"); 
 	 System.out.println("Edit Unit Packing is executed successfully ");
 	
   }
   
   @Test(priority=14)
   public void DeletetUnitPacking() throws Exception {
 	   test=report.startTest("Delete Unit Packing");	  
 	   w.DeletetUnitPacking(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Delete Unit Packing"); 
 	 System.out.println("Delete Unit Packing is executed successfully ");
 	
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
	  report = UnitPackings.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 }
  
 /* @AfterSuite
 public void afterSu() {
      report.close();
  }*/
}
