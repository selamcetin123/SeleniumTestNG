package ScreenShotAndExcelFile;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {




    @Test
    public static void ExcelRead() throws IOException {
        // excel dosyamizin yolunu okuyarak kaydettik
        FileInputStream fileInputStream=new FileInputStream("src/test/java/ScreenShot/Financial Sample.xlsx");


//        Workbook workbook= WorkbookFactory.create(fileInputStream);
//
//        Sheet sheet=workbook.getSheet("sayfa1");
//
//        Row row=sheet.getRow(5);
//
//        Cell cell=row.getCell(3);
//        System.out.println(cell);

    }
}
