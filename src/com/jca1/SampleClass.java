package com.jca1;

import java.rmi.NotBoundException;

public class SampleClass {
	public static void main(String[] args) {
		SampleClass sc,scA,scB;
		sc = new SampleClass();
		scA = new SampleClassA();
		scB = new SampleClassB();
		System.out.println("Hash is:"+sc);
		
	}
	  public long getHash(){
		return 444444;
	}

}	

