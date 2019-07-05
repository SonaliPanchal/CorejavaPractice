package javaPricetice;

public class NullExcetion {
	public static void main(String[] args) throws NullPointerException {
		String s  = null;
		try {
			
			
			System.out.println(s.length());
			System.out.println(10/0);
		} catch (Exception e) {
			
			System.out.println(s);
			e.printStackTrace();
			
		}
		
		
		System.out.println("hello i am sonali");
		
		
	}

}
