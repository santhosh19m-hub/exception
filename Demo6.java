package exception;

public class Demo6 {

	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}
	public static void main(String[] args) {
		Demo6 d=new Demo6();
		d.findA();

	}

}
