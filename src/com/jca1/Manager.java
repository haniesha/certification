package com.jca1;

public class Manager extends Employe {
	void emp(){
		System.out.println("name");
	}
public static void main(String []args)
{
	Employe e = new Manager();
	e.emp();
	
	}
}
