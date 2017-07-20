package com.jca1;

public class Koala implements CanClimb , HasClaws{
	public boolean isSharp(){
		return true;
	}

	public int maxHeight(){
		return 15;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Object	Koala  = new Koala();
	CanClimb canClimb = (CanClimb)Koala;
	HasClaws hasClaws = (HasClaws)Koala;
	System.out.println(canClimb.maxHeight());
	System.out.println(hasClaws.isSharp());
	
	
		

	}

}
