package com.jca1;

public class Static {
	String name="irine";
	{
		System.out.println("loosu");
	}
	static{
		System.out.println("welcome");
	}
	Static(){
		System.out.println(name);
	}
	static void par()
	
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s = new Static();
		par();
	}
	static{
		System.out.println("bhar");
	}

}
