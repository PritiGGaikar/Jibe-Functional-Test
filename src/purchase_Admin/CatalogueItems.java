package purchase_Admin;

import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import common_Function.RW;

public class CatalogueItems extends RW{
	private static ExtentReports report;

	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	    	report = new ExtentReports(path.concat("Report.html"));
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
		}
		
		
	public void ManageSystems(WebDriver driver1) throws Exception { // (priority=26)

		WebDriver driver = driver1;

		ArrayList<Row> row= OR_Purchase_m.searchSheet("ManageSystem",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	    ArrayList<Row> row1=input_purc_m.searchSheet("ManageSystem", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
					driver.get(strValue);
					Thread.sleep(2000);

				}

			}
		}
	}
	
	 public void NegativeTestCaseAddCatalogue(WebDriver driver1) throws Exception {  //(priority=26)

			WebDriver driver = driver1;
			
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("NegativeTestCaseAddCatalogue",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("NegativeTestCaseAddCatalogue", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
						

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
					}
					
                    if (strControlTypeKey.compareTo("Click_Ctrl1") == 0) {
						

						click_element(driver, "class", strControl);
						Thread.sleep(6000);
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
						Thread.sleep(2000);
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
	 
	 
	 public void PositiveTestCaseAddCatalogue(WebDriver driver1) throws Exception {  //(priority=26)

			WebDriver driver = driver1;
			
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("PositiveTestCaseAddCatalogue",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("PositiveTestCaseAddCatalogue", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
						

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
					}
					
                 if (strControlTypeKey.compareTo("Click_Ctrl1") == 0) {
						

						click_element(driver, "class", strControl);
						Thread.sleep(6000);
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
						Thread.sleep(2000);
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
	 
	 
	 public void EditCatalogue(WebDriver driver1) throws Exception {  //(priority=26)

			WebDriver driver = driver1;
			
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("EditCatalogue",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("EditCatalogue", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
						

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
					}
					
                 if (strControlTypeKey.compareTo("Click_Ctrl1") == 0) {
						

						click_element(driver, "class", strControl);
						Thread.sleep(6000);
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
						Thread.sleep(2000);
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
	 
	 
	 
	 public void NegativeTestCaseAddSubCatalogue(WebDriver driver1) throws Exception {  //(priority=26)

			WebDriver driver = driver1;
			
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("NegativeTestCaseAddSubCatalogue",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("NegativeTestCaseAddSubCatalogue", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
						

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
					}
					
              if (strControlTypeKey.compareTo("Click_Ctrl1") == 0) {
						

						click_element(driver, "class", strControl);
						Thread.sleep(6000);
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
						Thread.sleep(2000);
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
	 
	 public void PositiveTestCaseAddSubCatalogue(WebDriver driver1) throws Exception {  //(priority=26)

			WebDriver driver = driver1;
			
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("PositiveTestCaseAddSubCatalogue",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("PositiveTestCaseAddSubCatalogue", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
						

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
					}
					
           if (strControlTypeKey.compareTo("Click_Ctrl1") == 0) {
						

						click_element(driver, "class", strControl);
						Thread.sleep(6000);
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
						Thread.sleep(2000);
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
	 
	 
	
	 
	 
	/* 
	public void AddSubCatalogue(WebDriver driver1) throws Exception { // (priority=26)

		WebDriver driver = driver1;
		
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("AddSubCatalogue",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("AddSubCatalogue", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
					}

					if (strControlTypeKey.compareTo("Click_Ctrl1") == 0) {

						click_element(driver, "class", strControl);
						Thread.sleep(6000);
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

						click_element(driver, "xpath", strControl);
						Thread.sleep(2000);
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
	}*/
	
	
	public void EditSubCatalogue(WebDriver driver1) throws Exception { // (priority=26)

		WebDriver driver = driver1;
		
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("EditSubCatalogue",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("EditSubCatalogue", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
					}

					if (strControlTypeKey.compareTo("Click_Ctrl1") == 0) {

						click_element(driver, "class", strControl);
						Thread.sleep(6000);
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

						click_element(driver, "xpath", strControl);
						Thread.sleep(2000);
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
	
	
	
	public void NegativeTestCaseAddStoresItems(WebDriver driver1) throws Exception { // (priority=26)

		WebDriver driver = driver1;
		
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("NegativeTestCaseAddStoresItems",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("NegativeTestCaseAddStoresItems", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
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

						click_element(driver, "xpath", strControl);
						Thread.sleep(2000);
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
	
	
	public void PositiveTestCaseAddStoresItems(WebDriver driver1) throws Exception { // (priority=26)

		WebDriver driver = driver1;
		
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("PositiveTestCaseAddStoresItems",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("PositiveTestCaseAddStoresItems", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
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

						click_element(driver, "xpath", strControl);
						Thread.sleep(2000);
						Alert(driver);
						Thread.sleep(4000);
					}

					if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {

						clear_element(driver, "id", strControl);
						Thread.sleep(2000);
					}
										
				}
			}
		}
	}
	
	
	public void EditStoresItem(WebDriver driver1) throws Exception { // (priority=26)

		WebDriver driver = driver1;
		
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("EditStoresItem",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("EditStoresItem", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
					}

					if (strControlTypeKey.compareTo("Click_Ctrl1") == 0) {

						click_element(driver, "class", strControl);
						Thread.sleep(6000);
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

						click_element(driver, "xpath", strControl);
						Thread.sleep(2000);
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
	
	
	public void DeleteStoresItem(WebDriver driver1) throws Exception { // (priority=26)

		WebDriver driver = driver1;
		
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("DeleteStoresItem",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("DeleteStoresItem", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
					}

					if (strControlTypeKey.compareTo("Click_Ctrl1") == 0) {

						click_element(driver, "class", strControl);
						Thread.sleep(6000);
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

						click_element(driver, "xpath", strControl);
						Thread.sleep(2000);
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
	
	
	public void DeleteSubCatalogue(WebDriver driver1) throws Exception { // (priority=26)

		WebDriver driver = driver1;
		
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("DeleteSubCatalogue",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("DeleteSubCatalogue", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
					}

					if (strControlTypeKey.compareTo("Click_Ctrl1") == 0) {

						click_element(driver, "class", strControl);
						Thread.sleep(6000);
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

						click_element(driver, "xpath", strControl);
						Thread.sleep(2000);
						Alert(driver);
						Thread.sleep(4000);
						Alert(driver);
					}

					if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {

						clear_element(driver, "id", strControl);
						Thread.sleep(2000);
					}

				}
			}
		}
	}
	
	public void DeleteCatalogue(WebDriver driver1) throws Exception { // (priority=26)

		WebDriver driver = driver1;
		
			  ArrayList<Row> row= OR_Purchase_m.searchSheet("DeleteCatalogue",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			    ArrayList<Row> row1=input_purc_m.searchSheet("DeleteCatalogue", 2,0);//Functn key, sheet no, test data excel
			 	 
		for (int i = 0; i < row.size(); i++) {
			String strValue = "";
			String strControl = row.get(i).getCell(2).getStringCellValue();
			for (int j = 0; j < row1.size(); j++) {
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
						if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
							strValue = row1.get(j).getCell(2).toString();

							switch (row1.get(j).getCell(2).getCellTypeEnum()) {

							case NUMERIC:
								strValue = String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								break;
							case STRING:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							case BOOLEAN:
								strValue = String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								break;
							default:
								strValue = row1.get(j).getCell(2).getStringCellValue();
								break;
							}

						}
					}
				}

			}

			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {

					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {

						click_element(driver, "xpath", strControl);
						Thread.sleep(6000);
					}

					if (strControlTypeKey.compareTo("Click_Ctrl1") == 0) {

						click_element(driver, "class", strControl);
						Thread.sleep(6000);
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

						click_element(driver, "xpath", strControl);
						Thread.sleep(2000);
						Alert(driver);
						Thread.sleep(4000);
						Alert(driver);
						
					}

					if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {

						clear_element(driver, "id", strControl);
						Thread.sleep(2000);
					}

				}
			}
		}
	}
		
	}
