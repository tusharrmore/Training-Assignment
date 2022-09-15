package OopsAssignment_1;

import java.util.Date;

public class Person {

	private int pid;

	private String pname, paddress;

	private String dob;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", dob=" + dob + "]";
	}

	public Person(int pid, String pname, String paddress, String dob) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dob = dob;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
