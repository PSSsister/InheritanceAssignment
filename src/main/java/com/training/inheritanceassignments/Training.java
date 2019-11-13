package com.training.inheritanceassignments;

public abstract class Training {

	private int id;
	private String subject;
	private double fees;
	
	public abstract double getOrderValue();
	
	public Training() {
		
	}
	public Training(String subject, double fees) {
		super();
	    this.subject = subject;
		this.setFees(fees);
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
