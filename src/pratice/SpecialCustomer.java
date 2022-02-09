package pratice;

public class SpecialCustomer extends Customer {
	private int spmember;
	
	public SpecialCustomer(int memberno, String name, String address, int tel, int spmember) {
		this.spmember += 1;
	}

	public void print() {
		System.out.println("no : "+memberno+"name : "
				+name+"address : "+address+
				"tel : "+tel+"special member no : "+spmember);
	}
	
}
