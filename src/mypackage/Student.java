package mypackage;

public class Student {
	private int id;
	private String name;
	private String department;
	private int contact;
	public Student() {
		super();
	}
	public Student(int id, String name, String department,int contact) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.contact=contact;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", \nname=" + name + ", \ndepartment=" + department + ", \ncontact=" + contact + "]";
	}
	
	
}
