import java.util.*;
/**
 * PropertiesExample
 */
public class PropertiesExample {
    public static void main(String[] args){
        Properties newdata = new Properties();
        newdata.setProperty("Username","ankit");
        newdata.setProperty("password", "12345");

        System.out.println(newdata.getProperty("Username"));
        System.out.println(newdata.getProperty("password"));
    }
}
