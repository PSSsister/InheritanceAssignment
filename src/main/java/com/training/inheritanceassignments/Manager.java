package com.training.inheritanceassignments;

import com.training.inheritanceassignments.exceptions.InvalidInputException;

public class Manager extends Employee{
	
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	
	
	public Manager() {
		super();
	}
	public Manager(int employeeId, String employeeName, double basicSalary,double medical) throws InvalidInputException {
		super(employeeId,employeeName,basicSalary,medical);
		validateInputField(employeeId,employeeName,basicSalary,medical);
		this.petrolAllowance = 0.08*super.getBasicSalary();
		this.foodAllowance = 0.13*super.getBasicSalary();
		this.otherAllowance =0.03* super.getBasicSalary();
		netSalary();
		grossSalary();
		
	}
	public double getPetrolAllowance() {
		return petrolAllowance;
	}
	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}
	public double getFoodAllowance() {
		return foodAllowance;
	}
	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}
	public double getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	@Override
	public double grossSalary() {
	  
		double  grossSalary=super.grossSalary()+this.foodAllowance+this.otherAllowance+this.petrolAllowance;
		super.setGrossSalary(grossSalary);
		return grossSalary;
	}
	
	@Override
	public String toString() {
		return "Manager [petrolAllowance=" + petrolAllowance + ", foodAllowance=" + foodAllowance + ", otherAllowance="
				+ otherAllowance + "]";
	}
	
	@Override
	public String displayDetails()
	{
		return super.displayDetails()+", petrolAllowance=" + petrolAllowance + ", foodAllowance=" + foodAllowance + ", otherAllowance="+ otherAllowance;
    }

	@Override
    public double netSalary() {
		double netSalary=grossSalary()-(super.getPf()+super.getPt());
		return netSalary;
	}

	
	


}
