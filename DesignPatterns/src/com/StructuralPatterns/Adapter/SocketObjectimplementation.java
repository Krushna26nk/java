package com.StructuralPatterns.Adapter;

public class SocketObjectimplementation implements SocketAdapter {

	private Socket socket = new Socket();
	
	@Override
	public Volt get120Volt() {
		return socket.getVolts();
	}
	
	@Override
	
	public Volt get12Volt() {
		Volt v = socket.getVolts();
		return convertVolt(v,10);
	}
	
	@Override
	
	public Volt get3Volt() {
		Volt v =socket.getVolts();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v,int i) {
		return new Volt(v.getVolts()/i);
	}
	
}
