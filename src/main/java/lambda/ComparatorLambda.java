package main.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args) {
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        };

        //Lambda Expression
        Comparator<String> comp = (o1, o2) -> Integer.compare(o1.length(),o2.length());

        List<String> list = Arrays.asList("***","**","*", "****");
        Collections.sort(list, comp);

        for(String s : list){
            System.out.println(s);
        }
    }
}
