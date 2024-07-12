package feature.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Internal_Loops {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,23,3,4,4,4,5,3,4);
        list.forEach(i-> System.out.println(i));
    }
}
