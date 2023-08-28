package exception;

public class Demo {

	public static void main(String[] args) {
		System.out.println("WelCome");
		int a=5;
		int b=2;
		int c=0;
		System.out.println(a+b+c);
		try {
		System.out.println(a/c);
		}
		catch(Exception e) {
			System.out.println("You cannot divide a number by zero");
		}
		finally {
		System.out.println("Thank You");
		}
	}

}
