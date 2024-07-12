package feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Trail {
    public static void main(String[] args) {
       List<Integer> strlength =  Arrays.asList("Java","Python","C++","Html")
               .stream().map(str->str.length()).collect(Collectors.toList());
        System.out.println(strlength);

//        List<Boolean> list = Arrays.asList("Java","Python","C++","Html")
//                .stream().map(s -> s.length()<5)
//                .collect(Collectors.toList());
//        System.out.println(list);

        int add =  Arrays.asList("Java","Python","C++","Html")
                .stream().mapToInt(st->st.length()).sum();
        System.out.println(add);

    }
}
