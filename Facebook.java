package exception;

import java.util.Scanner;

public class Facebook {

	public static void main(String[] args) throws LoginException {
		String name="San";
		String pwd="123";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username: ");
		String a=s.nextLine();
		System.out.println("Enter the password: ");
		String b=s.nextLine();
		try {
		if(a.equals(name)&&b.equals(pwd)) {
			System.out.println("Valid User");
		}
		else {
			throw new LoginException("UserName or password is wrong");
		}
		}
		catch(LoginException l) {
			System.out.println("hhhhhhh");
		}
	}

}
