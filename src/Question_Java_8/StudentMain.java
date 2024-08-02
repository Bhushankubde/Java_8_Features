package Question_Java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Sohan","hello");
        Student s2 = new Student(101,"Rohan","good");
        Student s3 = new Student(104,"Mohan","nice");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
    }
}
