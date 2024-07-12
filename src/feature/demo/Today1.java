package feature.demo;

interface A1{
    void call();
   default void message(){
       System.out.println("Message features");
   }
}
class B1 implements A1{

    @Override
    public void call() {
        System.out.println("Calling features");
    }
}
public class Today1 {
    public static void main(String[] args) {
       B1 b1 = new B1();
       b1.call();
       b1.message();
    }
}
