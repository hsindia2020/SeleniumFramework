package com.excelfile;

public class ExcelDemo {

	public static void main(String[] args) {

		ExcelUtils excel = new ExcelUtils("/excel/ABHI.xlsx","List");
		
		excel.getDatanumber(1, 4);
		excel.getDatastring(0, 2);
		excel.getRowCount();
		excel.getColCount();
	}

}
