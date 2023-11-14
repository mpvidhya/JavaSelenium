package readDataFromFiles;

import org.testng.annotations.Test;

import java.util.Properties;

public class ReadExcelLibrary {
    @Test
    public void test(){
        ExcelUtility excel=new ExcelUtility();
        System.out.println(excel.getData("Users",0,0));




    }
}
