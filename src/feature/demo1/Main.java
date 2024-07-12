package feature.demo1;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Android();
        developer.develop();
        developer.init();
        Developer developer1 = new IOS();
        developer1.develop();
        developer1.init();
    }
}
