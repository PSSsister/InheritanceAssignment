package com.training.inheritanceassignments;

import com.training.inheritanceassignments.exceptions.InvalidInputException;

public class MarketExecutive extends Employee{
	
	
	private double kilometers;
	private double tourAllowance;
	private double telephoneAllowance=1500;
	
	//constructor without argument
	public MarketExecutive() {
		super();                                       //call the constructor of parent class
		// TODO Auto-generated constructor stub
	}
	
	//constructor with argument initialize the properties
	 public MarketExecutive(int employeeId, String employeeName, double basicSalary, double medical,double kilometers) throws InvalidInputException {
		super(employeeId, employeeName, basicSalary, medical);   //call the constructor of parent class
		this.kilometers=kilometers;
		this.tourAllowance=5*kilometers;
		grossSalary();
		netSalary();
		
	}
	 //getter
	public double getKilometers() {
		return kilometers;
	}
	public double getTourAllowance() {
		return tourAllowance;
	}
	//getter and setter
	public double getTelephoneAllowance() {
		return telephoneAllowance;
	}
	//getter and setter
	public void setTelephoneAllowance(double telephoneAllowance) {
		this.telephoneAllowance = telephoneAllowance;
	}
	
	//grosssalary method of MarketExecutor
	@Override
	public double grossSalary() {
		double grossSalary=super.getBasicSalary()+this.tourAllowance+this.telephoneAllowance+super.getHra()+super.getMedical();  //calculate grosssalary
		super.setGrossSalary(grossSalary);
		return grossSalary;
	}
	
	@Override
    public double netSalary() {
		double netSalary=grossSalary()-(getPt()+getPf());
		return super.netSalary();
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
