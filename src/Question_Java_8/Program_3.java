package Question_Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program_3 {
    public static void main(String[] args) {
        List<List<String>> list1 = Arrays.asList(Arrays.asList("Grapes","Apple"),Arrays.asList("Rahul","Sohan"),Arrays.asList("Delhi",
                "Bangalore"));
//        List<String> newlist = list1.stream().flatMap(List::stream).collect(Collectors.toList());
//        newlist.forEach(System.out::println);


//        List<String> Start = (List<String>) list1.stream().flatMap(fruitname->fruitname.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());

        List<List<String>> names = Arrays.asList(
                Arrays.asList("Saket", "Trevor"),
                Arrays.asList("John", "Michael"),
                Arrays.asList("Shawn", "Franklin"),
                Arrays.asList("Johnty", "Sean")
        );

        List<String> startWithS = names.stream()
                .flatMap(firstName -> firstName.stream()) // Flatten the List<List<String>> to Stream<String>
                .filter(s -> s.startsWith("S")) // Filter names that start with 'S'
                .collect(Collectors.toList()); // Collect the filtered names into a List

        startWithS.forEach(System.out::println);
    }
}
