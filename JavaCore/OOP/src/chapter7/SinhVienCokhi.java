package chapter7;

public class SinhVienCokhi extends SinhVien {
	private String skill;
	
	public SinhVienCokhi(String skill, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.skill = skill;
	}

	@Override
	void TinhDiem() {
		// TODO Auto-generated method stub
		
	}
}
