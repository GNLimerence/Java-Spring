package chapter7;

public class SinhVienIT extends SinhVien {
	private String language;
	
	public SinhVienIT(String language, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.language = language;
	}
	public String getLanguage() {
		return this.language;
	}
	public void getMoney() {
		System.out.println("run get money");
		super.info();
	}
	
	public void info() {
		System.out.println("run info from sinhvienIT");
	}
	@Override
	void TinhDiem() {
		// TODO Auto-generated method stub
		
	}
}
