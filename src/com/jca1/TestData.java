package com.jca1;

public class TestData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Data d1 = new Data(10);
	        d1.strVal = "D1";
	        Data d2 = d1;
	        d2.intVal = 20;
	        System.out.println("d2 val = "+d2.strVal);
	}

}
