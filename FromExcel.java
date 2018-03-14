package MyJavaPrograms_1;

import java.io.File;
import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class FromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//String filePath = "H://Desktop/selenium";
	
		//File file = new File("H://Desktop/selenium/ForSelenium1.xlsx");
		
		//FileInputStream fs = new FileInputStream(new File(filePath));
		
	//	XSSFWorkbook wb = new XSSFWorkbook(fs);
		
	//	XSSFSheet ws = wb.getSheetAt(0);
		
	//   System.out.println(ws.getRow(2).getCell(0).getStringCellValue());
	
		//Workbook wb1 = Workbook.getWorkbook(fs);
		
		//Sheet sh = wb1.getSheet(0);
		
		//String res=sh.getRow(1).toString();
		
		//System.out.println(res);
		
		File f = new File("H:\\Desktop\\imp jars\\TestData_updated.xls");
		
		String currentPath = f.getAbsolutePath();
	
		System.out.println("Current path is: "+currentPath);
		
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet s = wb.getSheet(0);
		
		int rows = s.getRows();
		int columns = s.getColumns();
		
		System.out.println("number of rows are: "+rows);
		System.out.println("number of columns are: "+columns);
		
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=columns;i++)
			{
				System.out.println("i is: "+i);
				System.out.println("j is: "+j);
				Cell c = s.getCell(i, j);
				
				System.out.println(c.getContents());
			}
		}
		
	}

}
