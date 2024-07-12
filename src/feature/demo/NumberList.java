package feature.demo;

import java.awt.*;
import java.util.List;

public class NumberList {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,2,3,44,4,5,65,6);
        integers.stream().forEach(System.out::println);
    }
}
