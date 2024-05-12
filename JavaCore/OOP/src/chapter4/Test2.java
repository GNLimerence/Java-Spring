package chapter4;

public class Test2 {
	public static void main(String[] args) {
		Product prd = new Product();
		prd.nhapThongTin("Tivi", 1000.0, 0.8);
		prd.xuatThongTin(prd);
	}
}
