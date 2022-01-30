package Activities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity15 {
	
	private static String inputFile = "Datatypes1.xlsx";

	public static void main(String[] args) {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Datatypes1");
		Object[][] datatypes = {
				{"DataType","Types","size(in bytes)"},
				{"Int","Primitive",2},
				{"float","Primitive",3.2f},
				{"double","primitive",1234.22},
				{"String","NonPrimitive","Anjiliona"}
		};
		
		int rowNum=0;
		System.out.println("creating sheet");
		
		for(Object[] rows:datatypes) {
			Row row = sheet.createRow(rowNum++);
			
			int colNum=0;
			for(Object fields:datatypes) {
				Cell cell=row.createCell(colNum++);
				if(fields instanceof String) {
					cell.setCellValue((String)fields);
				}
				else if (fields instanceof Integer) {
					cell.setCellValue((Integer)fields);
			}
			
			
		}
		
		
	}
	
	try {
		FileOutputStream fileOutputStream = new FileOutputStream(inputFile);
		workbook.write(fileOutputStream);
		workbook.close();
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
	System.out.println("done");
	
	}
}
