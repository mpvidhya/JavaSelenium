package testngAdvance;

import org.testng.annotations.DataProvider;
import readDataFromFiles.ExcelUtility;

public class DataProviders {

    @DataProvider(name="Login")
//    public static Object[][] generateData()
//    {
//        Object [][]arr= new Object[2][2];
//        arr[0][0]="vidhya";
//        arr[0][1]="vidhya";
//        arr[1][0]="vidhya";
//        arr[1][1]="vidhya";
//        return arr;
//
//
//    }
//}

    public static Object[][] generateDataFromExcel()
    {
        System.out.println("Test Data started");

        ExcelUtility excel=new ExcelUtility();

        int row=excel.getRows("Users");

        int column=excel.getColumn("Users");

        Object [][]arr=new Object[row][column];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=excel.getData("Users",i, j);
            }
        }


        System.out.println("Test Data Created");
        return arr;
    }

}

