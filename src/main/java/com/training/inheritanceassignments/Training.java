package com.training.inheritanceassignments;

/**
 * @author 
 *
 */
public abstract class Training {

	private int id;
	private String subject;
	private double fees;
	
	/**
	 * @return double
	 * abstract method
	 */
	public abstract double getOrderValue();
	
	/**
	 * constructor without parameter
	 */
	public Training() {
		
	}
	/**
	 * @param subject
	 * @param fees
	 */
	public Training(String subject, double fees) {
		super();
	    this.subject = subject;
		this.setFees(fees);
	}
	/**
	 * @return double
	 */
	public double getFees() {
		return fees;
	}
	/**
	 * @param fees
	 */
	public void setFees(double fees) {
		this.fees = fees;
	}
	/**
	 * @return int id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return String
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
