package com.excelfile;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	
	public ExcelUtils(String excelPath, String sheetName) {
	
		try {
		projectpath = System.getProperty("user.dir");

		workbook = new XSSFWorkbook(projectpath+excelPath);
		sheet = workbook.getSheet(sheetName);
		}catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		getRowCount();
//		getDatanumber(1,4);
//		getDatastring(1,2);
	}

	public static int getRowCount() {
		int rowCount=0;
		try {			
			sheet = workbook.getSheet("List");

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Total number of row count : "+rowCount);

		}catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;
	}
	
	public static int getColCount() {
		int colCount = 0;
		try {			
			sheet = workbook.getSheet("List");

			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Total number of Column count : "+colCount);

		}catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;
	}

	public String getDatastring(int rowNum, int colNum) {

		
			System.out.println("Project path :"+projectpath);

			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("Cell data :"+cellData);
			return cellData;
		
	}
	
	public void getDatanumber(int rowNum, int colNum) {

		try {

			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("Cell data :"+cellData);
		}catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}
