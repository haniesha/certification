package com.jca1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al = new ArrayList();
al.add("coke");
al.add("pepsi");
al.add("miranda");
System.out.println("Total array list ::"+al);


String[] s1 = new String[al.size()];
String[] s2 = al.toArray(s1);
System.out.println("s1==s2:"+(s1==s2));
System.out.println("s1:"+Arrays.toString(s1));
System.out.println("s2:"+Arrays.toString(s2));
s1= new String[1];
s1[0] = "TestData";
s2 =al.toArray(s1);
System.out.println("s1==s2:"+(s1==s2));
System.out.println("s1:"+Arrays.toString(s1));
System.out.println("s2:"+Arrays.toString(s2));





	}

}
