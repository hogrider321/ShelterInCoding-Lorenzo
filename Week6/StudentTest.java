public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("Lorenzo", 15, 10);
		Student student2 = new Student("Bob", 8, 5);

		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getGrade());

		System.out.println(student1);
		System.out.println(student2);
		// .toString() - print out desired value into the console

	}
}