package feature.demo;

interface  I{
    void show();
}
interface J{
    void show();
}
class A{
    public void show(){
        System.out.println("A");
    }
}
public class Second extends A implements I,J{
    public static void main(String[] args) {
        Second sc = new Second();
        sc.show();
    }
}
