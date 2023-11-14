package readDataFromFiles;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelGeneric {

    @Test
    public void readData() throws IOException
    {

        XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/TestData.xlsx")));

        XSSFSheet sh1=wb.getSheet("Users");
        // coloumn depends on rows , so we get the rows  first
        int rows=sh1.getPhysicalNumberOfRows();

        System.out.println("Rows count "+rows);

        int columns=sh1.getRow(0).getPhysicalNumberOfCells();

		/*for(int i=0;i<rows;i++)
		{
			System.out.println(sh1.getRow(i).getCell(1).getStringCellValue());
		}*/

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.println(sh1.getRow(i).getCell(j).getStringCellValue());
            }
        }


        wb.close();
    }

}