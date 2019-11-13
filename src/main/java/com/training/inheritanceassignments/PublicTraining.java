package com.training.inheritanceassignments;

public class PublicTraining extends Training{
	
	private int participents;
	
	public PublicTraining() {
		super();
	}

	public PublicTraining(String subject,double fees,int participents) {
		super(subject,fees);
		this.participents = participents;
	}
	
	

	public int getParticipents() {
		return participents;
	}

	public void setParticipents(int participents) {
		this.participents = participents;
	}

	public double getOrderValue()
	{
		double costOfTraining =super.getFees()*participents;
		return costOfTraining;
	}

	
	

}
