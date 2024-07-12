package feature.demo;

public interface First {
    default void show(){
        System.out.println("Hello interface");
    }

}
