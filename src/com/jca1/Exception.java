package com.jca1;

public class Exception  {
	static double percent; //1
    int offset = 10, base= 50; //2
   public  void calc() {
        int coupon, offset, base; //3
        if(percent <10){ //4
            coupon = 15;
            offset = 20;
            base = 10;
            System.out.println(coupon+","+offset+","+base);
        }
	
        }   
           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Exception e = new Exception();
		  e.calc();
		  
	}
	

}
