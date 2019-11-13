package com.training.InheritanceAssignments.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.inheritanceassignments.Manager;
import com.training.inheritanceassignments.exceptions.InvalidInputException;

public class ManagerTest {

	private Manager m;
	
	//setup method execute before every method
	@Before
	public void setup() throws InvalidInputException
	{
		m=new Manager(100,"abc",23000.0,400);
	}

	//check whether expected  manager gross salary is equal to the actual manager gross salary
	@Test
	public void testManagerGrossSalary() {
	    double g=m.grossSalary();
	    assertEquals(40420.0,g,0.02);
		
	}
	//check whether expected Manager net salary is equal to the actual manager net salary
	@Test
	public void testManagerNetSalary() {
	    double n=m.netSalary();
	    assertEquals(37460.0,n,0.02);
		
	}
	
	@Test
	public void testDisplayDetails() {
		String expected="EmployeeId=100, Employee Name=abc, Basic Salary=23000.0, Hra=11500.0, Medical=400.0, PF=2760.0, PT=200.0, netSalary=31940.0, grossSalary=40420.0, petrolAllowance=1840.0, foodAllowance=2990.0, otherAllowance=690.0";
		assertEquals(expected,m.displayDetails());
	}


	
}



