package ScreenShotAndExcelFile;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelWrite {


    @Test
    public static void test() throws IOException {

        String filePath="src/test/java/ScreenShot/Financial Sample.xlsx";
        FileInputStream fileInputStream=new FileInputStream(filePath);


//        Workbook workbook= WorkbookFactory.create(fileInputStream);

//        Sheet sheet=workbook.getSheet("sayfa1");
//
//        sheet.getRow(0).createCell(4).setCellValue("nufus");
//
//        FileOutputStream fileOutputStream=new FileOutputStream(filePath);
//        workbook.write(fileOutputStream);

    }

}
