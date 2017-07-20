package com.jca1;

public class TestClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dat d1 = new Dat(10);
	        d1.strVal = "D1";
	        Dat d2 = d1;
	        d2.intVal = 20;
	        System.out.println("d2 val = "+d2.strVal);
	}

}
