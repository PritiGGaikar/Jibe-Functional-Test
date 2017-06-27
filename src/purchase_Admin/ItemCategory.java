package purchase_Admin;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class ItemCategory  extends RW{

	 

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
	public void ItemCategorys(WebDriver driver1) throws Exception {  //(priority=33)

		WebDriver driver = driver1;
		
		
		 
	     ArrayList<Row> row= OR_Purchase_m.searchSheet("ItemCategoryURL",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	     ArrayList<Row> row1=input_purc_m.searchSheet("ItemCategoryURL", 2,0);//Functn key, sheet no,//test data excel
	 	
	     
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
	

	public void AddNewCategory(WebDriver driver1) throws Exception {  //(priority=34)

		WebDriver driver = driver1;
		           
		 ArrayList<Row> row= OR_Purchase_m.searchSheet("AddNewCategory",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	     ArrayList<Row> row1=input_purc_m.searchSheet("AddNewCategory", 2,0);//Functn key, sheet no,//test data excel
	 	



		    
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
								 // strValue=row1.get(j).getCell(2).toString();
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
							/*if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {

								String Value = "";

								switch (row.get(i + 1).getCell(2).getCellTypeEnum()) {

								case NUMERIC:
									Value = String.valueOf(row.get(i + 1).getCell(2).getNumericCellValue());
									break;
								case STRING:
									Value = row.get(i + 1).getCell(2).getStringCellValue();
									break;
								case BOOLEAN:
									Value = String.valueOf(row.get(i + 1).getCell(2).getBooleanCellValue());
									break;
								default:
									Value = row.get(i + 1).getCell(2).getStringCellValue();
									break;
								}

								if (Value != "") {
									sendkeys(driver, "id", strControl, Value);

									Thread.sleep(1000);
								}
							}*/
															
							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, "id", strControl, strValue); 
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, "id", strControl); 
								Alert(driver);
								Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								driver.get(strValue); 
								Thread.sleep(2000);

							}

							
							if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

								click_element(driver, "id", strControl);
							 WindowSwitchto(driver);
							 Thread.sleep(2000);
							}

							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, "id", strControl); 																										
								Thread.sleep(2000);
							}

							/*if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
								 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}*/
							if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

								dropdownCheckbox(driver, "id", strControl,strControl,strControl);
			                      Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

							 frameSwitchto(driver, "id", strControl);
			                      Thread.sleep(2000);
							
					}
							if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
							uploadFile(driver,"id", strControl, strControl,strValue, strControl, strControl);
							   Thread.sleep(2000);
								
							}
							
							/*if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

								 gettext(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}*/
					}
			}
			}
			}
	
	
	

		
		/*click_element(driver, "id","ctl00_MainContent_ImgAdd"); //Click on Add Category
		Thread.sleep(2000);	
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);	
		
		//Alert handling for Please Select the Category Type
		 Alert alert = driver.switchTo().alert();            //Alert handling for Please Select the Category Type
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
	     
		
		sendkeys(driver,"id", "ctl00_MainContent_TxtCatName", "JibeCategory"); //Sendkeys for Category Name 
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);	
		
		//Alert handling for Please Select the Category Type
		 Alert alert1 = driver.switchTo().alert();            //Alert handling for Please Select the Category Type
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     Thread.sleep(2000);
		
		 dropdown(driver, "id", "ctl00_MainContent_ddlcatType","ItemCategory");// Dropdown -->Category Type  -->ItemCategory
		 Thread.sleep(1000);
		
		 click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);		
			
			//Alert handling for Please enter Functions Short Name
			 Alert alert2= driver.switchTo().alert();            //Alert handling for Please enter Functions Short Name
		     String Alert2 = alert2.getText();    	   
		     System.out.println("Alert msg for:"+Alert2);
		     alert2.accept();
		     Thread.sleep(2000);
		
		sendkeys(driver,"id", "ctl00_MainContent_TxtShrtName", "22"); //Sendkeys for Category Short Code
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(2000);	
		

		//Alert handling forItem Category Added
		 Alert alert3= driver.switchTo().alert();            //Alert handling for Item Category Added
	     String Alert3 = alert3.getText();    	   
	     System.out.println("Alert msg for:"+Alert3);
	     alert3.accept();
	     Thread.sleep(2000);
	
	     //-----------Search Added-----------------//
	     
	    click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(2000);	
		
		sendkeys(driver,"id", "ctl00_MainContent_txtSearchName", "JibeCategory"); //Sendkeys for Item Category Name
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
		Thread.sleep(2000);	*/
		
		public void EditNewCategory(WebDriver driver1) throws Exception {  //(priority=34)

			WebDriver driver = driver1;	
			
			
			 ArrayList<Row> row= OR_Purchase_m.searchSheet("EditNewCategory",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
		     ArrayList<Row> row1=input_purc_m.searchSheet("EditNewCategory", 2,0);//Functn key, sheet no,//test data excel
		 	


			    
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
									try{
									dropdown(driver, "id", strControl, strValue);
									Thread.sleep(2000);
									}
				                    catch(Exception e) {  
				                    	System.out.println("Dropdown_Null_value");
								        }
									
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
								if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
									driver.get(strValue); 
									Thread.sleep(2000);

								}

								
								if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

									click_element(driver, "id", strControl);
								 WindowSwitchto(driver);
								 Thread.sleep(2000);
								}

								
								if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
									clear_element(driver, "id", strControl); 																										
									Thread.sleep(2000);
								}

								
								if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

									dropdownCheckbox(driver, "id", strControl,strControl,strControl);
				                      Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

								 frameSwitchto(driver, "id", strControl);
				                      Thread.sleep(2000);
								
						}
						}
				}
				}
				}
		
		/*
		click_element(driver, "id","ctl00_MainContent_rgdItmCat_ctl02_ImgUpdate"); //Click on Edit
		Thread.sleep(2000);	
		
		clear_element(driver, "id", "ctl00_MainContent_TxtCatName");// Clear Category Name
		Thread.sleep(1000);
			
		sendkeys(driver,"id", "ctl00_MainContent_TxtCatName", "JibeDevelopment"); //Sendkeys for Category Name
		Thread.sleep(2000);
		
		click_element(driver, "id","ctl00_MainContent_ImgSave"); //Click on Save
		Thread.sleep(3000);
		
		//Alert handling for Item Category Updated Successfully
		 Alert alert3= driver.switchTo().alert();            //Alert handling for Item Category Updated Successfully
	     String Alert3 = alert3.getText();    	   
	     System.out.println("Alert msg for:"+Alert3);
	     alert3.accept();
	     Thread.sleep(2000);
	     
	     //------Search Eddited----------------//
	     
	   
		click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(2000);	
			
		sendkeys(driver,"id", "ctl00_MainContent_txtSearchName", "JibeDevelopment"); //Sendkeys for Item Category Name
		Thread.sleep(1000);
			
		click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
		Thread.sleep(2000);	  
	}*/
		public void DeleteCategory(WebDriver driver1) throws Exception {  //(priority=34)

			WebDriver driver = driver1;	
			
			 ArrayList<Row> row= OR_Purchase_m.searchSheet("DeleteCategory",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
		     ArrayList<Row> row1=input_purc_m.searchSheet("DeleteCategory", 2,0);//Functn key, sheet no,//test data excel
		 	


			    
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
									try{
									dropdown(driver, "id", strControl, strValue);
									Thread.sleep(2000);
									}
				                    catch(Exception e) {  
				                    	System.out.println("Dropdown_Null_value");
								        }
									
								}

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver, "id", strControl, strValue); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, "id", strControl); 
									Alert(driver);
									Thread.sleep(2000);
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

		/*
		click_element(driver, "id","ctl00_MainContent_rgdItmCat_ctl02_ImgDelete"); //Click on Delete
		Thread.sleep(2000);	
		
		//Alert handling for Are you sure want to delete?
		 Alert alert3= driver.switchTo().alert();            //Alert handling for Are you sure want to delete?
	     String Alert3 = alert3.getText();    	   
	     System.out.println("Alert msg for:"+Alert3);
	     alert3.accept();
	     Thread.sleep(2000);
	     
	   //Alert handling for Please enter Functions Short Name
		 Alert alert2= driver.switchTo().alert();            //Alert handling for Please enter Functions Short Name
	     String Alert2 = alert2.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     Thread.sleep(2000);
	     
	     //------Search Deleted----------------//
	     
		   
		click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(2000);	
				
		sendkeys(driver,"id", "ctl00_MainContent_txtSearchName", "JibeDevelopment"); //Sendkeys for Item Category Name
		Thread.sleep(1000);
				
		click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
		Thread.sleep(2000);	  
		
		String Record = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_rgdItmCat']/tbody/tr/td")).getText(); // Record
		Thread.sleep(1000);	
			    
		System.out.println(""+ Record);
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_ImgExpExcel"); //Click on Export to Excel
		Thread.sleep(2000);
		}
}
*/