package feature.demo3;

import java.util.List;

public class StreamMaxMin {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,3,4,4,5,6,66,7,78,-3,-4);
        Integer maximum = list.stream().max(Integer::compare).get();
        System.out.println(maximum);
        Integer minimum = list.stream().min(Integer::compare).get();
        System.out.println(minimum);

    }
}
