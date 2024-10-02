package UTILITIES;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Datai {
	@DataProvider(name="Niv")
	public String[][] m() throws IOException {
	File f=new File("C:\\Users\\HP\\Desktop\\DataProvider.xlsx");

	FileInputStream fa=new FileInputStream(f);
	XSSFWorkbook book=new XSSFWorkbook(fa);
	XSSFSheet sheet=book.getSheet("Sheet1");
	int row=sheet.getLastRowNum();
	int cell=sheet.getRow(0).getLastCellNum();
	String[][] data=new String[row][cell];
	for(int i=0;i<row;i++) {
		data[i][0]=sheet.getRow(i+1).getCell(0).toString();
		data[i][1]=sheet.getRow(i+1).getCell(1).toString();
		
	}
	return data;
	
}}
