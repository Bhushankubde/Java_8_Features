package feature.demo;

interface drawbale{
    void draw();
}
public class Lambda_First {
    public static void main(String[] args) {

        int width=12;
        drawbale d = new drawbale() {

            @Override
            public void draw() {
                System.out.println(width);
            }
        };
        d.draw();
    }
}
