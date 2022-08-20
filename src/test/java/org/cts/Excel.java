package org.cts;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Kannan Nagaraj\\eclipse-workspace\\FRAMEWORK\\testdata\\driven.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
		Sheet s=w.getSheet("sheet1");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell cell = r.getCell(j);
				int cellType = cell.getCellType();
				if(cellType==1) {
					String v = cell.getStringCellValue();
					System.out.println(v);
				}
					else if(DateUtil.isCellDateFormatted(cell)){
						Date d = cell.getDateCellValue();
						SimpleDateFormat sim = new SimpleDateFormat("dd,MMM,yyyy");
						String v = sim.format(d);
						System.out.println(v);
					}
					else {
						double d = cell.getNumericCellValue();
						long l=(long)d;
						String v = String.valueOf(l);
						System.out.println(v);
				}
				
			}
			
		}
		
		
		
		
	}

}
