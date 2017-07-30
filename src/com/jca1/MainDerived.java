package com.jca1;

public class MainDerived extends MainBase {
	void myMethod() throws RuntimeException { 
        System.out.println("Derived"); 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MainBase obj = new MainDerived(); 
         obj.myMethod(); 
     } 
		 

	}


