package com.jca1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(2014,5 ,20 );
		LocalDate date2 = LocalDate.of(2014,3 ,10);
		LocalTime time1 = LocalTime.of(11, 22);
		LocalTime time2 = LocalTime.of(12, 22);
		LocalDateTime d = LocalDateTime.of(date1,time1 );
		LocalDateTime d1 = LocalDateTime.of(date2, time2);
		Period p1 = Period.between(date1, date2); 
		
		//System.out.println(d);
		Period p = Period.of(1, 2, 3);
		System.out.println(p);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(d.format(f)); 
		/*LocalDate date = LocalDate.of(2018, Month.APRIL, 30); date.plusDays(2); date.plusYears(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); 
		*/
		
		/*LocalDate date = LocalDate.of(2018, Month.APRIL, 40); 
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); 
		*/
		
		/*LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE); 
		date =date.plusDays(2); 
		//date.plusHours(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); 
		*//*List<String> one = new ArrayList<String>();
		one.add("abc"); 
		List<String> two = new ArrayList<>();
		two.add("abc"); 
		if (one == two)  
			System.out.println("A"); 
		else if (one.equals(two)) 
			System.out.println("B");
		else  
			System.out.println("C"); 
		
		*//* List<Integer> ages = new ArrayList<>(); 
		 ages.add(Integer.parseInt("5"));
		  ages.add(Integer.valueOf("6")); 
		 ages.add(7);
		 ages.add(null); 
		 for (int age : ages)
			 System.out.print(age); 
		*//*List<Integer> hex = Arrays.asList(30, 8, 10,100,20,76);
		Collections.sort(hex);; 
		System.out.println(hex);
		int x = Collections.binarySearch(hex, "8");
		int y = Collections.binarySearch(hex, "3A"); 
		int z = Collections.binarySearch(hex, "4F");
		System.out.println(x + " " + y + " " + z); 
		*//* String [] names = {"Tom", "Dick", "Harry"}; 
		 List<String> list = Arrays.asList(); 
		 list.set(0, "Sue"); 
		 System.out.println(names[0]); 
		*/ 
		
		/*int[] random = { 6, -4, 12, 0, -10 };
		int x = 0;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y); 
		*//* ArrayList<Integer> values = new ArrayList<>(); 
		 values.add(4); 
		 values.add(5); 
		 values.set(1, 6); 
		 values.remove(0); 
		 for (Integer v : values)
			 System.out.print(v); 
		*//* List<String> list = new ArrayList<String>();
		 list.add("one"); 
		 list.add("two"); 
		 list.add(7); 
		 for(String s : list)  
			 System.out.print(s); 
		*/
		/* char[]c = new char[2];  // INSERT CODE HERE 
		 int length = c.length; 
		*/ 
		/*StringBuilder b = new StringBuilder("rumble");
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1); 
		System.out.println(b); 
		*/ /*String a = ""; 
		 a += 2;  a += 'c'; 
		 a += false;  
		 if ( a == "2cfalse") System.out.println("=="); 
	if ( a.equals("2cfalse")) System.out.println("equals"); 
		*/
		
		
		/* int x = 4; 
		 long y = x * 4 - x++; 
		 if(y<10) System.out.println("Too Low"); 
		 else  System.out.println("Just right"); 
		*/// else System.out.println("Too High");  
		/* int count = 0; 
		 ROW_LOOP: for(int row = 1; row <=3; row++) 
			 for(int col = 1; col <=2 ; col++) { 
				 if(row * col % 2 == 0){
					 continue ROW_LOOP; 
				 }
		 count++; 
		 } 
		 System.out.println(count); 
*/	}

}
