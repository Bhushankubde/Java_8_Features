package Question_Java_8;

public class Student {
    private int id;
    private String name;
    private String description;

    public Student() {

    }

    public Student(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
