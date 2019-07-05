package javaPricetice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test {
	
	
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			person person = new person(1, "sonali", "java", 20000);

			SeralizationInterface si = new SeralizationInterface(1, "sonali");
			
			System.out.println("si---->"+si);
			//serialization of si class
			FileOutputStream Fout = new FileOutputStream("file.txt",true);
			FileOutputStream Fout1= new FileOutputStream("file1.txt",true);
			System.out.println(Fout);
			//The ObjectOutputStream class is used to write primitive data types,
			//and Java objects to an OutputStream. Only objects that support the java.io.Serializable interface can be written to streams.
			ObjectOutputStream Oout = new ObjectOutputStream(Fout);
			ObjectOutputStream Oout1 = new ObjectOutputStream(Fout1);
			System.out.println(Oout);
			
			//deserialization of an object 
			FileInputStream Fio = new FileInputStream("file.txt");
			ObjectInputStream Oio = new ObjectInputStream(Fio);
			SeralizationInterface si1 = (SeralizationInterface)Oio.readObject(); //down-casting object 
			System.out.println(si1.i+""+si1.s);
			
			//writing object stream into Byte stream
			Oout.writeObject(si);
			Oout1.writeObject(person);
			Oout.flush();
			Oout.close();
		}
	}


