package org.phone;

public class Phone {
	public void phoneInfo(int a,String b) {
		System.out.println(a+b);
	}
	public void phoneInfo(String a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Phone p=new Phone();
		p.phoneInfo(50,"Tamil");
		p.phoneInfo("SELVAN", 100);
	}
}
