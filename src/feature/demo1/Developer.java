package feature.demo1;

public interface Developer {
    default public void init() {     //static method cannot override
        System.out.println("This is the special method");
    }

    void develop();
}
