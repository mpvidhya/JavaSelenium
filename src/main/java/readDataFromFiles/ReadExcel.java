package readDataFromFiles;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadExcel {
    @Test
    public void readData() throws IOException {
//        File src=new File(System.getProperty("user.dir")+"/TestData/TestData.xlsx");
//        FileInputStream fis= new FileInputStream(src);
        XSSFWorkbook file = new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/TestData.xlsx")));
        String data =file.getSheet("Users").getRow(1).getCell(0).getStringCellValue();
        System.out.println(data);

//        XSSFSheet sh1= file.getSheet("Users");
//        XSSFRow r1= sh1.getRow(0);
//        XSSFCell c1= r1.getCell(0);
//        String data= c1.getStringCellValue();
//        System.out.println(data);
        file.close();
    }
}
