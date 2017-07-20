package com.jca1;

public class Sub {
	public static void Sub(Object obj){}
	public static void main(String[] args) {
		StringBuilder sb =  new StringBuilder("java");
		String s = sb.append("programming").substring(3);
		System.out.println(s);
	}

}
