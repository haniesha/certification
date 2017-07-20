package com.jca1;

public class SwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int cardval=18;
switch(cardval)
{
case 4: case 5: case 6: case 7:case 8:
	System.out.println("hit"); break;
case 9: case 10: case 11:
	System.out.println("double");
break;
case 15: case 16:
	System.out.println("surrender"); break;
default:
	System.out.println("stand");
}
	}

}
