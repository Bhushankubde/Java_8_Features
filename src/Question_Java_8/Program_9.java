package Question_Java_8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program_9 {
    public static void main(String[] args) {
        String input = "Java Concept Of The Day";
        Map<Character,Long> countmap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countmap);
    }
}
