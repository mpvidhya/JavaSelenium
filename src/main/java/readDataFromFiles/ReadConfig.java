package readDataFromFiles;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    @Test
    public void readConfig() throws IOException {

        FileInputStream fis=new FileInputStream(new File(System.getProperty("user.dir")+"/ConfigFiles/Config.properties"));

        Properties pro=new Properties();

        pro.load(fis);

        System.out.println(pro.get("qa"));
        System.out.println(pro.get("stage"));
        System.out.println(pro.get("prod"));

    }

}

