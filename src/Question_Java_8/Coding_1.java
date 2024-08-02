package Question_Java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Coding_1 {
    public static void main(String[] args) {

        //Even number
       /* List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
          list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList())
                  .forEach(System.out::println);*/

        //Starting with 1
        /*List<Integer> list1 = Arrays.asList(11,1,2,13,14,15,22,19,41);
        list1.stream().map(n->n+" ").filter(s -> s.startsWith("1"))
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        //Repeated number
       /* List<Integer> list2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> st = new HashSet<>();
        list2.stream().filter(n->!st.add(n))
                .forEach(System.out::println);*/

        //District number
       /* List<Integer> list3 = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
        Set<Integer> st = new HashSet<>(list3);
        List<Integer> uniquedata = st.stream().collect(Collectors.toList());
        uniquedata.forEach(System.out::println);*/

       //first element of the list using Stream functions
        /*List<Integer> list4 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        list4.stream().findFirst().ifPresent(System.out::println);*/

        //find the maximum & minimum value element present in it using Stream functions
       /* List<Integer> list4 = Arrays.asList(10,15,8,49,25,98,98,32,15,1);
        int max_integer = list4.stream().max(Integer::compare).get();
        System.out.println(max_integer);
        int min_integer = list4.stream().min(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }).get();
        System.out.println(min_integer);*/

      //  Sort all the values present in it using Stream functions
      /* List<Integer> list5 = Arrays.asList(10,15,8,49,25,98,98,32,15);
       list5.stream().sorted().forEach(System.out::println);*/

        // Sort all the values present in it in descending order using Stream functions
        /*List<Integer> list6 = Arrays.asList(10,15,8,49,25,98,98,32,15,1);
        list6.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);*/

       // Java 8 program to perform cube on list elements and filter numbers greater than 50
       /* List<Integer> list7 = Arrays.asList(4,5,6,7,1,2,3);
        list7.stream().map(i->i*i*i)
                .filter(n->n>50).forEach(System.out::println);*/

        /*List<String> names = Arrays.asList("aa", "bb", "cc", "dd");
        names.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);*/

       List<String> names = Arrays.asList("AA", "BB", "AA", "CC","AA");
        Map<String, Long> collect = names.stream().filter(x -> Collections.frequency(names, x) > 1)
                .collect(Collectors.groupingBy
                        (Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
