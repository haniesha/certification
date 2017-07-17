package com.jca1;




/**
 * @author KISHORE
 *
 */
public class Deer {
	
	 private String color; 
	 public Deer() { 
		 this("white"); 
		 } 
	 public Deer(String color) { 
		this.color = color; 
	 }
	public static void main(String[] args) {
		
		 Deer e = new Deer(); 
		 System.out.println("Color:" + e.color); 
	}
}

		  

		 
