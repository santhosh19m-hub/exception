package exception;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Welcome");
		String name=null;
		try {
		System.out.println(name.toUpperCase());
		}
		catch(ArithmeticException ae) {
			System.out.println("Mathematical issue");
		}
		catch(NullPointerException npe) {
			System.err.println("Values not present");
			npe.printStackTrace();
			System.out.println(npe);
		}
		catch(Exception e) {
			System.out.println("General");
		}
		System.out.println("Thank You");

	}

}
