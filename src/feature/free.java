package feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class free {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7);
    }
}
