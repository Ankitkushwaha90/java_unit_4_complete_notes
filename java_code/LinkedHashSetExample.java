import java.util.*;
public class LinkedHashSetExample {
    public static void main(String[] args){
        Set<String> datatemp = new LinkedHashSet<>();
        datatemp.add("temp");
        datatemp.add("metal");
        datatemp.add("element");
        datatemp.add("setalight");

        datatemp.remove("setalight");
        

        System.out.println(datatemp);
    }
}
