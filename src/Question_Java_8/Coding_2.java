package Question_Java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Coding_2 {
    public static void main(String[] args) {
       /* List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);*/

        List<Double> list1 = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
