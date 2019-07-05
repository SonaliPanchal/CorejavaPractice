package javaPricetice;

import java.io.File;
import java.io.FileWriter;

public class FileOprtaions {

	public static void main(String[] args) {
		try {
			File f = new File("test.txt");

			if(f.createNewFile()) {
				System.out.println("new File is Created");
				FileWriter fw = new FileWriter(f,true);
				fw.write("hello i am sonali Panchal");
				fw.close();
			}
			else
			{
				System.out.println("File is already Exist");
				System.out.println("Success");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
