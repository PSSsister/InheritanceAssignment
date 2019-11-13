package com.training.inheritanceassignments.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.inheritanceassignments.Employee;
import com.training.inheritanceassignments.Manager;
import com.training.inheritanceassignments.MarketExecutive;
import com.training.inheritanceassignments.exceptions.InvalidInputException;

public class EmployeeTest {
	
	private Employee emp;

	
	//setup method execute before every method
	
    @Before
	public void setup() throws InvalidInputException {
		emp=new Employee(106,"abc",23000,400);
	    
     }
   
    @Test
	public void testShowDetailsByPassingObjectOfManagerAsParameteInParentClass() throws InvalidInputException {
	 Employee man=new Manager(100,"abc",23000.0,400);
     String expected="EmployeeId=100, Employee Name=abc, Basic Salary=23000.0, Hra=11500.0, Medical=400.0, PF=2760.0, PT=200.0, netSalary=31940.0, grossSalary=40420.0, petrolAllowance=1840.0, foodAllowance=2990.0, otherAllowance=690.0";
     assertEquals(expected,Employee.showDetails(man));
	}
    
    @Test
	public void testShowDetailsByPassingObjectOfMarketExecutiveAsParameteInParentClass() throws InvalidInputException {
	 MarketExecutive marketExe=new MarketExecutive(100,"abc",23000.0,400,5);
	 System.out.println(Employee.showDetails(marketExe));
     String expected="EmployeeId=100, Employee Name=abc, Basic Salary=23000.0, Hra=11500.0, Medical=400.0, PF=2760.0, PT=200.0, netSalary=33465.0, grossSalary=36425.0, kilometers=5.0, tourAllowance=25.0,telephoneAllowance=1500.0,PF=2760.0, PT=200.0";
	 assertEquals(expected,Employee.showDetails(marketExe));
	}
    
    //check whether expected gross salary is equal to the actual gross salary
	@Test
	public void testGrossSalary() {
	 double grosssalary=emp.grossSalary();
	 assertEquals(34900.0,grosssalary,0.02);
	}
	
	//check whether expected nets salary is equal to the actual net salary

	@Test
	public void testNetSalary() {
        double netsalary=emp.netSalary();
		assertEquals(31940.0,netsalary,0.02);
	}
	
	
   @Test
	public void testDisplayDetails()
	{
	    String expected="EmployeeId=106, Employee Name=abc, Basic Salary=23000.0, Hra=11500.0, Medical=400.0, PF=2760.0, PT=200.0, netSalary=31940.0, grossSalary=34900.0";
		assertEquals(expected,emp.displayDetails());
	  
    }
   @Test(expected=InvalidInputException.class)
   public void testExceptions() throws InvalidInputException
   {
	  Employee emp1=new Employee(106,"abc",-45666,400);
   }

}