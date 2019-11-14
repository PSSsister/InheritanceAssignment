package com.training.inheritanceassignments.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.inheritanceassignments.MarketExecutive;
import com.training.inheritanceassignments.exceptions.InvalidInputException;

/**
 * @author 
 *
 */
public class MarketExecutiveTest {
	private MarketExecutive manExe;
	
	/**
	 * @throws InvalidInputException
	 */
	//setup method execute before every method
	@Before
	public void setup() throws InvalidInputException
	{
	      manExe=new MarketExecutive(101,"yyy",23000.0,400,5);
	}
	
	//check whether expected  market executive gross salary is equal to the actual market executive gross salary
	/**
	 * 
	 */
	@Test
	public void testMarketExecutiveGrossSalary() {
	     double d=manExe.calculateGrossSalary();
		 assertEquals(36425.0,d,0.02);
	}
    
	//check whether expected  market executive net salary is equal to the actual market executive net salary
	/**
	 * 
	 */
	@Test
	public void testMarketExecutiveNetSalary() {
		 double d=manExe.calculateNetSalary();
		 assertEquals(33465.0,d,0.02);
	}

	
	
}
