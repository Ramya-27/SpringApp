package com.jfs.spring.SpringAutowire;

public class A {

	private int a;
	private String msg;
	public void setA(int a) {
		System.out.println("SetA()");
		this.a = a;
	}
    public void setMsg(String msg) {
    	System.out.println("SetB()");
		this.msg = msg;
	}

    @Override
	public String toString() {
		return ""+a+"\t"+msg;
	}
	
	
}
