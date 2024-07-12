package feature.demo4;

import java.util.Optional;

public class Optional_feature {
    public static void main(String[] args) {
        String st[] = new String[10];
        st[5]="HELLO";
//        String lt = st[5].toLowerCase();
//        System.out.println(lt);
       /* Optional<String> optional = Optional.ofNullable(st[5]);
        if (optional.isPresent()) {
            String lt = st[5].toLowerCase();
            System.out.println(lt);
        }else {
            System.out.println("The String is not present");
        }*/

        Optional<String> optional = Optional.ofNullable(st[5]);
        if (optional.isPresent()){
            String newString = st[5].toLowerCase();
            System.out.println(newString);
        }else {
            System.out.println("String is empty");
        }
    }
}
