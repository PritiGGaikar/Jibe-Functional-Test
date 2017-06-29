package purchase_Admin;



import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;

import org.openqa.selenium.WebDriver;



import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class Location extends RW{

	 
	 
	/*Technical
	PMS
	CopyRunHour*/
	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	    	report = new ExtentReports(path.concat("Report\\Purchase_Admin_Report.html"));
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}
	

	public void Locations(WebDriver driver1) throws Exception {  //(priority=11)

		WebDriver driver = driver1;
		

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("Location",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	     ArrayList<Row> row1=input_purc_m.searchSheet("Location", 2,0);//Functn key, sheet no,//test data excel
	 	
	    
	    
	    
	    
	    

			for(int i=0;i<row.size();i++)
			{
				String strValue=""; 
				String strControl=row.get(i).getCell(2).getStringCellValue();
				 for(int j=0;j<row1.size();j++)
				 {
					 if(row.get(i).getCell(0)!=null)
						{
						
						 	if(row1.get(j).getCell(1)!=null)
							{
							  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
							  {
								  strValue=row1.get(j).getCell(2).toString();
								  
								  switch(row1.get(j).getCell(2).getCellTypeEnum()){
								     
								     case NUMERIC: 
								    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								    	 break;
								     case STRING:
								    	 strValue=row1.get(j).getCell(2).getStringCellValue();
								    	 break;
								     case BOOLEAN:
								    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								    	 break;
								     default:
								    	 strValue=row1.get(j).getCell(2).getStringCellValue();
								    	 break;
								     }
								     
							  }
							}
						}
				 
				 }
				 
				
					
					if(row.get(i).getCell(10)!=null)
					{
							
						
						String strControlTypeKey=row.get(i).getCell(10).toString();

						if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
							if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
								click_element(driver, "id", strControl); 
								Thread.sleep(2000);
							}


							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								driver.get(strValue); 
								Thread.sleep(2000);

							}

						
							
							
			}
					}}
			}
	
	
	 public void AddNewLocation(WebDriver driver1) throws Exception {  //(priority=26)

			WebDriver driver = driver1;
			
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("AddNewLocation",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("AddNewLocation", 2,0);//Functn key, sheet no, test data excel
			 	 
			for(int i=0;i<row.size();i++)
			{
				String strValue=""; 
				String strControl=row.get(i).getCell(2).getStringCellValue();
				 for(int j=0;j<row1.size();j++)
				 {
					 if(row.get(i).getCell(0)!=null)
						{
						
						 	if(row1.get(j).getCell(1)!=null)
							{
							  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
							  {
								  strValue=row1.get(j).getCell(2).toString();
								  
								  switch(row1.get(j).getCell(2).getCellTypeEnum()){
								     
								     case NUMERIC: 
								    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								    	 break;
								     case STRING:
								    	 strValue=row1.get(j).getCell(2).getStringCellValue();
								    	 break;
								     case BOOLEAN:
								    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								    	 break;
								     default:
								    	 strValue=row1.get(j).getCell(2).getStringCellValue();
								    	 break;
								     }
								     
							  }
							}
						}
				 
				 }
				 
				
					
					if(row.get(i).getCell(10)!=null)
					{
							
						
						String strControlTypeKey=row.get(i).getCell(10).toString();

						if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
							
							if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
								
								click_element(driver, "id", strControl); 
								Thread.sleep(4000);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
								
								dropdown(driver, "id", strControl, strValue);
								Thread.sleep(2000);
																
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								
								sendkeys(driver, "id", strControl, strValue); 
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								
								click_element(driver, "id", strControl); 
								Alert(driver);
								Thread.sleep(2000);
							}
							
							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								
								clear_element(driver, "id", strControl); 																										
								Thread.sleep(2000);
							}
								
					}
			}
			}
			}
	 
	 
	 public void EditLocation(WebDriver driver1) throws Exception {  //(priority=26)

			WebDriver driver = driver1;
			
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("EditLocation",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("EditLocation", 2,0);//Functn key, sheet no, test data excel
			 	 
			for(int i=0;i<row.size();i++)
			{
				String strValue=""; 
				String strControl=row.get(i).getCell(2).getStringCellValue();
				 for(int j=0;j<row1.size();j++)
				 {
					 if(row.get(i).getCell(0)!=null)
						{
						
						 	if(row1.get(j).getCell(1)!=null)
							{
							  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
							  {
								  strValue=row1.get(j).getCell(2).toString();
								  
								  switch(row1.get(j).getCell(2).getCellTypeEnum()){
								     
								     case NUMERIC: 
								    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								    	 break;
								     case STRING:
								    	 strValue=row1.get(j).getCell(2).getStringCellValue();
								    	 break;
								     case BOOLEAN:
								    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								    	 break;
								     default:
								    	 strValue=row1.get(j).getCell(2).getStringCellValue();
								    	 break;
								     }
								     
							  }
							}
						}
				 
				 }
				 
				
					
					if(row.get(i).getCell(10)!=null)
					{
							
						
						String strControlTypeKey=row.get(i).getCell(10).toString();

						if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
							
							if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
								
								click_element(driver, "id", strControl); 
								Thread.sleep(4000);
																
							}							

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, "id", strControl, strValue); 
								Thread.sleep(2000);
							}

							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, "id", strControl); 																										
								Thread.sleep(2000);
							}

							
					}
			}
			}
			}
	 
	 
	 public void DeleteLocation(WebDriver driver1) throws Exception {  //(priority=26)

			WebDriver driver = driver1;
			
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("DeleteLocation",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("DeleteLocation", 2,0);//Functn key, sheet no, test data excel
			 	 
			    for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, "id", strControl); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
									
									dropdown(driver, "id", strControl, strValue);
									Thread.sleep(2000);
									
								}

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver, "id", strControl, strValue); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, "id", strControl); 
									Alert(driver);
									Thread.sleep(2000);
								}
								
					
								
								if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
									clear_element(driver, "id", strControl); 																										
									Thread.sleep(2000);
								}
								
								if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
									gettext(driver,"xpath", strControl);
				                      Thread.sleep(2000);
									
									
									}


								
								
								
						}
				}
				}
				}
			}
				
	/*public void Locations(WebDriver driver1) throws InterruptedException {  //(priority=5)

		WebDriver driver = driver1;
		
		

	     driver.get("http://192.168.1.102/JIBE/purchase/Location.aspx");      //Purchase-->Admin-->Location
	     Thread.sleep(2000);
	     
	 	String actualTitle = driver.getTitle().trim();
	 	String expectedTitle = " 	Locations ".trim();
	 	Assert.assertEquals(expectedTitle,actualTitle);
		
	 	if(expectedTitle.equals(actualTitle)){
	 		System.out.println("Title Match");
	 		Thread.sleep(2000);
	 	}	else{
	 		System.out.println("Title does not Match");
	 		Thread.sleep(2000);	
	 		
	 	}
		WebElement technical = driver.findElement(By.linkText(data.getData(5,2,2))); // pathfor "Purchase"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();	
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(5,3,2)));// path for Admin																				
		Admin.click();		
		action.moveToElement(Admin).build().perform();
		Thread.sleep(3000);

		WebElement Location  = driver.findElement(By.linkText(data.getData(5,33,2))); // path for Location 
		Location.click();    	
		Thread.sleep(2000);
		
	}
	public void AddNewLocation(WebDriver driver1) throws Exception  {  //(priority=6)

		WebDriver driver = driver1;
		
		click_element(driver, "id",(data.getData(5,34,2))); //Click on AddNewLocation
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,35,2)), (data.getData(5,36,2))); //Sendkeys for Short Code-->
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,37,2))); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for  enter Short Description.
		 Alert alert = driver.switchTo().alert();            //Alert handling for  enter Short Description.
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(1000);
		
	     
	     sendkeys(driver,"id", (data.getData(5,38,2)), (data.getData(5,39,2))); //Sendkeys for Short Description
	     Thread.sleep(1000);
	     
	     sendkeys(driver,"id", (data.getData(5,40,2)), (data.getData(5,41,2))); //Sendkeys for Long Description
	     Thread.sleep(1000);
	     
	     sendkeys(driver,"id", (data.getData(5,42,2)), (data.getData(5,43,2))); //Sendkeys for No. Of Location
	     Thread.sleep(1000);
	     
	     dropdown(driver, "id", (data.getData(5,44,2)),(data.getData(5,45,2)));// Dropdown -->Vessel Type -->Test
		 Thread.sleep(1000);
		 
		 click_element(driver, "id",(data.getData(5,46,2))); //Click on Save
		 Thread.sleep(7000);
		
	}
	
	public void EditLocation(WebDriver driver1) throws Exception  {  //(priority=7)

		WebDriver driver = driver1;
		 click_element(driver, "id",(data.getData(5,47,2))); //Click on Refresh
		 Thread.sleep(1000);
		 
		 clear_element(driver, "id",(data.getData(5,48,2)));// Clear Short Code / Desc
		 Thread.sleep(1000);
		 
		 sendkeys(driver,"id", (data.getData(5,49,2)), (data.getData(5,50,2))); //Sendkeys for Short Code / Desc->
		 Thread.sleep(1000);
			
		 click_element(driver, "id",(data.getData(5,51,2))); //Click on Search
		 Thread.sleep(1000);
		 
		 click_element(driver, "id",(data.getData(5,52,2))); //Click on Edit
		 Thread.sleep(2000);
		 
		 clear_element(driver, "id", (data.getData(5,53,2)));// Clear Short Description 
		 Thread.sleep(1000);
		 
		 sendkeys(driver,"id", (data.getData(5,54,2)), (data.getData(5,55,2))); //Sendkeys for Short Description 
		 Thread.sleep(1000);
		 
		 click_element(driver, "id",(data.getData(5,56,2))); //Click on Save
		 Thread.sleep(2000);
		 
		 
			//----------------Search Edited Location--------------//
			 click_element(driver, "id",(data.getData(5,47,2))); //Click on Refresh
			 Thread.sleep(1000);
			 
			 clear_element(driver, "id",(data.getData(5,48,2)));// Clear Short Code / Desc
			 Thread.sleep(1000);
			 
			 sendkeys(driver,"id", (data.getData(5,49,2)), (data.getData(5,50,2))); //Sendkeys for Short Code / Desc->
			 Thread.sleep(1000);
				
			 click_element(driver, "id",(data.getData(5,51,2))); //Click on Search
			 Thread.sleep(1000);
	}
	
		 public void DeleteLocation(WebDriver driver1) throws Exception  {  //(priority=8)

				WebDriver driver = driver1;
		 
		 click_element(driver, "id",(data.getData(5,57,2))); //Click on Delete
		 Thread.sleep(2000);
		 
		//Alert handling for  Delete
		 Alert alert = driver.switchTo().alert();            //Alert handling for  Delete
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(4000);
			
	     click_element(driver, "id",(data.getData(5,58,2))); //Click on Refresh
		 Thread.sleep(2000);
		 
		 clear_element(driver, "id",(data.getData(5,48,2)));// Clear Short Code / Desc
		 Thread.sleep(1000);
		 
		 sendkeys(driver,"id", (data.getData(5,49,2)), (data.getData(5,50,2))); //Sendkeys for Short Code / Desc->
		 Thread.sleep(1000);
			
		 click_element(driver, "id",(data.getData(5,51,2))); //Click on Search
		 Thread.sleep(1000);

		String Record = driver.findElement(By.xpath(data.getData(5,60,2))).getText(); // Record
		Thread.sleep(1000);	
		    
		 System.out.println(""+ Record);
		 Thread.sleep(1000);
		 
		 click_element(driver, "id",(data.getData(5,59,2))); //Click on Export to Excel
		 Thread.sleep(2000);
			
		
	}	
}
*/