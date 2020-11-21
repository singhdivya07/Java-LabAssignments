package com.capgemini.lab3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Exercise9 {
public static void main(String[] args) {
	LocalDate start = LocalDate.of(1998, Month.OCTOBER , 07);
	LocalDate end = LocalDate.now();
	Period period =start.until(end);
	
	System.out.println("Days :"+period.getDays());
	System.out.println("Months :"+period.getMonths());
	System.out.println("Years :"+period.getYears());
	
	
}
}
