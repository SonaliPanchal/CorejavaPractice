package javaPricetice;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedInputStream {

	public static void main(String[] args) throws IOException {
		
try {
	/*FileReader fr = new FileReader("test.txt");
	int j =  fr.read();
	 System.out.println(j);
	
	int i ;
	while((i=fr.read())!=-1)
	{
		System.out.println((char)i);
	}*/
	FileWriter fw = new FileWriter("test1.txt",true);
	BufferedWriter bf = new BufferedWriter(fw);
	bf.write("hjhjjdjhhjhjjh. ");
	bf.newLine();
	bf.write("jhkjhfkjk");

	bf.close();
		
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
