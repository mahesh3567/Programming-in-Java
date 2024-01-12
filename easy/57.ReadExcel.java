import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("path/to/your/excel/file.xlsx")) {
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);

            Row row = sheet.getRow(0);
            Cell emailCell = row.getCell(0);
            Cell passwordCell = row.getCell(1);

            String email = emailCell.getStringCellValue();
            String password = passwordCell.getStringCellValue();

            System.out.println("Email: " + email);
            System.out.println("Password: " + password);

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
