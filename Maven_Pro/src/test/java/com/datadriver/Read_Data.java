package com.datadriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	private static void read_Particular_Data() throws IOException
	{
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Pro\\Excel\\User_Name.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for(int i=0;i<numberOfRows;i++)
		{
			Row row = sheetAt.getRow(i);
			System.out.println("\n");
			int numberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0;j<numberOfCells;j++)
			{
				Cell cell = row.getCell(j);
//		for (Row row : sheetAt) {
			
//		for (Cell cell: row) {
				
//		Row row = sheetAt.getRow(1);
//		Cell cell = row.getCell(2);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.print("\t"+stringCellValue+"\t");
			
			
		}
		else if(cellType.equals(CellType.NUMERIC))
				{
			double numericCellValue = cell.getNumericCellValue();
			int data=(int) numericCellValue;
			System.out.println(data);
				}
	}

			
		}
		Row row1 = sheetAt.getRow(1);
		int numberOfCells = row1.getPhysicalNumberOfCells();
		System.out.println("\n oly row 1");
		for(int j=0;j<numberOfCells;j++)
		{
		
		System.out.println("\n"+row1.getCell(j));
		}
		System.out.println("only cell 0");
		for(int i=0;i<numberOfRows;i++)
		{
			Row row = sheetAt.getRow(i);
			
			System.out.println(row.getCell(0));
		}
		}
		
	
	public static void main(String[] args) throws IOException {
		read_Particular_Data();
	}
	
}
