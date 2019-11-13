package com.training.inheritanceassignments.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.inheritanceassignments.CorporateTraining;
import com.training.inheritanceassignments.PublicTraining;
import com.training.inheritanceassignments.Training;



public class TrainingTest {
	
	
	Training publicTraining,corporateTraining;

	
	@Before
	public void setUp() {
		 publicTraining =new PublicTraining("Java",5000,50);
		corporateTraining =new CorporateTraining("Big Data",35000,4);
	}
	
	@Test
	public void testCostOfCorporateTraining() {
		assertEquals(140000.0,corporateTraining.getOrderValue(),0.002);
		
	}
	@Test
	public void testCostOfPublicTraining() {
		assertEquals(250000.0,publicTraining.getOrderValue(),0.002);
		
	}

}
