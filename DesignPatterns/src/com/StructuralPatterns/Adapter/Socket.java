package com.StructuralPatterns.Adapter;

public class Socket {
	
	public Volt getVolts() {
		return new Volt(120);
	}

}
