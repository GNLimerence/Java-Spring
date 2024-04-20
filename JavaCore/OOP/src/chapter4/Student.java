package chapter4;

public class Student {
	public Student() {
		
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//class attribute
	private String name;
	private int age;
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	//class method
	
	public void learnJava() {
		System.out.println("Learn Java");
	}
}
