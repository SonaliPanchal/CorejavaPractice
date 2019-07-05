package javaPricetice;

public class ThrowKeyword {

	static ArithmeticException e;
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			
		}
		throw e;
	}
}
