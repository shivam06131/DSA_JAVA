package recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintNameNTimesQue {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> returnedvalue = printName(5 , 0 , list);
        System.out.println("Returned Value : " + returnedvalue);

    }

    static List<String> printName(int n , int i , List<String> list){
        if(i == n){
            return list;
        }
        list.add("Shivam");
        return printName(n , i+1 , list);

    }
}
