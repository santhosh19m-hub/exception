package exception;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("Welcome");
		String name="One soft";
		char c;
		try {
			c=name.charAt(10);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("gjk");
		}
		catch(StringIndexOutOfBoundsException si) {
			System.out.println("No such character found");
		}
		catch(Exception e) {
			System.out.println("sbbcbk");
		}
		System.out.println("ThankYou");
		System.out.println("nandri");

	}

}
