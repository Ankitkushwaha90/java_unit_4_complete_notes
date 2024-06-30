import java.util.*;
public class TreeSetExample {
    public static void main(String[] args){
        SortedSet<String> data_temp = new TreeSet<>();
        data_temp.add("temp_data");
        data_temp.add("wel");
        data_temp.add("done");
        data_temp.add("lock");

        data_temp.remove("lock");

        System.out.println(data_temp);
    }
}
