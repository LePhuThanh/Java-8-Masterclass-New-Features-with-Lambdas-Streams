package main.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {
    public static void main(String[] args) throws Exception {

        //Empty Stream, List empty, default identity = 1
//        List<Integer> list = Arrays.asList();

        //Stream, List has one element, default identity = 1
//        List<Integer> list = Arrays.asList(10);

        //Common Stream, List, default identity = 1
//        List<Integer> list = Arrays.asList(10, 20);
//
//        int red = list.stream()
//                .reduce(1,(i1,i2) -> i1 + i2);
//        System.out.println("red = " + red);

        //sum
//        List<Integer> list = Arrays.asList(10, 20);
//
//        int red = list.stream()
//                .reduce(1,Integer::sum);
//        System.out.println("red = " + red);

        //max
//        List<Integer> list = Arrays.asList(-10, -10);
//
//        int red = list.stream()
//                .reduce(1,Integer::max);
//        System.out.println("red = " + red);

        //max
        List<Integer> list = Arrays.asList(-10, -10);

        Optional<Integer> red = list.stream()
                .reduce(Integer::max);
        System.out.println("red = " + red.get());
        //max

//        List<Integer> list = Arrays.asList();
//
//        Optional<Integer> red = list.stream()
//                .reduce(Integer::max);
//        System.out.println("red = " + red.orElseThrow(Exception::new));
    }
}
