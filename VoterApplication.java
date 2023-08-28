package exception;

import java.util.Scanner;

public class VoterApplication {

	public static void main(String[] args)throws AgeException {
		System.out.println("Welcome");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String a=s.nextLine();
		System.out.println(a);
		System.out.println("Enter your age: ");
		int age=s.nextInt();
		if(age>18) {
			System.out.println("Eligible For Vote");
		}
		else {
			throw new AgeException("Your age is Inappropriate");
		}
		System.out.println("Enter the Gender");
		String gender=s.next();
		System.out.println(gender);
		System.out.println("Thankyou");
	}

}
