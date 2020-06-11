import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //instances of Student class
        Student student1 = new Student("Caitlyn", 19, 14);
        Student student2 = new Student("Bob", 8, 10);

        System.out.println(student1.getName());
        System.out.println(student2);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
//        arr.add("Hi");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);

        SchoolClass schoolClass = new SchoolClass("Mrs. Evans");
        // index 0 of arrayList Students
        schoolClass.addStudent(new Student("Shiv", 19, 14));
        // 1
        schoolClass.addStudent(new Student("billy", 10, 16));

        System.out.println(schoolClass.getStudent(0).getName());
        System.out.println(schoolClass.getStudents().get(0).getName());
        System.out.println(schoolClass);
    }
}