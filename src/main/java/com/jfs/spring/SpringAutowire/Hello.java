package com.jfs.spring.SpringAutowire;

public class Hello {

	private A aobj;
	private B bobj;
	public void setAobj(A aobj) {
		System.out.println("setAobj()");
		this.aobj = aobj;
	}
    
	public void setBobj(B bobj) {
		System.out.println("setBobj()");
		this.bobj = bobj;
	}
	public void show()
	{
		System.out.println("show in Hello");
		System.out.println(aobj);
		System.out.println(bobj);
		
	}
	
}
