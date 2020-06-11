public class Student {
	private String name;
	private int age;
	private int grade;

	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getGrade() {
		return this.grade;
	}

	@Override
	public String toString() {
		return "My name is " + this.name + ". My age is " + 
		this.age + ". My grade is " + this.grade;
	}
}