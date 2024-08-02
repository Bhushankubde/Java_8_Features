package Question_Java_8;

import java.util.Arrays;

public class Program_13 {
    public static void main(String[] args) {

        //FirstNonRepeatingCharacter
        String str = "bhushan";
        System.out.println(Arrays.stream(str.split(""))
                .filter(s -> str.indexOf(s)==str.lastIndexOf(str))
                .findFirst()
                .orElse(""));

        //FirstRepeatingCharacter
        String st = "rohtth";
        System.out.println(Arrays.stream(st.split(""))
                .filter(s -> s.indexOf(st)!=st.lastIndexOf(st))
                .findFirst()
                .orElse(""));
    }
}
