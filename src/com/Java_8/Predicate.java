package com.Java_8;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Predicate {
    public static void main(String[] args) {
//        java.util.function.Predicate <Integer> predicate = x->x>100;
//        System.out.println(predicate.test(100000));
      /*  java.util.function.Predicate<Integer> isOdd = x->x%2==0;
        List<Integer> list = Arrays.asList(1,2,3,4,5,67,8);
        for (int l:list) {
            if (!isOdd.test(l)){
                System.out.println(l);
            }
        }*/

       // Function

//        Function<String,Integer> function = x->x.length();
//        System.out.println(function.apply("Java"));

//        Function<String,String> function1 = x->x.toUpperCase();
//        Function<String,String> function2 = x->x.substring(0,3);
//        System.out.println(function1.andThen(function2).apply("Rock"));

//        Function<String,String> function = x->x.trim();
//        System.out.println(function.apply(" Rock "));

        //Consumer
//        Consumer<String> consumer = s-> System.out.println(s);
//        consumer.accept("Bhushan");
//        Consumer<List<Integer>> listConsumer = x -> {
//            for (Integer i:x) {
//                System.out.println(i+100);
//            }
//        };
//      listConsumer.accept(Arrays.asList(1,2,3,4,5,6,7,8,9));

        //Supplier
//        Supplier<String> supplier = ()->"Rock";
//        System.out.println(supplier.get());

        //BiPredicate
        BiPredicate<String, Integer> biPredicate = (str,x)->str.length()==x;
        System.out.println(biPredicate.test("Rock",4));

    }
}
