package hello;

public class Company {
	String name, idnum, ssn, title;
	
	public Company(String name, String ssn, String idnum) {
			this.name = name;
			this.ssn = ssn;
			this.idnum= idnum;
		
	}
	public void work() {
		System.out.printf("%s�� ������ ���մϴ�.\n", name);
	}
}
