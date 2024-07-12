package feature.demo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateandDemo {
    public static void main(String[] args) {
       // LocalDate localDate = LocalDate.now();
//        LocalDate l1 = LocalDate.of(2000,3,29);
//        System.out.println(l1);\\
        LocalTime localTime = LocalTime.now();
       // System.out.println(localTime);
        LocalTime l = LocalTime.now(ZoneId.of("Brazil/Acre"));
        System.out.println(l);
       for (String i:ZoneId.getAvailableZoneIds()){
           System.out.println(i);
       }
    }
}
