package feature.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main_App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"Lp",1000));
        list.add(new Product(2,"Computer",2000));
        list.add(new Product(3,"Monitor",3000));

        //Stream
        List<Integer> newlist = list.stream().filter(product -> product.getPrice()<3000).map(Product->Product.getPrice()*2)
                .collect(Collectors.toList());
        System.out.println(newlist);

        //count
        /*long count = list.stream()
                .filter(product->product.getPrice()<3000)
                .count();
        System.out.println(count);*/

    }
}
