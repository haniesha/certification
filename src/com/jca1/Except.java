package com.jca1;

import java.io.IOException;

public class Except {
	void doSomething() throws IOException{
		
		System.out.println("hello+");
		
	}
public static void main(String[] args)  throws IOException{
	Except s = new Except();
	s.doSomething();
}
}
