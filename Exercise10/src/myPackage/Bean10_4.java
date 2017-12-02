package myPackage;

import java.util.Hashtable;

public class Bean10_4 {
	private Hashtable<String, String> header = new Hashtable<String, String>();
	private int count = 0;
	
	public Bean10_4(){
		header = null;
	}
	public Hashtable<String, String> getHeader() {
		return header;
	}
	public void setHeader(Hashtable<String, String> header) {
		this.header = header;
	}

}
