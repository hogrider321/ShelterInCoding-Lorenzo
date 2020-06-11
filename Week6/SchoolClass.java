import java.util.ArrayList;

public class SchoolClass {
    private String teacherName;
    //allows us to define an array without knowing the size of array beforehand
    // Student[] arr = new Student[30];
    private ArrayList<Student> students;

    public SchoolClass(String teacherName, ArrayList<Student> students) {
        this.teacherName = teacherName;
        this.students = students;
    }

    public SchoolClass(String teacherName) {
        this.teacherName = teacherName;
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Student getStudent(int index) {
        return this.students.get(0);
    }

    public ArrayList<Student> getStudents () {
        return this.students;
    }

    @Override
    public String toString() {
        String str = this.teacherName + "\n";
        for (Student student: this.students) {
            str += student.toString() + "\n";
        }
        return str;
    }
}