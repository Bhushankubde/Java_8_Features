package feature.demo;

import java.time.LocalDate;
import java.util.Locale;

public class Stuff {
    public static void dostuff() {
        System.out.println("we are doing work together");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
    }

    public static void table() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(i * 2);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public void number() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
