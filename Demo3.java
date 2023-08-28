package exception;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner s=new Scanner(System.in);
		String x=s.nextLine();
		try {
		int y=Integer.parseInt(x);
		}
		catch(NumberFormatException nfe) {
			System.out.println("Cannot convert String to number");
		}
		System.out.println(x);
		System.out.println("Thank you");
		

	}

}
