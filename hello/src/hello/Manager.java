package hello;

public class Manager extends Company {
	String dept;
	
	public Manager(String name, String ssn, String idnum, String dept) {
		super(name, ssn, idnum);
		
		this.dept = dept;
	}

}
