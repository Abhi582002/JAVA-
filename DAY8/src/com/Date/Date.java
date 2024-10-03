package com.Date;

import java.time.LocalDate;

public class Date 
{
	public static void Showdate()
	{
		LocalDate currdate = LocalDate.now();
		System.out.println("Date is:"+currdate);
	}
}
