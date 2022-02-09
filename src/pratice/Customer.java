package pratice;

public class Customer {
	protected int memberno;
	protected String name;
	protected String address;
	protected int tel;
	
//	public void member(int memberno, String name, String address, int tel) {
//		this.memberno = memberno;
//		this.name = name;
//		this.address = address;
//		this.tel = tel;
//	}
	
	public void find() {
		
	}
	
	public void create() {
		System.out.println("수주자 등록 : ");
		
		System.out.println("고객번호 : ");
		
		System.out.println("고객명 : ");

		System.out.println("주소 : ");

		System.out.println("전화번호 : ");
	}
	
	public int getMemberno() {
		return memberno;
	}

	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	
	void print() {
		System.out.println("no : "+memberno+"name : "+name+"address : "+address+"tel : "+tel);
	}

}
