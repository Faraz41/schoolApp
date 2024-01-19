import java.util.ArrayList;

public class ZevarManagement implements StudentService {

    private ArrayList<Student> studentList;
    private int maxSize;

    public ZevarManagement() {
        this.studentList = new ArrayList<Student>();

    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added Successfully");

    }

    @Override
    public void readStudents() {
        for (Student student : studentList) {
            System.out.println(student);

        }

    }

    @Override
    public void updateStudent() {

    }

    @Override
    public void deleteStudent() {

    }
}
