package com.peace;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SelfConsious {

	public static void main(String[] args) throws IOException {
		
	File f = new File("C:\\Users\\Greens-11\\Desktop\\Naga\\Trees\\Xcl\\State bank.xlsx");
	
	FileInputStream fi = new  FileInputStream (f);
	
	Workbook wbk = new XSSFWorkbook(fi);
	
	Sheet s = wbk.getSheet("Sheet1");
	
	for(int a=0;a<s.getPhysicalNumberOfRows();a++) {
		
	Row r = s.getRow(a);
	
	for(int z=0;z<r.getPhysicalNumberOfCells();z++) {
	
	Cell c = r.getCell(z);
	String st = c.getStringCellValue();
	System.out.println(st);
	
	}
	}
}}
