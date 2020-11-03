package com.jfs.spring.SpringAutowire;

public class B  {
	
	private int b;
	private String str;
	public B(int b, String str) {
		System.out.println("Dc in B");
		this.b = b;
		this.str = str;
	}
	@Override
	public String toString() {
		return ""+b+"\t"+str;
	}
	
	

}
