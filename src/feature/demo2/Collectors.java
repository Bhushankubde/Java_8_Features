package feature.demo2;

import java.util.ArrayList;
import java.util.List;

public class Collectors {
    public static void main(String[] args) {

        List<ElectronicShop> ec = new ArrayList<>();

        ec.add(new ElectronicShop(1,"Laptop",12000));
        ec.add(new ElectronicShop(2,"Monitor",15000));
        ec.add(new ElectronicShop(3,"Computer",20000));

        List<Integer> newlist = ec.stream().map(x->x.getPrice()).collect(java.util.stream.Collectors.toList());
        System.out.println(newlist);
    }
}
