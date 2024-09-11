package Testscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Data {
@DataProvider(name="logindata")
public String[][] getdata() throws IOException {
	File excel=new File(".\\DataExcelsheet\\TestDataBank.xlsx");
	System.out.println(excel.exists());
	FileInputStream fis=new FileInputStream(excel);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("BankingProjectData");
	int noofRows=sheet.getPhysicalNumberOfRows();
	int noofcolumns=sheet.getRow(0).getLastCellNum();
	String[][]Data=new String[noofRows-1][noofcolumns];
	for(int i=0;i<noofRows-1;i++) {
		for(int j=0;j<noofcolumns;j++) {
			DataFormatter df=new DataFormatter();
			Data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
		}
		System.out.println();
	}
	workbook.close();
	fis.close();
	return Data;
	
}
}
