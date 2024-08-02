package Question_Java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program_2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rahul","mickey","sonu","sohan");
        List<String> toUpperCase =list.stream().map(String::toUpperCase).collect(Collectors.toList());
        toUpperCase.forEach(System.out::println);

    }
}
