package com.jca1;

public class Shark extends Fish {
		  private int numberOfFins = 8;   
		  public Shark(int age) {   
			  super(age); 
		  this.size = 4;  
		  }    
		  public void displaySharkDetails() {   
			  System.out.print("Shark with age: "+getAge());
			    System.out.print(" and "+size+" meters long");  
			    System.out.print(" with "+numberOfFins+" fins");  
		  }
		  public static void main(String[] args) {
			 // Fish s = new Shark(55); 
			  Shark s1 =  new  Shark(55);
			  s1.displaySharkDetails();
			
		}
}
