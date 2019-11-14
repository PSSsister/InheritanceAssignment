package com.training.inheritanceassignments;

import com.training.inheritanceassignments.exceptions.InvalidInputException;

/**
 * @author 
 *
 */
public class MarketExecutive extends Employee{
	
	
	private double kilometers;
	private double tourAllowance;
	private double telephoneAllowance=1500;
	
	// constructor without argument
	/**
	 * 
	 */
	public MarketExecutive() {
		super();                                       //call the constructor of parent class
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param employeeId
	 * @param employeeName
	 * @param basicSalary
	 * @param medical
	 * @param kilometers
	 * @throws InvalidInputException
	 */
	//constructor with argument initialize the properties
	 public MarketExecutive(int employeeId, String employeeName, double basicSalary, double medical,double kilometers) throws InvalidInputException {
		super(employeeId, employeeName, basicSalary, medical);   //call the constructor of parent class
		this.kilometers=kilometers;
		this.tourAllowance=5*kilometers;
	
		
	}
	 //getter
	/**
	 * @return double
	 */
	public double getKilometers() {
		return kilometers;
	}
	/**
	 * @return double
	 */
	public double getTourAllowance() {
		return tourAllowance;
	}
	//getter and setter
	/**
	 * @return
	 */
	public double getTelephoneAllowance() {
		return telephoneAllowance;
	}
	//getter and setter
	/**
	 * @param telephoneAllowance
	 */
	public void setTelephoneAllowance(double telephoneAllowance) {
		this.telephoneAllowance = telephoneAllowance;
	}
	
	//calculateGrosssalary method of MarketExecutor
	@Override
	public double calculateGrossSalary() {
		double grossSalary=super.getBasicSalary()+this.tourAllowance+this.telephoneAllowance+super.getHra()+super.getMedical();  //calculate grosssalary
		super.setGrossSalary(grossSalary);
		return grossSalary;
	}
	
	@Override
    public double calculateNetSalary() {
		double netSalary=calculateGrossSalary()-(getPt()+getPf());
		return netSalary;
	}
	
	
	@Override
	public String toString() {
		return "MarketExecutive [kilometers=" + kilometers + ", tourAllowance=" + tourAllowance
				+ ", telephoneAllowance=" + telephoneAllowance + "]";
	}
	
	//showDetails method to display the details of MarketExecutive
	
	@Override
	public String displayDetails()
	{
		return super.displayDetails() + ", kilometers=" + kilometers + ", tourAllowance=" + tourAllowance+ ",telephoneAllowance=" + telephoneAllowance + ",PF=" + super.getPf() + ", PT=" + super.getPt();

		
	}
	

}
