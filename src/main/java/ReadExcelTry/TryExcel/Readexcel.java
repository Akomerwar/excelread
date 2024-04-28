package ReadExcelTry.TryExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {
	public static void main(String[] args) {
		readexceltrail("C:\\Users\\ANIRUDHA\\OneDrive\\Desktop\\New folder\\TryExcel\\src\\main\\java\\ReadExcelTry\\TryExcel\\Book1.xlsx");
	}
    
	private static void readexceltrail(String file) {
		// TODO Auto-generated method stub
		try {
			XSSFWorkbook work = new XSSFWorkbook(new FileInputStream(file));
			XSSFSheet Sheet1 = work.getSheet("Sheet1");
			XSSFRow Row = Sheet1.getRow(1);
			System.out.println(Row.getCell(1).getStringCellValue());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
