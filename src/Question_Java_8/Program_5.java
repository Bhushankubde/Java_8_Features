package Question_Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program_5 {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> newlist  = listOfStrings.stream().distinct().collect(Collectors.toList());
        newlist.forEach(System.out::println);
    }
}
