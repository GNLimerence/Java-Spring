package chapter6;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		Student std = new Student("Pham Hai Nam", 132);
		Student std2 = new Student("Nguyen Hoang Nam", 245);
		Student std3 = new Student("Hoang Hai Phong", 321);
		Student std4 = new Student("Dinh Hoang Hai", 467);
		Student std5 = new Student("Nguyen Dinh Hoang", 545);
		Student std6 = new Student("Tran Dinh Manh", 268);
		
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(std6);
		arr.add(std5);
		arr.add(std4);
		arr.add(std3);
		arr.add(std2);
		arr.add(std);
		
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getName().startsWith("Nguyen")) {
				System.out.println(arr.get(i));
			}
		}
		System.out.println(arr);
	}
}
