package com.jca1;

public class Suji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuffer sb1 = new StringBuffer("123456");
		  // 
		 String s ="123456";
		 System.out.println(s.substring(2, 4));
		 System.out.println(s.subSequence(2, 4));
		 System.out.println(sb1.subSequence(2, 4));
		 sb1 =sb1.subSequence(2, 4);
		    sb1.deleteCharAt(3);
		    sb1.reverse();
		    System.out.println(sb1);
	}

}
