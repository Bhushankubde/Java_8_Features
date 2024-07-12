package com.Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_method {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 6, 4, 6, 9);
        /*List<Integer> collect = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> maplist = collect.stream()
                .map(x -> x / 2)
                .collect(Collectors.toList());
        System.out.println(maplist);*/
        List<Integer> collect = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a,b)->b-a)
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(collect);

        long collect1 = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x->x%2==0)
                .map(x->x/2)
                .peek(x-> System.out.println(x))
                        .count();
               // .max((a,b)->b-a).get();
               // .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
