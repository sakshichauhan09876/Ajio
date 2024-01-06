package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {

	
	//access the data from credentials
	public String DataFromPropertiesFile(String Key) throws Throwable{
		File file=new File("./src/main/resources/Credentials.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties pro=new Properties();
		pro.load(fis);
		String value=pro.getProperty(Key);
		return Key;
		
	}
	public String DataFromExcelFile(String Sheetname,int Rownum,int colNum) throws Throwable {
		File file=new File("./src/main/resources/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook Workbook=WorkbookFactory.create(fis);
		
		Sheet sheet=Workbook.getSheet(Sheetname);
		Row row=sheet.getRow(Rownum);
		DataFormatter formatter=new DataFormatter();
		String value=formatter.formatCellValue(row.getCell(colNum));
		return value;
		
	}
	
	public Object [][] accessAlladdress() throws Throwable{
		
		System.out.println("second test case");
		File file=new File(IPathConstant.Excelpath);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		Object[][] ref=new Object[sheet.getLastRowNum()][9];
		
		DataFormatter form=new DataFormatter();
				int count=0;
				for(int i=1;i<=sheet.getLastRowNum();i++) {
					for(int j=1; j<sheet.getRow(i).getLastCellNum();j++) {
						ref[count][j]=form.formatCellValue(sheet.getRow(i).getCell(j)).toString();
					}
					count++;
				}
		
		
		return ref;
		
	}
	
}
