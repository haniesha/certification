package com.jca1;

public class Main {
	 private static int i = 1; 
     public static void main(String argv[]){ 
       int i = 2; 
        System.out.println(i);
        Main s = new Main (); 
        s.someMethod(); 
     } 
     public static void someMethod(){ 
        System.out.println(i); 
     } 

}
