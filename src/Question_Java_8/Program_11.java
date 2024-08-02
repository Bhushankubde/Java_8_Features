package Question_Java_8;

interface Doable{
    default void doIt(){
        System.out.println("Do it now");
    }
}
@FunctionalInterface
interface Sayable extends Doable{
    void say(String msg);   // abstract method
}

public class Program_11 implements Sayable{
    public static void main(String[] args) {
      Program_11 Pl = new Program_11();
      Pl.doIt();
      Pl.say("Looking good");
    }

    @Override
    public void say(String msg) {
        System.out.println("clear");
    }
}
