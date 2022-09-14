package com.String;

public class GarbageCollector_7 {
	
	String st;

	public GarbageCollector_7(String st) {
	        this.st = st;
	    }

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.st + " collected");
	}

	public static void main(String[] args) {
		GarbageCollector_7 gcc = new GarbageCollector_7("tushar");
		System.out.println("String=" + gcc.st.toString());
		gcc = null;
		System.gc();

	}

}
