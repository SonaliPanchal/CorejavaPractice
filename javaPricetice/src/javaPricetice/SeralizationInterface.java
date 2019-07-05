package javaPricetice;

import java.io.Serializable;

public class SeralizationInterface implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i ;
	static String s;

	public SeralizationInterface(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}
}

