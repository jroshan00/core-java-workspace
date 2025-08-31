package implementingFileHandling.outputStream.basicOperation.project;

public class Student {

	private String fname;
	private String lname;
	private String age;
	private String address;

	Student() {
		super();
	}
	/*
	 * Student(String fname,String lname,String age,String address){
	 * this.fname=fname; this.lname=lname; this.age=age; this.address=address; }
	 */

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFname() {
		return this.fname;
	}

	public String getLname() {
		return this.lname;
	}

	public String getAge() {
		return this.age;
	}

	public String getAddress() {
		return this.address;
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", age=" + age + ", address=" + address + "]";
	}

}
