package javaPricetice;

import java.io.Serializable;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class ISASerialzation implements Serializable{
	int id  ;
	String name ;
	
	public ISASerialzation(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

class person extends ISASerialzation
{
	static String Course ="Spring";
	int fee;
	
	public person(int id, String name, String course, int fee) {
		super(id, name);
		Course = course;
		this.fee = fee;
	}

	
}

