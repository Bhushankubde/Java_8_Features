package Question_Java_8;

import java.util.stream.IntStream;

public class Program_10 {
    public static void main(String[] args) {
        int no[]={1,2,3,4,5};
        IntStream.of(no)
                .mapToObj(num->""+num)
                .forEach(System.out::print);
        System.out.println("--------------------------");
        IntStream.of(no)
                .mapToDouble(num1->Math.sqrt(num1))
                .forEach(System.out::print);
        System.out.println("--------------------------");
        IntStream.of(no)
                .mapToLong(num2->num2*num2)
                .forEach(System.out::print);
        System.out.println("--------------------------");
        System.out.println(IntStream.of(no).max());
        System.out.println(IntStream.of(no).parallel());

    }
}
