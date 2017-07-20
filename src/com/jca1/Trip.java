package com.jca1;

public class Trip {
	
	static int someInt = 10;
	  public static void changeIt(int a){
	    a = 20;
	    System.out.println(a);
	  }
	  public static void main(String[] args){
	    changeIt(someInt);
	    
	    System.out.println(someInt);
	  }

}
