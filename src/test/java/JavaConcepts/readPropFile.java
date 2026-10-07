package JavaConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readPropFile {
    public static void main(String[] args) throws Exception{
        File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\JavaConcepts\\sample.properties");
        if(file.exists()){
            System.out.println("File exists");
            System.out.println("File read: "+file.canRead());
            System.out.println(file.lastModified());

            FileInputStream fis = new FileInputStream(file);

            Properties prop = new Properties();
            prop.load(fis);
            String name = prop.getProperty("name");
            String age = prop.getProperty("age");
            String gender = prop.getProperty("gender");
            String dob = prop.getProperty("dob");

            System.out.println(name+" "+age+" "+gender+" "+dob);
        }
    }
}
