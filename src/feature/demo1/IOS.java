package feature.demo1;

public class IOS implements Developer{
    @Override
    public void develop() {
        System.out.println("I am IOS Developer");
    }

    @Override
    public void init() {
        System.out.println("This is own method");
    }
}
