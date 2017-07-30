package com.jca1;

import java.util.StringTokenizer;

public class MyStrin {
	public static void main(String[] args) {
		String string = String.join("","Chennai","Institute","Of","Technology");
		

	String name = "Chennai Institute Of Technology";
	
	
	String college1= name.replace(" ","");
	
	
	StringBuilder college = new	StringBuilder("Chennai Institute Of Technology").replace(7,8,"").replace(16,17,"").replace(18,19,"");
    
    

System.out.println("In StringJoin="+string);
 System.out.println("In String="+college1);
 System.out.println("In StringBuilder="+college);

 
 
 
 
 
	}
}
