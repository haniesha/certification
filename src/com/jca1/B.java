package com.jca1;

public class B  implements A{
	
	
	public boolean isBlind(){
		return false;
	}

	public static void main(String[] args) {
		  A a = (A)new B(); 
		 System.out.println( a.isBlind());
		  
	}
	 

}
