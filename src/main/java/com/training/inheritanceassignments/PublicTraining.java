package com.training.inheritanceassignments;

/**
 * @author 
 *
 */
public class PublicTraining extends Training{
	
	private int participents;
	
	/**
	 * constructor with no argument
	 */
	public PublicTraining() {
		super();
	}

	/**constructor with argument it initialize the objects
	 * @param subject
	 * @param fees
	 * @param participents
	 */
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
