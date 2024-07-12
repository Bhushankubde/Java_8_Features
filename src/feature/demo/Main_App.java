package feature.demo;

public class Main_App {
    public static void main(String[] args) {
        System.out.println("Working.....");

        //1.
       /* Task task = ()->{
            System.out.println("This is very good");
        };

        //2.
        task.dotask();*/
        Task task = Stuff::dostuff;
        task.dotask();

      /*  Runnable runnable = Stuff::table;
        runnable.run();

        Stuff obj = new Stuff();
        Runnable runnable1 = obj::number;
        runnable1.run();
*/
        Provider provider = Student::new;
        Student student = provider.getStudent();
        student.display();

    }
}
