package readDataFromFiles;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtility
{
    Properties pro;

    public ConfigUtility()
    {

        System.out.println("Loading config files");
        FileInputStream fis;
        try
        {
            fis = new FileInputStream(new File(System.getProperty("user.dir")+"/ConfigFiles/Config.properties"));

            pro=new Properties();

            pro.load(fis);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found "+e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Could not read files "+e.getMessage());
        }

        System.out.println("Config file loaded");

    }

    //Generic
    public String getValue(String key)
    {
        return pro.getProperty(key);
    }

    //define some keys

    public String getBrowser()
    {
        return pro.getProperty("browser");
    }

    public String getQAEnv()
    {
        return pro.getProperty("qa");
    }

    public String getStagEnv()
    {
        return pro.getProperty("stag");
    }

    public String getProdEnv()
    {
        return pro.getProperty("prod");
    }


}