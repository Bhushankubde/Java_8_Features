package feature.demo;

interface Choco{
    void show(int i);
}
/*class Dairy implements Choco{

    @Override
    public void show() {
        System.out.println("Lovely");
    }
}*/
public class Today2 {
    public static void main(String[] args) {
       Choco choco;
       /*{
           public void show()
           {
               System.out.println("Lovely chocolate");
           }
       };*/
      /*  choco=()->{
            System.out.println("Lovely chocolate");
        };*/
        choco=(i)-> System.out.println("Lovely chocolate"+i);
       choco.show(5);

    }
}
