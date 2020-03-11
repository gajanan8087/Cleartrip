package com.flightbooking.rough;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RoughWork {

	public static void main(String[] args) {
		/*LocalDate date =LocalDate.now();
		System.out.println(date.getMonth());*/
		LocalDate date1=LocalDate.now().plusDays(15);
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		  String text = date1.format(formatter);
		  System.out.println(text);
		  
	}
}
