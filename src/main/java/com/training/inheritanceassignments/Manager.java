package com.training.inheritanceassignments;

import com.training.inheritanceassignments.exceptions.InvalidInputException;

/**
 * @author pripawar
 *
 */
public class Manager extends Employee{
	
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	
	
	/**
	 * constructor with no parameter
	 */
	public Manager() {
		super();
	}
	/**
	 * @param employeeId
	 * @param employeeName
	 * @param basicSalary
	 * @param medical
	 * @throws InvalidInputException
	 */
	public Manager(int employeeId, String employeeName, double basicSalary,double medical) throws InvalidInputException {
		super(employeeId,employeeName,basicSalary,medical);
		validateInputField(employeeId,employeeName,basicSalary,medical);
		this.petrolAllowance = 0.08*super.getBasicSalary();
		this.foodAllowance = 0.13*super.getBasicSalary();
		this.otherAllowance =0.03* super.getBasicSalary();
		//netSalary();
		//grossSalary();
		
	}
	/**
	 * @return double
	 */
	public double getPetrolAllowance() {
		return petrolAllowance;
	}
	/**
	 * @param petrolAllowance
	 */
	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}
	/**
	 * @return double
	 */
	public double getFoodAllowance() {
		return foodAllowance;
	}
	/**
	 * @param foodAllowance
	 */
	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}
	/**
	 * @return double
	 */
	public double getOtherAllowance() {
		return otherAllowance;
	}
	/**
	 * @param otherAllowance
	 */
	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	@Override
	public double calculateGrossSalary() {
	  
		double  grossSalary=super.calculateGrossSalary()+this.foodAllowance+this.otherAllowance+this.petrolAllowance;
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
    public double calculateNetSalary() {
		double netSalary=calculateGrossSalary()-(super.getPf()+super.getPt());
		
		return netSalary;
	}

	
	


}
