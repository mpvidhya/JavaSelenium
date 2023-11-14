//package readDataFromFiles;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExcelUtility
//{
//
//    XSSFWorkbook wb;
//
//    public ExcelUtility()
//    {
//
//        System.out.println("Loading excel for test data");
//
//        try
//        {
//            wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/Data.xlsx")));
//        } catch (FileNotFoundException e)
//        {
//            System.out.println("File not found "+e.getMessage());
//        } catch (IOException e)
//        {
//            System.out.println("Could not load the file "+e.getMessage());
//        }
//
//
//        System.out.println("Loaded excel for test data");
//    }
//
//    public int getRows(String sheetName)
//    {
//        return wb.getSheet(sheetName).getPhysicalNumberOfRows();
//    }
//
//    public int getColumn(String sheetName)
//    {
//        return wb.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();
//    }
//
////    public int getColumn(String sheetName,int rownumber)
////    {
////        return wb.getSheet(sheetName).getRow(rownumber).getPhysicalNumberOfCells();
////    }
//
//
//    public String getData(String sheetName,int row,int column)
//    {
//        String data="";
//
//        XSSFCell cell=wb.getSheet(sheetName).getRow(row).getCell(column);
//
//
//        if(cell.getCellType()==CellType.STRING)
//        {
//            data=cell.getStringCellValue();
//        }
//        else if(cell.getCellType()==CellType.NUMERIC)
//        {
//
//            data=  String.valueOf(cell.getNumericCellValue());
//        }
//        else if(cell.getCellType()==CellType.BLANK)
//        {
//            data="";
//        }
//
//        return data;
//    }
//
//
//
//
//}

package readDataFromFiles;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility
{

    XSSFWorkbook wb;

    public ExcelUtility()
    {

        System.out.println("Loading excel for test data");

        try
        {
            wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/TestData.xlsx")));
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found "+e.getMessage());
        } catch (IOException e)
        {
            System.out.println("Could not load the file "+e.getMessage());
        }


        System.out.println("Loaded excel for test data");
    }

    public int getRows(String sheetName)
    {
        return wb.getSheet(sheetName).getPhysicalNumberOfRows();
    }

    public int getColumn(String sheetName)
    {
        return wb.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();
    }

    public int getColumn(String sheetName,int rownumber)
    {
        return wb.getSheet(sheetName).getRow(rownumber).getPhysicalNumberOfCells();
    }


    public String getData(String sheetName,int row,int column)
    {
        String data="";

        XSSFCell cell=wb.getSheet(sheetName).getRow(row).getCell(column);


        if(cell.getCellType()==CellType.STRING)
        {
            data=cell.getStringCellValue();
        }
        else if(cell.getCellType()==CellType.NUMERIC)
        {

            data=  String.valueOf(cell.getNumericCellValue());
        }
        else if(cell.getCellType()==CellType.BLANK)
        {
            data="";
        }

        return data;
    }




}