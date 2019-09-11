package org.emp;

public class Employee {
	public void empId() {
		System.out.println("Default method");
	}
	public void empId(int a) {
		System.out.println(a);
	}
	public void empId(String a ) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId();
		e.empId(50);
		e.empId("Tamil");
	}
}
