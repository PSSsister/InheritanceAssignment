package com.training.inheritanceassignments;

import com.training.inheritanceassignments.exceptions.InvalidInputException;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	public double hra;
	private double medical;
	public double pf;
	private double pt=200;
	private double netSalary;
	private double grossSalary;
	
	//constructor without parameters
	public Employee() {
		super();
	}
	//constructor with parameter to initialize the object
	public Employee(int employeeId, String employeeName, double basicSalary,double medical) throws InvalidInputException {
		super();
		validateInputField(employeeId,employeeName,basicSalary,medical);
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra = 0.5*basicSalary;
		this.pf =0.12* basicSalary;
		this.medical=medical;
		this.grossSalary=grossSalary();
		this.netSalary=netSalary();
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getHra() {
       return hra;
	}
	
	public double getMedical() {
		return medical;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	public double getPf() {
		return pf;
		
	}
	
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getPt() {
		return pt;
	}
	public void setPt(double pt) {
		this.pt = pt;
	}
	public double netSalary() {
		this.netSalary=this.grossSalary-(this.pt+this.pf);
		return this.netSalary;
	}
	
	public double grossSalary() {
		this.grossSalary=this.basicSalary+this.hra+this.medical;
	    return this.grossSalary;
	}
	
	public String displayDetails()
	{
		String details="EmployeeId=" + employeeId + ", Employee Name=" + employeeName + ", Basic Salary=" + basicSalary
				+ ", Hra=" + hra + ", Medical=" + medical + ", PF=" + pf + ", PT=" + pt+ ", netSalary=" + netSalary
				+ ", grossSalary=" + grossSalary;

		return details;

	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", medical=" + medical + ", pf=" + pf + ", pt=" + pt + ", netSalary=" + netSalary
				+ ", grossSalary=" + grossSalary + "]";
	}
	
	public static String showDetails(Employee emp)
	{
	      return emp.displayDetails();
	}
	
	public static void validateInputField(int employeeId,String employeeName,double basicSalary,double medical) throws InvalidInputException
	{
		if(employeeName.equalsIgnoreCase(null)||employeeName.equalsIgnoreCase(" "))
		{
			throw new InvalidInputException("Please enter valid Input");
		}
		else if(basicSalary<0||employeeId<=0||medical<0)
		{
			throw new InvalidInputException("Please enter valid Input");
		}
		else
		{
			System.out.println();
		}
		
	}
}
	
	

	
	
   
	


