package feature;

enum Status{
    Running, Close, pending, Complete, Loading; // constant  name
}

public class Enum {
    public static void main(String[] args) {
 //        Status status = Status.Loading;
//        System.out.println(status.ordinal());

        Status status [] = Status.values();
        for (Status s:status) {
            System.out.println(s);
        }

    }
}
