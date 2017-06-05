package PhoneContact;

public class contacts {

	String name;
	long PhoneNum;

	public contacts(String name, long phoneNum) {
		this.name = name;
		PhoneNum = phoneNum;

	}

	public String toString() {
		return " name=" + name + "\n"+", PhoneNum=" + PhoneNum;
	}

}
