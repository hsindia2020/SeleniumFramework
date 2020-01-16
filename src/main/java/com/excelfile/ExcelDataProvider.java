package com.excelfile;

import org.apache.poi.hssf.record.chart.EndRecord;
import org.apache.poi.ss.format.CellDateFormatter;
import org.testng.internal.TestMethodWithDataProviderMethodWorker;

public class ExcelDataProvider {
	
	public static void main(String[] args) {
		
		String ExcelPath = "/excel/ABHI.xlsx";
		String SheetName = "List";
		
		testdata(ExcelPath,SheetName);
	}

	public static void testdata(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		String cellData = null;
		for(int i = 1; i< rowCount; i++)
		{
				for(int j = 0; j<colCount; j++)
				{
					cellData = excel.getDatastring(i, j);
					System.out.print(cellData+"||");
//					if (cellData == "Karnataka") {
//						break;
//						}
				}
				System.out.println();
 
		}
	}
}
