import java.util.*;

public class StackExample {
    public static void main(String[] args){
        Stack<String> newstackdata = new Stack<>();
        newstackdata.push("wdafsalsdkfj");
        newstackdata.push("wooooooooooooh!");
        newstackdata.push("tempary_data");

        newstackdata.pop();

        System.out.println(newstackdata);
    }   
}
