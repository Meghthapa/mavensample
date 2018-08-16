package DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File xlFile = new File("C:\\Users\\meght\\Desktop\\datasheet.xlsx");
		xlFile.createNewFile();
        FileInputStream fis = new FileInputStream(xlFile);
        XSSFWorkbook wb = new XSSFWorkbook(fis);//this code goes to excel 
        XSSFSheet sheet=wb.getSheet("Script");//This will take into specific Excelpage 
        XSSFRow row=sheet.getRow(2);//Gets row 
        XSSFCell cell=row.getCell(2);//This will give you a column
        String value =cell.getStringCellValue();//return value from the column
        System.out.println(value);
      
        
        
	}

}
