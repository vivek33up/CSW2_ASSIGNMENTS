class Student<T> {
	private String name;
	private T rollNumber;
	private int age;

	Student(String name, T rollNumber, int age) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public T getRollNumber() {
		return this.rollNumber;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return "Student Roll number : " + rollNumber + " , age : " + age + " and name : " + name;
	}
}

public class Q1{

	public static void main(String[] args) {
		Student<Integer> stud = new Student<>("Aditya", 101, 20);
		System.out.println(stud);
	}

}
