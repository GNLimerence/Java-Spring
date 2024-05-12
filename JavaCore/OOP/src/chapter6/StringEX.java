package chapter6;

import java.util.Scanner;

public class StringEX {
	public static void main(String[] args) {
		System.out.println("Nhap username: ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		
		System.out.println("Nhap vao password: ");
		String password = scanner.nextLine();
		
		System.out.println("Username = " + username + "Password = " + password);
		if (username.equals("hainam") && password.length() > 6) {
			System.out.println("valid");
		}
		scanner.close();
	}
}
