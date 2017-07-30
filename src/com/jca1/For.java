package com.jca1;

public class For {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7},{3,3,3,3}}; 
	for(int[] mySimpleArray : myComplexArray) 
	{ 
		for(int i=0; i<mySimpleArray.length; i++) { 
			
			System.out.print(mySimpleArray[i]+"\t"); 
		}
		System.out.println(); }


	}

}
