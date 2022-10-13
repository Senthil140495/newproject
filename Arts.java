package org.edu;

public class Arts extends Education {
	
	public void bSc() {
		System.out.println("Max bsc is 65");
	}
	public void bEd() {
		System.out.println("Max bed is 70");
	}
	public void bA() {
		System.out.println("Max ba is 75");
	}
	public void bBa() {
		System.out.println("Max bba is 80");
	}
	
	@Override
	public void ug() {
		System.out.println("Max strength is 85");
	}
	
	@Override
	public void pg() {
		System.out.println("Max strength is 90");
	}
public static void main(String[] args) {
	Arts a=new Arts();
	a.bA();
	a.bBa();
	a.bEd();
	a.bSc();
	a.ug();
	a.pg();
}
}
