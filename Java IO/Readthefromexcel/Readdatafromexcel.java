package Readthefromexcel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdatafromexcel {
    public static void main(String[] args) {
    	
        String filePath = "C:\\Users\\RAHUL\\Downloads\\Student.xlsx";
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
        	
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0); 
            
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
            
            workbook.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
