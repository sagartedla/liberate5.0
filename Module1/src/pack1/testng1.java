package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class testng1 {
  @Test
  public void f() throws IOException {
	  FileInputStream file = new FileInputStream(new File("C:\\testdata.xlsx"));
	  
	  XSSFWorkbook workbook = new XSSFWorkbook(file);
	  XSSFSheet sheet = workbook.getSheetAt(0);
	  Cell searchText3 = sheet.getRow(0).getCell(0);
	  searchText3.setCellValue("test search keyword");
	  
	  
  }
  
  
  
  
}
