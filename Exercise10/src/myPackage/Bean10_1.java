package myPackage;

public class Bean10_1 {
	private String first;
	private String last;
	private String email;
	private String phone;
	
	private String[] msg = {"", "", "", ""};
	
	public Bean10_1 (String f, String l, String e, String p) {
		this.first = f;
		this.last = l;
		this.email = e;
		this.phone = p;
	}
	
	public String[] getMsg() {
		if (this.first.equals("")) {
			msg[0] = "Enter First";
		}
		if (this.last.equals("")) {
			msg[1] = "Enter Last";
		}
		if (this.email.equals("")) {
			msg[2] = "Enter Email";
		}
		if (this.phone.equals("")) {
			msg[3] = "Enter Phone";
		}
		return msg;
	}
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
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
	
}
