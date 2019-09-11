package org.company;

public class CompanyInfo {
	public void companyName(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void companyName(int a,int b) {
		System.out.println(a+b);
	}
	public void companyName(String a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName(10, 20, 30);
		c.companyName(100, 200);
		c.companyName("Tamil Selvan");
		
	}
}
