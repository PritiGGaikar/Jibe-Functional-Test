package purchase_Admin;

import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class UnitPackings  extends RW{

	 
	 
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

	public void UnitPacking(WebDriver driver1) throws Exception {  //(priority=11)

		WebDriver driver = driver1;
		

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("UnitPackingURL",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	     ArrayList<Row> row1=input_purc_m.searchSheet("UnitPackingURL", 2,0);//Functn key, sheet no,//test data excel
	 	
	    
	    
	    
	    
	    

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
	
	
	
	
						
		
	

	public void AddUnitPacking(WebDriver driver1) throws Exception {  //(priority=12)

		WebDriver driver = driver1;
		

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("AddUnitPacking",2,9);//Functn key,sheetNo.,Column no.// Xpath locator

	     ArrayList<Row> row1=input_purc_m.searchSheet("AddUnitPacking",2,0);//Functn key, sheet no,//test data excel
	 	
	    
	    
	    


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
	
	
	
	


	public void EditUnitPacking(WebDriver driver1) throws Exception {  //(priority=13)

		WebDriver driver = driver1;
		  ArrayList<Row> row= OR_Purchase_m.searchSheet("EditUnitPacking",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
		     ArrayList<Row> row1=input_purc_m.searchSheet("EditUnitPacking",2,0);//Functn key, sheet no,//test data excel
		 	
		    
		    
		    
		    
		    
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
								
								
								
						}
				}
				}
				}
		
	
	public void DeletetUnitPacking(WebDriver driver1) throws Exception {  //(priority=14)

		WebDriver driver = driver1;
		
		  ArrayList<Row> row= OR_Purchase_m.searchSheet("DeletetUnitPacking",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
		     ArrayList<Row> row1=input_purc_m.searchSheet("DeletetUnitPacking", 2,0);//Functn key, sheet no,//test data excel
		 	
		    
		    
		    
		    
		    
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
				}}