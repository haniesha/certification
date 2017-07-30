package com.jca1;

public class ExceptionEx {
	public void method(Object o){
	      System.out.println("Object Version");
	   }
	   public void method(java.io.FileNotFoundException s){
	      System.out.println("java.io.FileNotFoundException Version");
	   }
	   public void method(java.io.IOException s){
	      System.out.println("IOException Version");
	   }
	   public static void main(String args[]){
		   ExceptionEx tc = new ExceptionEx();
		   int s = 12;
		   tc.method(tc);
	      tc.method(null);
	      tc.method("name");
	      tc.method(s);
	   }


}
