package javaPricetice;

import java.io.PrintWriter;

public class FileNotFoundException {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException,NoClassDefFoundError{
		
		try {
			PrintWriter pw = new PrintWriter("sonali.txt");
			pw.println("hello this is sonali");
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class.forName("heloo").newInstance();
		
	}

}
