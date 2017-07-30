package com.jca1;

public class Main2 {
	void foo (){
	try{
	String s = null;
	 System.out.println("1");
     try {
       System.out.println(s.length());
     } catch (NullPointerException e) {
       System.out.println("inner");
     }
     System.out.println("2");
   } catch (NullPointerException e) {
     System.out.println("outer");
   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Main2 obj = new Main2();
		    obj.foo();
		
		
		
		
		
		}
		

	}


