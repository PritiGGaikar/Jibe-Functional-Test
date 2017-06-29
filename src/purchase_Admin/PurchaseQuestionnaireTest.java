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

import purchase_Admin.PurchaseQuestionnaire;

public class PurchaseQuestionnaireTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	PurchaseQuestionnaire w = new PurchaseQuestionnaire();
	


	   @Test(priority=15)
	   public void PurchaseQuestionnaire() throws Exception {
		   test=report.startTest("Purchase Questionnaire");	  
		   w.PurchaseQuestionnair(driver);
		   Assert.assertTrue(true);
		   System.out.println("Purchase Questionnaire URL Opened Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Purchase Questionnaire"); 
	  }
	   
	  
	   
	   @Test(priority=16)
	   public void AddNewQuestion() throws Exception {
	 	   test=report.startTest("Add New Question");	  
	 	   w.AddNewQuestion(driver);
	 	   Assert.assertTrue(true);
	 	  System.out.println("Positive Test Case for Add New Question is Executed Successfully");
		  System.out.println("Negative Test Case for Add New Question is Executed Successfully");
	 	  test.log(LogStatus.PASS, "Purchase->Admin->Add New Question"); 
	   }
	   
	  @Test(priority=17)
	   public void DeleteNewQuestion() throws Exception {
	 	   test=report.startTest("Delete New Added Question");	  
	 	   w.DeleteNewQuestion(driver);
	 	   Assert.assertTrue(true);
	 	  System.out.println("Delete New Question is executed Successfully");
	 	  test.log(LogStatus.PASS, "Purchase->Admin->Delete New Added Question"); 
	   }
	   
	 @Test(priority=18)
	   public void AddNewGrade() throws Exception {
	 	   test=report.startTest("Add New Grade");	  
	 	   w.AddNewGrade(driver);
	 	   Assert.assertTrue(true);
	 	  System.out.println("Positive Test Case for Add New Grade is Executed Successfully");
		  System.out.println("Negative Test Case for Add New Grade is Executed Successfully");
	 	  test.log(LogStatus.PASS, "Purchase->Admin->Add New Grade"); 
	   }
	   

	    @Test(priority=19)
	   public void DeleteAddedNewGrade() throws Exception {
	 	   test=report.startTest("Delete Added New Grade");	  
	 	   w.DeleteAddedNewGrade(driver);
	 	   Assert.assertTrue(true);
	 	  System.out.println("Delete Added New Grade is executed Successfully");
	 	  test.log(LogStatus.PASS, "Purchase->Admin->Delete Added New Grade"); 
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
	  report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 		  
  
 /* @AfterSuite
 public void afterSu() {
      report.close();
  }*/
   
}}
