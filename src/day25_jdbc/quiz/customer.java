package day25_jdbc.quiz;

public class customer { // model
	public final String ClassName="Customers";
	
	private int code = 0;
	private String name = null;
	private String email = null;
	private String phone = null;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getClassName() {
		return ClassName;
	}
}
