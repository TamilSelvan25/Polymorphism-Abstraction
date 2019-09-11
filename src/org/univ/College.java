package org.univ;

public class College extends University{
	public void ug() {
		System.out.println("UG is compulsory to do PG");
	}
	public void pg() {
		System.out.println("PG is optional");
	}
	public static void main(String[] args) {
		College c=new College();
		c.ug();
		c.pg();
	}
}
