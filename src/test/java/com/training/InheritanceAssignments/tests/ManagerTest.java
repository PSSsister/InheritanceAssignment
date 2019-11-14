package com.training.inheritanceassignments.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.inheritanceassignments.Manager;
import com.training.inheritanceassignments.exceptions.InvalidInputException;

public class ManagerTest {

	private Manager m;
	
	//setup method execute before every method
	/**
	 * @throws InvalidInputException
	 */
	@Before
	public void setup() throws InvalidInputException
	{
		m=new Manager(100,"abc",23000.0,400);
	}

	//check whether expected  manager gross salary is equal to the actual manager gross salary
	/**
	 * 
	 */
	@Test
	public void testManagerGrossSalary() {
	    double g=m.calculateGrossSalary();
	    assertEquals(40420.0,g,0.02);
		
	}
	//check whether expected Manager net salary is equal to the actual manager net salary
	/**
	 * 
	 */
	@Test
	public void testManagerNetSalary() {
	    double n=m.calculateNetSalary();
	    assertEquals(37460.0,n,0.02);
		
	}
	
	


	
}



