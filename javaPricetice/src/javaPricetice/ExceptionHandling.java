package javaPricetice;

public class ExceptionHandling {
	
	public static void main(String[] args) throws InterruptedException {
		//System.out.println(10/0);
		System.out.println("Exicuting main method");
		doStuff();
	}

	private static void doStuff() throws InterruptedException {
		doMoreStuff();
	}

	private static void doMoreStuff() throws InterruptedException 
	{
		Thread.sleep(5000);
		System.out.println("hello exicutuing do stuff method");
		
	}
	

}
