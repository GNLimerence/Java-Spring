package chapter9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhap x =");
			try {
				int x = scanner.nextInt();
				try {
					System.out.println("ket qua 10/x="+10/x);
					break;
				}catch(Exception e) {
					System.out.println("run x = " + x);
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("run error");
			}finally {
				scanner.close();
			}
		}
	}
}
