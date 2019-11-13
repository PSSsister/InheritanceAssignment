package com.training.inheritanceassignments;

public class CorporateTraining extends Training {

	private int noOfDays;
	//constructor without argument
	public CorporateTraining()
	{
		super();
	}
   //constructor with parameter to initialize the object
	public CorporateTraining(String subject,double fees,int noOfDays) {
		super(subject,fees);
		this.noOfDays = noOfDays;
	}
	//method to calculate cost of training
	public double getOrderValue()
	{
		double costOfTraining=super.getFees()*noOfDays;
		return costOfTraining;
		
	}
	
}
