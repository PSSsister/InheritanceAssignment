package com.training.inheritanceassignments;

import com.training.inheritanceassignments.exceptions.InvalidInputException;

/**
 * @author pripawar
 *
 */
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
	
	/**
	 * constructor without parameters
	 */
	
	public Employee() {
		super();
	}
	/**
	 * @param employeeId
	 * @param employeeName
	 * @param basicSalary
	 * @param medical
	 * @throws InvalidInputException
	 */
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
		this.grossSalary=calculateGrossSalary();
		this.netSalary=calculateNetSalary();
	}
	
	/**
	 * @return int
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return 
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return double
	 */
	public double getBasicSalary() {
		return basicSalary;
	}
	/**
	 * @param basicSalary
	 */
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	/**
	 * @return double
	 */
	public double getHra() {
       return hra;
	}
	
	/**
	 * @return double
	 */
	public double getMedical() {
		return medical;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	/**
	 * @return double
	 */
	public double getPf() {
		return pf;
		
	}
	
	/**
	 * @return double
	 */
	public double getGrossSalary() {
		return grossSalary;
	}
	/**
	 * @param grossSalary
	 */
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	/**
	 * @return double
	 */
	public double getPt() {
		return pt;
	}
	/**
	 * @param pt
	 */
	public void setPt(double pt) {
		this.pt = pt;
	}
	/**
	 * @return double
	 */
	public double calculateNetSalary() {
		this.netSalary=this.grossSalary-(this.pt+this.pf);
		return this.netSalary;
	}
	
	public double calculateGrossSalary() {
		this.grossSalary=this.basicSalary+this.hra+this.medical;
	    return this.grossSalary;
	}
	
	/**
	 * @return String
	 */
	public String displayDetails()
	{
		String details="EmployeeId=" + employeeId + ", Employee Name=" + employeeName + ", Basic Salary=" + basicSalary
				+ ", Hra=" + hra + ", Medical=" + medical + ", PF=" + pf + ", PT=" + pt+ ", netSalary=" + calculateNetSalary()
				+ ", grossSalary=" + calculateGrossSalary();

		return details;

	}
	
	/**
	 * @return double
	 */
	public double getNetSalary() {
		return netSalary;
	}
	/**
	 * @param netSalary
	 */
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", medical=" + medical + ", pf=" + pf + ", pt=" + pt + ", netSalary=" + netSalary
				+ ", grossSalary=" + grossSalary + "]";
	}
	
	/**
	 * @param emp
	 * @return String
	 */
	public static String showDetails(Employee emp)
	{
	      return emp.displayDetails();
	}
	
	/**
	 * In order to validate input field
	 * @param employeeId
	 * @param employeeName
	 * @param basicSalary
	 * @param medical
	 * @throws InvalidInputException
	 */
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
	
	

	
	
   
	


