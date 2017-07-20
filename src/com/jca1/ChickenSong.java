package com.jca1;

import java.util.ArrayList;
import java.util.List;

public class ChickenSong {

	public static void main(String[] args)  {
		List<Chicken> list = new ArrayList<Chicken>();
		
		

		// TODO Auto-generated method stub
		HenHouse house = ()->
		{
	return list ;
		};
		 Chicken chicken = house.getChickens().get(0); 
		 for(int i=0; i<house.getChickens().size(); 
				 chicken = house.getChickens().get(i++))
		 { 
			 System.out.println("Cluck"); 
			 } 
	}

}
