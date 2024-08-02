package Question_Java_8;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program_12 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,1,2,13,14,15};
        Stream.iterate(1, n -> n + 2)
                .limit(5)
                .forEach(System.out::println);
       /* IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        // Convert IntStream to Stream<Integer>
        Stream<Integer> integerStream = intStream.boxed();

        // Print each element in the Stream<Integer>
        integerStream.forEach(System.out::println);*/
   }
}
