package com.training.inheritanceassignments.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.inheritanceassignments.MarketExecutive;
import com.training.inheritanceassignments.exceptions.InvalidInputException;

public class MarketExecutiveTest {
	private MarketExecutive manExe;
	
	//setup method execute before every method
	@Before
	public void setup() throws InvalidInputException
	{
	      manExe=new MarketExecutive(101,"yyy",23000.0,400,5);
	}
	
	//check whether expected  market executive gross salary is equal to the actual market executive gross salary
	@Test
	public void testMarketExecutiveGrossSalary() {
	     double d=manExe.grossSalary();
		 assertEquals(36425.0,d,0.02);
	}
    
	//check whether expected  market executive net salary is equal to the actual market executive net salary
	@Test
	public void testMarketExecutiveNetSalary() {
		 double d=manExe.netSalary();
		 assertEquals(33465.0,d,0.02);
	}
	//check whether expected Market Executive show details is equal to the actual market executive show details
	@Test
	public void testMarketExecutiveDisplayDetails() {
		String expected="EmployeeId=101, Employee Name=yyy, Basic Salary=23000.0, Hra=11500.0, Medical=400.0, PF=2760.0, PT=200.0, netSalary=33465.0, grossSalary=36425.0, kilometers=5.0, tourAllowance=25.0,telephoneAllowance=1500.0,PF=2760.0, PT=200.0";
		System.out.println(manExe.displayDetails());
	    assertEquals(expected, manExe.displayDetails());
		 
	}
}
