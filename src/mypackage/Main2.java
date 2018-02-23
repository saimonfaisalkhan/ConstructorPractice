package mypackage;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		String dep=sc.next();
		int contact=sc.nextInt();
		Student student2=new Student(id, name, dep, contact);
		System.out.println(student2.toString());
//		student.setId(101);
//		
//		student.setName("Asif");
//		student.setContact(01232323);
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		System.out.println(student.getDepartment());
//		System.out.println(student.getContact());
		System.out.println("********");
		student = new Student(102,"Khalek","CSE",234234);
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		System.out.println(student.getDepartment());
//		System.out.println(student.getContact());
		
		System.out.println(student.toString());
	}

}
