package com.resources;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
	
	
	public static WebDriver driver;
	
	public  static void fill(WebElement e, String value) {
		e.sendKeys(value);
		
	}

	public static void btnClick(WebElement e) {
		e.click();
			}
	public static void launch(String url) {
driver.get(url);
		
		
	}
	
	//using hashmap	
	public static List<HashMap<String,String>> getData() {
		List<HashMap<String,String>> mpLists=new ArrayList<HashMap<String,String>>();		
		try {			
			File loc=new File("D:\\gow\\MavenProject3\\Excel\\New Microsoft Office Excel Worksheet (2).xlsx");
			FileInputStream stream=new FileInputStream(loc);
			Workbook w=new XSSFWorkbook(stream);
			Sheet s = w.getSheet("Sheet1");
			Row headerRow = s.getRow(0);
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				Row currentRow = s.getRow(i);
				
				HashMap<String,String> mpdatas=new HashMap<String,String>();
				for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
					
					Cell c = currentRow.getCell(j);
					
					switch (c.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						mpdatas.put(headerRow.getCell(j).getStringCellValue(), c.getStringCellValue());
						break;
						
						
					case Cell.CELL_TYPE_NUMERIC:
						
						mpdatas.put(headerRow.getCell(j).getStringCellValue(),String.valueOf(c.getNumericCellValue()));
						break;
						
					}
					
				}
				mpLists.add(mpdatas);
			}}
			catch(Throwable e) {
				e.printStackTrace();
				
			}
			return mpLists;
		
				
	}}